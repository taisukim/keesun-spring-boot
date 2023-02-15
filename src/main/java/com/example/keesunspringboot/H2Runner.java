package com.example.keesunspringboot;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
@RequiredArgsConstructor
public class H2Runner implements ApplicationRunner {

//    @Autowired
//    DataSource dataSource;
    private final DataSource dataSource;
    private final JdbcTemplate jdbcTemplate;

    // java 8 부터 try 문 안에 저렇게 넣으면 close 할 필요 없다
    @Override
    public void run(ApplicationArguments args) throws Exception {
        try(Connection connection = dataSource.getConnection()) {
            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());

            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE TUSER(ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
            statement.executeUpdate(sql);

            jdbcTemplate.execute("INSERT INTO TUSER(ID, name) VALUES(1, 'taesoo')");
        }
    }


    //close 가 필요한 코드
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Connection connection = dataSource.getConnection();
//        connection.getMetaData().getURL();
//        connection.getMetaData().getUserName();
//
//        Statement statement = connection.createStatement();
//        String sql = "CREATE TABLE USER(ID INTEGER NOT NULL, name VARCHAR(255), PRIMARY KEY (id))";
//        statement.executeUpdate(sql);
//
//        connection.close();
//    }
}
