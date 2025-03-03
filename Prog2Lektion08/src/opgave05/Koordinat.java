package opgave05;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Koordinat extends Application {
    private GraphicsContext gc;
    private final static Canvas canvas = new Canvas(400,400);

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.WHITESMOKE);

        gc = canvas.getGraphicsContext2D();

        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);
        root. getChildren().add(canvas);


        Point2D A = new Point2D(0, 0);
        Point2D B = new Point2D(100, 100);
        reverse(A, B);

        Point2D C = new Point2D(50, 200);
        Point2D D = new Point2D(100, 100);
        reverse(C, D);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void reverse(Point2D A, Point2D B) {
        int xCanvas = (int) canvas.getWidth();
        int yCanvas = (int) canvas.getHeight();

        gc.strokeLine(A.getX(), yCanvas-A.getY(), B.getX(), yCanvas-B.getY());
    }


}
