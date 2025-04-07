package opgave03;

import opgave03.models.Logger;
import opgave03.models.ToFile;
import opgave03.models.WebServer;

import java.io.File;

public class Opgave03 {
    public static void main(String[] args) {


        WebServer server = new WebServer(new Logger());
        server.handleRequest("Hello World", new Logger());
        server.handleRequest("", new Logger());

        server.handleRequest("Hello World", new ToFile());
    }
}
