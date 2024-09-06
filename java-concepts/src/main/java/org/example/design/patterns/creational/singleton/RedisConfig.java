/* Singleton Design Pattern */

package org.example.design.patterns.creational.singleton;

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

    // Double-Checked Locking - More Efficient [ can use only synchronized keyword at method level but that will be inefficient ]
    public static RedisConfig getInstance() {
        if (INSTANCE == null) {
            synchronized (RedisConfig.class) {
                if (INSTANCE == null) {
                    INSTANCE = new RedisConfig("localhost", "redis", "strong", 3329);
                }
            }
        }
        return INSTANCE;
    }

}
