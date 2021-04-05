package by.anton.array.util;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class WrongArrayLogging implements WrongArrayAction{
    private  static final String LOG_LEVEL_ERROR = "ERROR";
    private static final String LOG_MESSAGE_ARRAY_ERROR = "Array is empty or link is 'null'. array: ";
    private static Logger logger  = LogManager.getLogger(WrongArrayLogging.class);

    public void throwingArrayExceptionLog(int [] array){
        logger.log(Level.valueOf(LOG_LEVEL_ERROR), LOG_MESSAGE_ARRAY_ERROR + Arrays.toString(array));
    }
}
