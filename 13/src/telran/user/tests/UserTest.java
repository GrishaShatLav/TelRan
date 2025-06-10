package telran.user.tests;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import telran.user.model.User;


class UserTest {
    User user;
    String email ;
    String password ;


    @BeforeEach
    void setUp(){
        user = new User(email, password);
    }


    @Test
    void testCorrectEmail() {
        user.setEmail("peter@yahoo.com");
        assertEquals("peter@yahoo.com", user.getEmail());
    }

    @Test
    void testWithoutAt(){

        assertFalse(user.setEmail("peteryahoo.com"));
    }
    @Test
    void testWithAt(){
        assertTrue(user.setEmail("peter@google.com"));
    }

    @Test
    void testManyAt(){

        assertFalse(user.setEmail("peter@ya@hoo.com"));
    }


    @Test
    void testDotAfterAt(){

        assertFalse(user.setEmail("peter@yahoocom"));
    }


    @Test
    void testLastDot(){

        assertFalse(user.setEmail("peter@yahoo.com."));

        assertFalse(user.setEmail("peter@yahoo.co.m"));
    }


    @Test
    void testIncorrectSymbol(){

        assertFalse(user.setEmail("pet!er@yahoo.com"));
    }
}

