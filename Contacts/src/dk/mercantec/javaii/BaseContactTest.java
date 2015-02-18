package dk.mercantec.javaii;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseContactTest {

    @Test
    public void testSetPhone() throws Exception {
        String name = "";
        String phone = "";
        String email = "";
BaseContact baseContact = new BaseContact(name, phone, email);

        baseContact.setPhone("phone");
        assertEquals("phone", baseContact.getPhone());
    }

    @Test
    public void testSetEmail() throws Exception {
        String name = "";
        String phone = "";
        String email = "";
        BaseContact baseContact = new BaseContact(name, phone, email);

        baseContact.setPhone("email");
        assertEquals("email", baseContact.getPhone());
    }

    @Test
    public void testSetName() throws Exception {
        String name = "";
        String phone = "";
        String email = "";
        BaseContact baseContact = new BaseContact(name, phone, email);

        baseContact.setPhone("name");
        assertEquals("name", baseContact.getPhone());

    }
}