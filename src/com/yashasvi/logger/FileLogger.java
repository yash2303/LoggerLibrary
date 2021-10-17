package com.yashasvi.logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import com.yashasvi.model.LogLevel;

public class FileLogger extends AbstractLogger {
    private final String filePath;
    private final BufferedWriter fileWriter;
    public FileLogger(final String filePath, final String applicationName, final LogLevel logLevel, final String dateFormat)
        throws IOException {
        super(applicationName, logLevel, dateFormat);
        this.filePath = filePath;
        this.fileWriter = new BufferedWriter(new FileWriter(filePath));;
    }

    @Override
    public void log(final String message) throws IOException {
        String logMessage = String.format("%s::%s::%s::%s", applicationName, logLevel, dateFormat.format(new Date()), message);
        fileWriter.append(logMessage);
        fileWriter.newLine();
        fileWriter.flush();
    }
}
