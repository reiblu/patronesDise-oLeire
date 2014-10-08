package singleton;

import java.util.Date;

public final class Logger{
    private String logs;
    
    private static final Logger log = new Logger();

    public Logger() {
        this.clear();
    }

    public String getLogs() {
        return logs;
    }

    public void addLog(String log) {
        this.logs = this.logs + ">>> " + log + "\n";
    }

    public void clear() {
        this.logs = new Date().toString() + "\n";
    }

    public static Logger getLogger() {
        return log;
    }
}