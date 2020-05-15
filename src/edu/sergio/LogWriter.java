package edu.sergio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogWriter {
    private final String LOG_PATH = "logs/log.txt";
    private PrintWriter bufferedWriter;

    public LogWriter() {
        try {
            bufferedWriter = new PrintWriter(new FileWriter(LOG_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String message) {
        bufferedWriter.println(message);
        bufferedWriter.flush();
    }

    public void close() {
        bufferedWriter.close();
    }
}
