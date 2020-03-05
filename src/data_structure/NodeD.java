package data_structure;

public class NodeD {
	private Object object;
	private NodeD next;
	private NodeD previous;

	public void setPrevious(NodeD previous) {
		this.previous = previous;
	}
	
	public NodeD getPrevious() {
		return previous;
	}
	
	public void setNext(NodeD next) {
		this.next = next;
	}
	
	public NodeD getNext() {
		return next;
	}
	
	public Object getObject() {
		return object;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}

}
