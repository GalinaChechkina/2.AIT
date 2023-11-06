package practice.user_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.User;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;
    final String email="peter@gmail.com";//переменная неизменна
    final String password="12345Az!";    //переменная неизменна

    @BeforeEach
    void setUp() {
        user=new User(email,password);
    }

    @Test
    void testCorrectEmail() { //проверяем, прошел ли новый email валидацию (если прошел, то и установился)
        user.setEmail("peter@yahoo.com");//устанавливаем новый email
        assertEquals("peter@yahoo.com",user.getEmail());
    }

    @Test
    void setWithoutAt(){
        user.setEmail("peter@.yaho@.o.com");
        assertEquals(email,user.getEmail());
    }

    @Test
    void setWithoutAt1(){
        user.setEmail("peter@yahoo.com");
        assertEquals(password,user.getPassword());
    }


    @Test
    void setPassword() {
        user.setPassword("12345Az!");
    }
}