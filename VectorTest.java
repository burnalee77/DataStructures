package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {
    @Test
    void testThatListIsBlank(){
        Vector gamers = new Vector();
        assertTrue(gamers.isEmpty());
    }
    @Test
    void testThatAnItemCanBeAdded(){
        Vector gamers = new Vector();
        gamers.add("Call Of Duty");
        assertFalse(gamers.isEmpty());
    }
    @Test
    void testThatMultipleItemsCanBeAdded(){
        Vector gamers = new Vector();
        gamers.add("Tomb Raider");
        gamers.add("GTA");
        gamers.add("Tekken 3");
        gamers.add("Fifa 2022");
        assertFalse(gamers.isEmpty());
    }
    @Test
    void testGetMultipleItemByIndex() {
        Vector gamers = new Vector();
        gamers.add("Tomb Raider");
        gamers.add("GTA");
        gamers.add("Tekken 3");
        gamers.add("Fifa 2022");
        assertEquals("Tomb Raider", gamers.get(0));
        assertEquals("Gta", gamers.get(1));
        assertEquals("Tekken 3", gamers.get(2));
        assertEquals("Fifa 2022", gamers.get(3));
    }
    @Test
    void testThatItemCanBeRemoved(){
         Vector gamers = new Vector();
         gamers.add("Tomb Raider");
         gamers.add("GTA");
         gamers.add("Tekken 3");
         gamers.add("Fifa 2022");
         gamers.remove(0);
         assertEquals(null, gamers.get(0));
    }
}
