package com.yashasvi.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yashasvi.logger.AbstractLogger;
import com.yashasvi.logger.DBLogger;
import com.yashasvi.logger.FileLogger;
import com.yashasvi.model.LogConfig;
import com.yashasvi.model.LogLevel;
import com.yashasvi.model.Target;

public class LoggerLibrary {
    private Map<LogLevel, AbstractLogger> loggers;

    public LoggerLibrary(final String applicationName, final List<LogConfig> logConfigs) throws Exception {
        this.loggers = new HashMap<>();
        for (LogConfig logConfig : logConfigs) {
            AbstractLogger abstractLogger;
            if (Target.db.equals(logConfig.getTarget())) {
                abstractLogger = new DBLogger(applicationName, logConfig.getLogLevel(), logConfig.getTimeFormat());
            } else if (Target.file.equals(logConfig.getTarget())) {
                abstractLogger = new FileLogger(logConfig.getFileLocation(), applicationName, logConfig.getLogLevel(),
                    logConfig.getTimeFormat());
            } else {
                throw new Exception("Invalid Input Target");
            }
            loggers.put(logConfig.getLogLevel(), abstractLogger);
        }
    }

    public void log(final LogLevel logLevel, final String message) throws IOException {
        AbstractLogger logger = loggers.get(logLevel);
        logger.log(message);
    }
}
