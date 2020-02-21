package data_structure;

public class LinkedQueue {
	private Node begin;
	private Node end;
	private int size;
	
	public LinkedQueue() {
		size = 0;
		begin = null;
		end = null;
	}
	
	public int size() {
		return size;
	}
	
	public void enqueue(Object object) {
		Node newNode = new Node();
		newNode.setObject(object);
		newNode.setNext(null);
		
		if(size == 0) {
			begin = newNode;
		}else {
			end.setNext(newNode);
		}
		
		end = newNode;
		size++;
	}
	
	public boolean isEmpty() {
		return begin == null;
	}
	
	public Object dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty!");
		}
		Object object = begin.getObject();
		begin = begin.getNext();
		size--;
		
		if(size == 0) {
			end = null;
		}
		
		return object;
	}
	
	public Object begin() {
		return begin.getObject();
	}
	
}
