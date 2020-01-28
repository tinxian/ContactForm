import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactsManagerTest {
    ContactsManager SUT;

    @Before
    public void setUp() throws Exception {
        SUT = new ContactsManager();
        SUT.friendsCount = 0;
//        contact = newContact;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addContact() {
        Contact contact = new Contact();
        System.out.println(SUT.friendsCount);

        contact.name = "Pascal";
        SUT.addContact(contact);
        int result = SUT.getFriendsCount();
        assertEquals(result, 1);

    }

    @Test
    public void searchContact() {
    }
}