package com.yashasvi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LogConfig {
    private Target target;
    private LogLevel logLevel;
    private String timeFormat;
    private String fileLocation;

    public LogConfig(final Target target, final LogLevel logLevel, final String timeFormat) {
        this.target = target;
        this.logLevel = logLevel;
        this.timeFormat = timeFormat;
    }
}
