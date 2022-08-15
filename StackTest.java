package DataStructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    void testThatStackExist(){
        Stack stacky = new Stack();
        assertNotNull(stacky);
    }
    @Test
    void testThatStackIsBlank(){
        Stack stacky = new Stack();
        assertTrue(stacky.isEmpty());
    }
    @Test
    void testThatItemCanBeAddedToStack(){
        Stack stacky = new Stack();
        stacky.push("Life after death");
        stacky.push("Nothing is impossible");
        stacky.push("Death Race");
        assertFalse(stacky.isEmpty());
    }
    @Test
    void testStackSize(){
        Stack stacky = new Stack();
        stacky.push("Life after death");
        stacky.push("Nothing is impossible");
        stacky.push("Death Race");
        assertEquals(3,stacky.size());
    }
    @Test
    void getValueAtStackTopIndex(){
        Stack stacky = new Stack();
        stacky.push("Life after death");
        stacky.push("Nothing is impossible");
        stacky.push("Death Race");
        assertEquals("Death Race", stacky.peek());
    }
    @Test
    void testToSearchForAValueInStack(){
        Stack stacky = new Stack();
        stacky.push("Life after death");
        stacky.push("Nothing is impossible");
        stacky.push("Death Race");
        assertEquals(0, stacky.search("Life after death"));
    }
    @Test
    void testToRemoveValueInStack(){
        Stack stacky = new Stack();
        stacky.push("life after death");
        stacky.push("Nothing is impossible");
        stacky.push("Death Race");
        String victor = stacky.pop();
        assertEquals("",stacky.pop());
        assertEquals("Death Race",stacky.pop());
    }
}
