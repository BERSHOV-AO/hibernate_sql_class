package ru.netology.hibernate.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;


@SpringBootApplication
public class Runner implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Runner.class);
        application.run(args);
    }

    @Override
    public void run(String... args) throws SQLException {
//        Map<String, Object> params = new HashMap<>();
//        params.put("firstName", "Maria");
//        params.put("id", 2);
//        List<Students> students = namedParameterJdbcTemplate.query(
//                "select* from netology.users where name = :firstName",
//                params,
//                (rs, rowNum) -> {
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            int age = rs.getInt("age");
//            String address = rs.getString("address");
//            return new Students(id, name, age, address);
//        });
//
//        students.forEach(System.out::println);
//
//        jdbcTemplate.execute(String.format("insert into netology.students (id, name, age, address, surename) values(%d, '%s', %d, '%s', '%s')", 7, "Роман", 36, "Москва", "Иванов"));


//        List<Students> students = jdbcTemplate.query(
//                String.format("select* from netology.users where id=%d and age=%d and ", 5, 4),
//
//                (resultSet, rowNum) -> {
//            System.out.println("Номер строчки, на которой находится курсор: " + rowNum);
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            int age = resultSet.getInt("age");
//            String address = resultSet.getString("address");
//            return new Students(id, name, age, address);
//        });
//        students.forEach(System.out::println);
//

//        students.forEach(System.out::println);
//
//        students.forEach(System.out::println);
//        List<Students> students = jdbcTemplate.query("select* from netology.students", (resultSet, rowNum) -> {
//            int id = resultSet.getInt("id");
//            String name = resultSet.getString("name");
//            int age = resultSet.getInt("age");
//            String address = resultSet.getString("address");
//            return new Students(id, name, age, address);
//        });

//        students.forEach(System.out::println);
//        List<Students> students = jdbcTemplate.query("select * from netology.students where name = ? and id = ?", (rs, rowNum) -> {
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            int age = rs.getInt("age");
//            String address = rs.getString("address");
//            return new Students(id, name, age, address);
//        }, "Игорь", 3);
////
////
//        students.forEach(System.out::println);


//        Map<String, Object> map = new HashMap<>();
//        map.put("firstName", "Игорь");
//        map.put("id", 2);
//        List<Students> students = namedParameterJdbcTemplate.query(
//                "select* from netology.students where name = :firstName and id = :id",
//                map,
//                (rs, rowNum) -> {
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            int age = rs.getInt("age");
//            String address = rs.getString("address");
//            return new Students(id, name, age, address);
//        });
//
//        students.forEach(System.out::println);
    }
}


