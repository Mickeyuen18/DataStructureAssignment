/**
 * Title:         ListStack.java
 * Description:   A Stack class extended from LinkedList class
 * Company:       ICT HKIVE(TY)
 * @author        Patrick Tong
 */

import java.util.EmptyStackException;

public class ListStack extends LinkedList {

    public ListStack() {    // <== constructor, different from ListStackComp.java
		super();
    }

	public boolean empty() {
	   return isEmpty();
	}

	public Object push(Object item) {
    	addToHead(item);
    	return item;
    }

	public Object pop() {
		return removeFromHead();
	}

	public Object peek() {
		return this.head.getData();
	}

	public int search(Object item) {
		if( isEmpty()) return -1;
		int index = 1;
		ListNode curr = this.head;
		do{
			if(curr.getData().equals(item)) return index;
			else {
				curr = curr.getNext();
				index++;
			}
		}while(curr!=null);

		return -1;
	}
}