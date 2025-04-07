package opgave03.models;

import java.io.File;

public class WebServer {
    private Logger logger;

    public WebServer(Logger logger) {
        this.logger = logger;
    }

    public void handleRequest(String request, RequestType requestType) {
        if (request.isEmpty()) {
            requestType.logError("Request is empty");
            return;
        }
        requestType.logInfo("Handling request: " + request);
    }
}
