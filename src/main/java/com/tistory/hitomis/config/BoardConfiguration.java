package com.tistory.hitomis.config;

import com.tistory.hitomis.jdbc.util.JDBCConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class BoardConfiguration {
    //@Bean
    public JDBCConnectionManager getJDBCConnectionManager() {
        JDBCConnectionManager manager = new JDBCConnectionManager();
        manager.setDriverClass("org.h2.Dirver");
        manager.setUrl("jdbc:h2:tcp://localhost/~/test");
        manager.setUsername("sa");
        manager.setPassword("");
        return manager;
    }
}
