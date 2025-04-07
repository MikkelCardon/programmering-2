package opgave03.models;

public class Logger implements RequestType {
    public void logInfo(String message) {
        System.out.println(RequestType.INFO + message);
    }

    public void logError(String message) {
        System.out.println(RequestType.ERROR + message);
    }
}
