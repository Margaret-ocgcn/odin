package com.odin.frigg.beanregister;

import java.util.HashMap;
import java.util.Map;

public class Dict {
    public static Map<String, String> map = new HashMap<String, String>();

    public Dict() {
    }

    public void init() {
        map.put("test", "test");
    }

    public void destory() {
        map.clear();
    }

    public String getValue(String key) {
        return map.get(key);
    }
}
