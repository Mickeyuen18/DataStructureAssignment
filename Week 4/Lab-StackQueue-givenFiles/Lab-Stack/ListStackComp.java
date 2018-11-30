/**
 * Title:         ListStack.java
 * Description:   A Stack class by composition using LinkedList object
 * Company:       ICT HKIVE(TY)
 * @author        Patrick Tong
 */

import java.util.EmptyStackException;

public class ListStackComp  {

	private LinkedList list;	// compose with a LinkedList object

    public ListStackComp() {   // <== constructor, different from ListStack.java
		list = new LinkedList();
    }

	public boolean empty() {
		...
	}

	public Object push(Object item) {
		....
	}

	public Object pop() {
		....
	}

	public Object peek() {
		....
	}

	public int search(Object item) {
        ....
	}

	// Provide also the toString() method (for TestStack.java)
	public String toString() {
		....
	}

}