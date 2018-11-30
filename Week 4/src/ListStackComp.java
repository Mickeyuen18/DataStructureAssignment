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
		return list.isEmpty();
	}

	public Object push(Object item) {
		list.addToHead(item);
		return item;
	}

	public Object pop() {
		return list.removeFromHead();
	}

	public Object peek() {
		Object curr = list.removeFromHead();
		list.addToHead(curr);
		return curr;
	}

	public int search(Object item) {
        if (empty()) return -1;
        int length = list.count();
        for(int i = 1;i <= length; i++ ){
        	if( list.get(i).equals(item)) return i;
		}
		return -1;
	}

	// Provide also the toString() method (for TestStack.java)
	public String toString() {
		return list.toString();
	}

}