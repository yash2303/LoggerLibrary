package com.yashasvi.model;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class DBLogs {
    private Queue<String> logs;

    public DBLogs() {
        this.logs = new ConcurrentLinkedDeque<>();
    }

    public void append(final String log) {
        logs.add(log);
        System.out.println("DB Logs: " + logs);
    }
}
