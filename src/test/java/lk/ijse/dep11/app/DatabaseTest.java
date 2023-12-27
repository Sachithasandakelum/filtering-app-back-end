package lk.ijse.dep11.app;

import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DatabaseTest {

    private Connection connection;

    @BeforeEach
    void setUp() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dep11_filtering_app");
    }

    @AfterEach
    void tearDown() throws Exception {
        connection.close();
    }

    @Order(1)
    @Test
    void testDBExceed1000Records(){
        System.out.println("test1");
    }

    @Order(2)
    @Test
    void testValidContactNumbers(){
        System.out.println("test2");
    }

    @Order(3)
    @Test
    void testUniqueContactNumbers(){
        System.out.println("test3");
    }

    @Order(4)
    @Test
    void testUniqueCustomerNames(){
        System.out.println("test4");
    }


}
