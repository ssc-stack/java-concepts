package org.example.design.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private static Map<String,Student> map=new HashMap<>();

    static {
        map.put("general",new Student());
    }

    public void register(String key,Student student) {
        map.put(key,student);
    }

    public Student get(String key) {
        return map.get(key);
    }
}
