package com.example.keesunspringboot.account;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

// 아래의 어노테이션은 junit 아래버전이라 에러가 뜬다..
//@RunWith(SpringRunner.class)

// 아래의 어노테이션은 실제 서비스에 사용하는 DB를 사용해서 테스트를 진행하게 한다.
// @DataJpaTest 를 사용하는 이유는 임베디드 DB를 사용해야 빠르게 테스트를 진행할수 있기 때문이다.
//@SpringBootTest

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class AccountRepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountRepository accountRepository;

    @Test
    public void di(){
        Account account = new Account();
        account.setUsername("teasoo");
        account.setPassword("1234");

        Account newAccount = accountRepository.save(account);
        assertThat(newAccount).isNotNull();

        Optional<Account> existAccount = accountRepository.findByUsername(newAccount.getUsername());
        assertThat(existAccount).isNotEmpty();

        Optional<Account> nonExistAccount = accountRepository.findByUsername("keesun");
        assertThat(nonExistAccount).isEmpty();



    }

    //연결된 db정보를 보기위한 테스트?
//    @Test
//    public void di(){
//        try(Connection connection = dataSource.getConnection()){
//            DatabaseMetaData metaData = connection.getMetaData();
//            System.out.println(metaData.getURL());
//            System.out.println(metaData.getDriverName());
//            System.out.println(metaData.getUserName());
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

}