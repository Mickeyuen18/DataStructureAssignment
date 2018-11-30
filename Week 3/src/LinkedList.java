class ListNode {
	private Object data;
	private ListNode next;

	public void setNext(ListNode next) {
		this.next = next;
	}

	public ListNode(Object o) { data = o; next = null; }
	public ListNode(Object o, ListNode nextNode)
		{ data = o; next = nextNode; }
	public Object getData() { return data; }
	public ListNode getNext() { return next; }
} // class ListNode

class EmptyListException extends RuntimeException {
	public EmptyListException () { super ("List is empty"); }
} // class EmptyListException

class LinkedList {
	private ListNode head;
	private ListNode tail;
	public LinkedList() { head = tail = null; }
	public boolean isEmpty() { return head == null; }
	public void addToHead(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else
			head = new ListNode(item, head);
	}
	public ListNode getTail(){
		return tail;
	}
	public ListNode getHead(){
		return head;
	}
	public void addToTail(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else
			tail = getTail();
			tail = new ListNode(item);
	}
	public Object removeFromHead() throws EmptyListException {
		if(isEmpty()) throw new EmptyListException();
		Object temp = head.getData();
		if(head == tail){
			head = tail = null;
		} else {
			// head != null
			head = head.getNext();
		}
		return temp;
	}
	public Object removeFromTail() throws EmptyListException {
		if(isEmpty()) throw new EmptyListException();
		Object temp = tail.getData();
		if(head == tail){
			head = tail = null;
		} else {
			ListNode curr = this.head;
			while(curr.getNext()!=this.tail);
			curr.setNext(null);
			this.tail = curr;
		}
		return temp;
	}
	public String toString () {
		String s = "[ ";
		ListNode current = head;
		while (current != null) {
			s += current.getData() + " ";
			current = current.getNext();
		}
		return s + "]";
	}
} // class LinkedList
