package data_structure;

public class LinkedStack {
	private Node top;
	private int size;
	
	public LinkedStack() {
		top = null;
		size = 0;
	}
	
	public void push(Object object) {
		Node newNode = new Node();
		
		newNode.setObject(object);
		newNode.setNext(top);
		
		top = newNode;
		size++;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public Object pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty!");
		}
		
		Object object = new Object();
		object = top.getObject();
		
		top = top.getNext();
		size--;
		
		return object;
	}
	
	public Object top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack is empty!");
		}
		
		return top.getObject();
	}
	
	public int size() {
		return size;
	}
}
