package by.anton.array.reader;

import by.anton.array.exception.CustomReaderException;
import by.anton.array.exception.EmptyStringException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static by.anton.array.validator.EmptyStringValidator.isEmptyString;


public class DataReader {
    private static final String WRONG_READER_EXCEPTION_MESSAGE = "Something goes wrong with tracking";
    private static final String EMPTY_ADDRESS_EXCEPTION_MESSAGE = "Address to file is empty, value: ";
    private static final String FILE_NOT_FOUND_EXCEPTION_MESSAGE = "File with such name or path hasn't been found, file name: ";
    private static final String STRINGS_SEPARATOR = " ";

    static Logger logger = LogManager.getLogger(DataReader.class);

    public String readDataFromFile(String fileAddress)
            throws CustomReaderException, EmptyStringException {
        if(isEmptyString(fileAddress)) {
            logger.log(Level.ERROR, EMPTY_ADDRESS_EXCEPTION_MESSAGE + fileAddress);
            throw new EmptyStringException(EMPTY_ADDRESS_EXCEPTION_MESSAGE);
        }
        Path path = Paths.get(fileAddress);

        if(!Files.exists(path)) {
            logger.log(Level.ERROR, FILE_NOT_FOUND_EXCEPTION_MESSAGE + fileAddress);
            throw new CustomReaderException(FILE_NOT_FOUND_EXCEPTION_MESSAGE);
        }

        List<String> data;
        String result;
        try(Stream<String> strings = Files.newBufferedReader(path).lines()) {
            data = strings.collect(Collectors.toList());
            result = String.join(STRINGS_SEPARATOR, data);
        } catch (IOException e) {
            logger.log(Level.ERROR, WRONG_READER_EXCEPTION_MESSAGE);
            throw new CustomReaderException(WRONG_READER_EXCEPTION_MESSAGE, e);
        }
        return result;
    }


}
