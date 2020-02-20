package data_structure;
#Incomplete
public class LinkedQueue {
	private Node node;
	
	public void enqueue(Object object) {
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
	
	public Object dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty!");
		}
		Object object;
		
		if(node.getNext() == null) {
			object = node.getObject();
			node = null;	
		}else {
			object = node.getObject();
			Node aux = node;
			//aux.setObject(node.getNext().getObject());
			while(aux.getNext() != null) {
				aux = aux.getNext();
				aux.setObject(aux.getObject());
			}
			aux.setNext(null);
			node = aux;
		}
		
		/*
		
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
		*/
		
		return object;
	}
	
	public Object begin() {
		return node.getObject();
	}
	
}
