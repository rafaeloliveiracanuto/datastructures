package data_structure;

public class Queue {
	private Object []array;
	private int begin;
	private int end;
	private int auxLength;
	
	public Queue(int length) {
		array = new Object[length];
		begin = 0;
		end = 0;
		auxLength = length;	
	}
	
	public boolean isEmpty() {
		return begin == end;
	}
	
	public int size() {
		return (auxLength - begin + end) % auxLength;
	}
	
	public void enqueue(Object object){
		if(size() == auxLength - 1){
			int aux = begin;
			int aux2 = end;
			Object []newArray = new Object[auxLength * 2];
			for(int i = 0; i < auxLength; i++) {
				newArray[i] = array[begin];
			}
			auxLength = auxLength * 2;
			array = newArray;
		}
		array[end] = object;
		end = (end + 1) % auxLength;	
	}
	
	public Object dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty!");
		}else {
			Object object = new Object();
			object = array[begin];
			begin = (begin + 1) % auxLength;
			return object;
		}
	}
	
	public Object begin() {
		return array[begin];
	}
	
	
}
