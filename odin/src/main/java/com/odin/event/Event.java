package com.odin.event;

import java.util.Map;

public class Event {
    private String target;
    private String method;
    private Map<String, Object> dataMap;
    private int level;
    private long execTime;

    public Event() {
    }

    public String getString(String params) {
        return (String) this.dataMap.get(params);
    }

    public <T> T getValue(String params, Class<T> clazz) {
        Object obj = this.dataMap.get(params);
        if (obj.getClass().isAssignableFrom(clazz)) {
            return (T) obj;
        } else {
            return null;
        }
    }

    public long getExecTime() {
        return execTime;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setExecTime(long execTime) {
        this.execTime = execTime;
    }

    public String getTarget() {
        return target;
    }

    public String getMethod() {
        return method;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Map<String, Object> getDataMap() {
        return dataMap;
    }

    public void setDataMap(Map<String, Object> dataMap) {
        this.dataMap = dataMap;
    }
}
