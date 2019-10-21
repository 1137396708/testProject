package com.tedu.project;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.util.ArrayList;

@SpringBootTest
class ProjectApplicationTests {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testDataSource() throws Exception {
        System.out.println(dataSource.getConnection());
    }
    @Autowired
    private ApplicationContext ctx;
    @Test
    public void contextLoads() {
        //AnnotationConfigApplicationContext
        System.out.println(ctx);
        ArrayList<Object> list = new ArrayList<>();
    }
}
