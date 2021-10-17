package com.yashasvi.logger;

import java.io.IOException;
import java.text.SimpleDateFormat;

import com.yashasvi.model.LogLevel;

public abstract class AbstractLogger {
    protected String applicationName;
    protected LogLevel logLevel;
    protected SimpleDateFormat dateFormat;

    public AbstractLogger(final String applicationName, final LogLevel logLevel, final String dateFormat) {
        this.applicationName = applicationName;
        this.logLevel = logLevel;
        this.dateFormat = new SimpleDateFormat(dateFormat);
    }

    public abstract void log(final String message) throws IOException;
}
