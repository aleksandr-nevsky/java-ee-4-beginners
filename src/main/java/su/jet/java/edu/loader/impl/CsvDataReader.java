package su.jet.java.edu.loader.impl;

import su.jet.java.edu.loader.interfaces.DataReader;
import su.jet.java.edu.loader.UserData;

/**
 *
 * @author aleksandr-nevsky
 */
public class CsvDataReader implements DataReader {

    @Override
    public UserData read() {
        return new UserData(1, "Vasya csv");
    }

}