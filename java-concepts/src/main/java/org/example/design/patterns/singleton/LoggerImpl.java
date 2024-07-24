package org.example.design.patterns.singleton;

/*
import org.springframework.boot.logging.LogLevel;
import java.io.*;
import java.time.LocalDateTime;

public class LoggerImpl implements Logger {

    // Singleton instance
    private static LoggerImpl logInstance;
    private PrintWriter printWriter; // PrintWriter for writing log messages to a file
    private String filePath; // Path of the log file

    // Private constructor to prevent instantiation from outside
    private LoggerImpl() {

    }

    // Logs a message with the specified log level
    @Override
    public void log(LogLevel level, String message) {
        // Check if the PrintWriter is initialized
        if(printWriter == null) {
            throw new IllegalStateException("Logger is not initialized in setLogFile()");
        }
        // Construct log message with current date and time, log level, and message content
        String logMessage = "DateTime: " + LocalDateTime.now() + " LogLevel: " + level + " Message: " + message;
        // Write log message to the log file
        printWriter.println(logMessage);
    }

    // Sets the log file path
    @Override
    public void setLogFile(String filePath) {
        try {
            // Set the file path
            this.filePath = filePath;
            // Create a PrintWriter to write to the specified file, appending if file exists
            printWriter = new PrintWriter(new FileWriter(this.filePath, true));
        } catch(IOException e) {
            // Handle IOException
            e.printStackTrace();
            System.out.println("Invalid file path.");
        }
    }

    // Returns the log file path
    @Override
    public String getLogFile() {
        return filePath;
    }

    // Flushes the PrintWriter
    @Override
    public void flush() {
        if(printWriter != null)
            printWriter.flush();
    }

    // Closes the PrintWriter
    @Override
    public void close() {
        if(printWriter != null) {
            // Close the PrintWriter
            printWriter.close();
            // Set PrintWriter to null
            printWriter = null;
        }
    }

    // Returns the singleton instance of the logger
    public static LoggerImpl getInstance() {
        if(logInstance == null) {
            synchronized(LoggerImpl.class) {
                if(logInstance == null) {
                    logInstance = new LoggerImpl();
                }
            }
        }
        return logInstance;
    }

    // Resets the singleton instance (for testing purposes)
    public static void resetInstance() {
        logInstance = null;
    }
}*/
