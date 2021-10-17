package com.yashasvi.model;

import java.util.ArrayList;
import java.util.List;

public class DBLogs {
    private List<String> logs;

    public DBLogs() {
        this.logs = new ArrayList<>();
    }

    public void append(final String log) {
        logs.add(log);
        System.out.println("DB Logs: " + logs);
    }
}
