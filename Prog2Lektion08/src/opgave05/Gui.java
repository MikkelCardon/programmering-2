package opgave05;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Gui extends Application {
    private GraphicsContext gc;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.WHITESMOKE);

        final Canvas canvas = new Canvas(400,400);
        gc = canvas.getGraphicsContext2D();


        gc.setLineWidth(1);
        gc.setStroke(Color.BLACK);
        root. getChildren().add(canvas);
        Point2D pointA = new Point2D(50, 350);
        Point2D pointB = new Point2D(350, 350);
        double height = 300 * Math.sqrt(3) / 2;
        Point2D pointC = new Point2D(200, 350 - height);
        drawTriangle(pointA, pointB, pointC, 5);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private Point2D midPoint(Point2D A, Point2D B){
        return new Point2D((A.getX()+B.getX())/2,(A.getY()+B.getY())/2 );
    }

    private void drawTriangle(Point2D pointA, Point2D pointB, Point2D pointC, int count) {
        if (count == 0){
            return;
        }
        drawLine(pointA, pointB);
        drawLine(pointA, pointC);
        drawLine(pointB, pointC);

        Point2D midAC = midPoint(pointA, pointC);
        Point2D midBC = midPoint(pointB, pointC);
        Point2D midAB = midPoint(pointA, pointB);

        drawTriangle(pointA,midAB,midAC, count-1);
        drawTriangle(midAB, pointB, midBC, count-1);
        drawTriangle(midAC, midBC, pointC, count-1);

    }

    private void drawLine(Point2D pointA, Point2D pointB) {
        gc.strokeLine(pointA.getX(), pointA.getY(), pointB.getX(), pointB.getY());
    }
}
