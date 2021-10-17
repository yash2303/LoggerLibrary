package com.yashasvi;

import java.util.List;

import com.yashasvi.controller.LoggerLibrary;
import com.yashasvi.model.LogConfig;
import com.yashasvi.model.LogLevel;
import com.yashasvi.model.Target;

public class Main {

    public static void main(String[] args) {
        LoggerLibrary loggerLibrary;
        List<LogConfig> logConfigs = List.of(
            new LogConfig(Target.db, LogLevel.INFO, "dd-MM-yy"),
            new LogConfig(Target.file, LogLevel.DEBUG, "dd-MM-yy", "logFile.txt")
        );
        try {
            loggerLibrary = new LoggerLibrary("DummyApplication", logConfigs);
            loggerLibrary.logAsync(LogLevel.INFO, "Hello World Info message");
            loggerLibrary.logAsync(LogLevel.DEBUG, "Hello World Debug message");
            loggerLibrary.logAsync(LogLevel.INFO, "Hello World Info message 1");
            loggerLibrary.logAsync(LogLevel.DEBUG, "Hello World Debug message 1");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
