package logger;

import org.slf4j.Logger;

public class LogbackLoggerHandler {

    public static void logMethodStart(Logger logger, String name) {
        logger.debug("Start of {}", name);
    }

    public static void logMethodEnd(Logger logger, String name) {
        logger.debug("End of {}", name);
    }

    public static void logAssertedValues(Logger logger, String actual, String expected) {
        logger.debug("Asserting expectedTitle: \"{}\" to actualTitle: \"{}\"", expected, actual);
    }

}
