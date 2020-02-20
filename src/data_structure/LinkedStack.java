package data_structure;

public class LinkedStack {
	private Node node;
	
	public void push(Object object) {
		Node newNode = new Node();
		newNode.setObject(object);
		newNode.setNext(null);
		
		if(node == null) {
			node = newNode;
		}else {
			Node aux = node;
			while(aux.getNext() != null) {
				aux = aux.getNext();
			}
			aux.setNext(newNode);
		}
	}
	
	public boolean isEmpty() {
		return node == null;
	}
	
	public Object pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is empty!");
		}
		Object object;
		
		if(node.getNext() == null) {
			object = node.getObject();
			node = null;
		}else {
			Node aux = node;
			while(aux.getNext().getNext() != null) {
				aux = aux.getNext();
			}
			object = aux.getNext().getObject();
			aux.setNext(null);
		}
		return object;
		
	}
	
	public Object top() {
		Node aux = node;
		while(aux.getNext() != null) {
			aux = aux.getNext();
		}
		return aux.getObject();
	}
	
	public Object size() {
		if(node == null) {
			return 0;
		}
		
		int size = 1;
		Node aux = node;
		while(aux.getNext() != null) {
			aux = aux.getNext();
			size++;
		}
		
		return size;
		
	}
}
