package com.yashasvi.logger;

import java.util.Date;

import com.yashasvi.model.DBLogs;
import com.yashasvi.model.LogLevel;

public class DBLogger extends AbstractLogger {
    private DBLogs dbLogs;

    public DBLogger(final String applicationName, final LogLevel logLevel, final String dateFormat) {
        super(applicationName, logLevel, dateFormat);
        this.dbLogs = new DBLogs();
    }

    @Override
    public void log(final String message) {
        dbLogs.append(
            String.format("%s::%s::%s::%s", applicationName, logLevel, dateFormat.format(new Date()), message));
    }
}
