package es.upm.miw.forge.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class UserTest {
	
    private String name;

    private String familyName;
    
    private User user;

    @Before
    public void before() {
        name = "xavi";
        familyName = "sanchez";
        user = new User(name, familyName);
    }


    @Test
    public void testFullName() {
        assertEquals("Xavi Sanchez", user.fullName());
    }
    
    @Test
    public void testGetters() {
        assertEquals("Sanchez", user.getFamilyName());
        assertEquals("Xavi", user.getName());
    }

    @Test
    public void testInitials() {
        assertEquals("X.", user.initials());
    }
    
    @Test
    public void testNameToUpperCase() {
        assertEquals("XAVI", user.nameToUpperCase());
    }

}
