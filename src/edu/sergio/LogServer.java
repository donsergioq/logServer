package edu.sergio;

public class LogServer {

    public static void main(String[] args) {
        LogWriter writer = new LogWriter();
        System.out.println("Start logging");

        for (int i = 0 ; i < 10 ; i++ ) {
            writer.write("hello" + i);
        }
        writer.write(null);

        writer.close();
        System.out.println("Server shutdown");
    }
}
