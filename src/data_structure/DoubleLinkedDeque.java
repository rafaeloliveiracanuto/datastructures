package data_structure;

public class DoubleLinkedDeque {
	private NodeD begin;
	private NodeD end;
	private int size;
	
	public DoubleLinkedDeque() {
		begin = null;
		end = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return begin == null;
	}
	
	public Object first() {
		if(isEmpty()) {
			throw new RuntimeException("O Deque está vazio!");
		}
		return begin.getObject();
	}
	
	public Object last() {
		if(isEmpty()) {
			throw new RuntimeException("O Deque está vazio!");
		}
		return end.getObject();
	}
	
	public void insertAtBegin(Object object) {
		NodeD newNode = new NodeD();
		newNode.setObject(object);
		
		if(begin == null) {
			begin = newNode;
			end = begin;
		}else {
			newNode.setNext(begin);
			begin.setPrevious(newNode);
			begin = newNode;
		}
		size++;
	}
	
	public void insertAtEnd(Object object) {
		NodeD newNode = new NodeD();
		newNode.setObject(object);
	
		if(end == null) {
			end = newNode;
			begin = end;
		}else {
			newNode.setPrevious(end);
			end.setNext(newNode);
			end = newNode;
		}
		size++;
	}
	
	public Object removeAtBegin() {
		if(isEmpty()) {
			throw new RuntimeException("O Deque está vazio!");
		}
		NodeD newNode = begin;
		begin = newNode.getNext();
		
		if(begin == null) {
			end = null;
		}else {
			begin.setPrevious(null);
		}
		
		size--;
		return newNode.getObject();
	}
	
	public Object removeAtEnd() {
		if(isEmpty()) {
			throw new RuntimeException("O Deque está vazio!");
		}
		NodeD newNode = end;
		end = end.getPrevious();
		
		if(end == null) {
			begin = null;
		}else {
			end.setNext(null);
		}
		size--;
		return newNode.getObject();
	}
	
}
