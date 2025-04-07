package opgave03.models;

import java.time.LocalDate;
import java.time.LocalTime;

public interface RequestType {
    String INFO = "[" + LocalDate.now() + "][" + LocalTime.now() + "][INFO] ";
    String ERROR = "[" + LocalDate.now() + "][" + LocalTime.now() + "][ERROR] ";

    void logInfo(String message);

    void logError(String message);
}
