package org.example.design.patterns.singleton;

public class RedisConfig {
    private String url;
    private String username;
    private String password;
    private int port;

    private static RedisConfig INSTANCE=null;

    private RedisConfig(String url, String username, String password, int port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.port = port;
    }

    public static RedisConfig getInstance() {
        if(INSTANCE== null) {
            INSTANCE=new RedisConfig("localhost","redis","strong",3329);
        }
        return INSTANCE;
    }

}
