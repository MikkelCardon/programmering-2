package opgave05.application;

import javafx.beans.property.StringProperty;
import javafx.scene.input.MouseButton;
import opgave05.application.model.Board;
import opgave05.application.model.Point;

import java.util.ArrayList;

public class Controller {
    private static Board board = new Board(9, 10);
    private static ArrayList<Point> placedFlags = new ArrayList<>();

    public static void handle(Point point, MouseButton button) {
        if (button == MouseButton.SECONDARY && board.getField(point).equals(" ")) {
            board.setField(point, "F");
            board.setRemainingMinesPropertyMinusOne();
            if (!placedFlags.contains(point)) placedFlags.add(point);
            isGameWon();
            return;
        } else if (button == MouseButton.SECONDARY && board.getField(point).equals("F")){
            board.setField(point, " ");
            board.setRemainingMinesPropertyPlusOne();
            if (placedFlags.contains(point)) placedFlags.remove(point);
        } else if (button == MouseButton.PRIMARY && !board.getField(point).equals("F")) {
            if (board.getIsMine(point)){
                board.setField(point, "M");
                return;
            }
            else{
                getBombsHelper(point.getX(), point.getY());
            }

        }
    }

    private static int[][] locations = {
            {-1, -1},
            {-1, 0},
            {-1, 1},
            {0, 1},
            {1, 1},
            {1, 0},
            {1, -1},
            {0, -1},
    };
    private static boolean firstClick = true;

    private static void getBombsHelper(int x, int y) {
        int count = retunNumberOfBombs(x, y);


        if (count == 0 || firstClick){
            board.setField(x, y, String.valueOf(count));
            for (int i = 0; i < locations.length; i++) {
                int xTemp = x + locations[i][0];
                int yTemp = y + locations[i][1];

                if (xTemp > 8 || xTemp < 0 || yTemp > 8 || yTemp < 0){
                    continue;
                }
                firstClick = false;
                if (board.getField(xTemp, yTemp).get().equals(" ") && !board.getIsMine(xTemp, yTemp)){
                    getBombsHelper(xTemp, yTemp);
                }
            }

        }
        else{
            board.setField(x, y, String.valueOf(count));
        }
    }

    private static int retunNumberOfBombs(int x, int y){
        int count = 0;

        for (int i = 0; i < locations.length; i++) {
            int xTemp = x + locations[i][0];
            int yTemp = y + locations[i][1];

            if (xTemp > 8 || xTemp < 0 || yTemp > 8 || yTemp < 0){
                continue;
            }
            count += board.getIsMine(xTemp, yTemp) ? 1 : 0;
        }

        return count;
    }



    public static StringProperty getField(int x, int y) {
        return board.getField(x, y);
    }

    public static Board getBoard() {
        return board;
    }

    public static void isGameWon(){
        if (placedFlags.size() != 10) return;
        boolean[][] mines = board.getIsMine();


        for (int i = 0; i < placedFlags.size(); i++) {
            Point point = placedFlags.get(i);
            if (!(mines[point.getX()][point.getY()])){
                return;
            }
        }
        System.out.println("DU HAR VUNDET!!!!");
    }
}
