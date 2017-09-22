package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
    private User myUser;

    @Before
    public void testUser() {
        myUser = new User(1, "rafael", "falconi");

    }

    @Test
    public void testFullName() {
        assertEquals("Rafael Falconi", myUser.fullName());

    }

    @Test
    public void testReverseFullName() {
        myUser = new User (1, "Juan", "Roy");
        assertEquals("Roy Juan",myUser.reverseFullName());
    }
    
    @Test
    public void testInitials() {
        assertEquals("R.", myUser.initials());

    }

}
