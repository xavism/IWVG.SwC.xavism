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
    }


    @Test
    public void testFullName() {
    		user = new User(2, name, familyName); 
        assertEquals("Xavi Sanchez", user.fullName());
    }
    
    @Test
    public void testGetters() {
    		user = new User(2, name, familyName); 
        assertEquals("Sanchez", user.getFamilyName());
        assertEquals("Xavi", user.getName());
    }

    @Test
    public void testInitials() {
    		user = new User(2, name, familyName); 
        assertEquals("X.", user.initials());
    }

}
