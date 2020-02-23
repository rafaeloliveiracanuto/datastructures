package data_structure;
//Remade
public class Queue {
	private Object []array;
	private int begin;
	private int end;
	private int amount;
	private int auxLength;
	
	public Queue(int length) {
		array = new Object[length];
		begin = 0;
		end = 0;
		amount = 0;
		auxLength = length;	
	}
	
	public boolean isEmpty() {
		return amount == 0;
	}
	
	public int size() {
		return amount;
	}
	
	public void doubleCapacity() {
		Object []newArray = new Object[auxLength * 2];
		
		if(begin == end) {
			int aux = 0;
			
			for(int i = begin; i < auxLength; i++) {
				newArray[aux] = array[i];
				aux++;
			}
			
			for(int i = 0; i < end; i++) {
				newArray[aux] = array[i];
				aux++;
			}
			
			begin = 0;
			end = amount;
		}else {
			for(int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
		}
		auxLength = auxLength * 2;
		array = newArray;
	}
	
	public void enqueue(Object object){
		if(amount == array.length){
			doubleCapacity();
		}
		array[end] = object;
		end = (end + 1) % auxLength;
		amount++;
	}
	
	public Object dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty!");
		}else {
			Object object = new Object();
			object = array[begin];
			begin = (begin + 1) % auxLength;
			amount--;
			return object;
		}
	}
	
	public Object begin() {
		return array[begin];
	}
	
	
}
