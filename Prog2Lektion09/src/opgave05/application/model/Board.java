package opgave05.application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.Random;

public class Board {
    private StringProperty[][] board;
    private boolean[][] isMine;
    private IntegerProperty remainingMines = new SimpleIntegerProperty();

    public Board(int size, int numberOfMines) {
        remainingMines.set(numberOfMines);
        board = new StringProperty[size][size];
        for (int outer = 0; outer < size; outer++) {
            for (int inner = 0; inner < size; inner++) {
                board[inner][outer] = new SimpleStringProperty();
                board[inner][outer].set(" ");
            }
        }
        isMine = new boolean[size][size];
        Random random = new Random();
        while (numberOfMines > 0) {
            int x = random.nextInt(size);
            int y = random.nextInt(size);
            if (!isMine[x][y]) {
                isMine[x][y] = true;
                numberOfMines--;
            }
        }
        printMines();
    }

    public StringProperty getField(int x, int y) {
        return board[x][y];
    }

    public IntegerProperty getRemainingMinesProperty() {
        return remainingMines;
    }

    public void setRemainingMinesPropertyPlusOne() {
        int value = remainingMines.getValue() + 1;
        remainingMines.setValue(value);
    }
    public void setRemainingMinesPropertyMinusOne() {
        int value = remainingMines.getValue() - 1;
        remainingMines.setValue(value);
    }



    public String getField(Point point) {
        return board[point.getX()][point.getY()].get();
    }

    public void setField(Point point, String value) {
        board[point.getX()][point.getY()].set(value);
    }
    public void setField(int x, int y, String value) {
        board[x][y].set(value);
    }



    public boolean getIsMine(Point point){
        return isMine[point.getX()][point.getY()];
    }
    public boolean getIsMine(int x, int y){
        return isMine[x][y];
    }

    public void printMines(){
        for (int outer = 0; outer < isMine.length; outer++) {
            for (int inner = 0; inner < isMine.length; inner++) {
                System.out.print(isMine[inner][outer]+ " ");
            }
            System.out.println();
        }
    }

    public void printValues(){
        for (int outer = 0; outer < isMine.length; outer++) {
            for (int inner = 0; inner < isMine.length; inner++) {
                System.out.print(board[inner][outer]+ " ");
            }
            System.out.println();
        }
    }

    public boolean[][] getIsMine() {
        return isMine;
    }
}
