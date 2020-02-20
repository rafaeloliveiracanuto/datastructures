package data_structure;

public class Main {
	public static void main(String[] args) throws Exception {
		LinkedQueue linkedStack = new LinkedQueue();
		linkedStack.enqueue(4);
		linkedStack.enqueue(3);
		linkedStack.enqueue(2);
		linkedStack.enqueue(1);
		linkedStack.dequeue();
		linkedStack.dequeue();
		System.out.println(linkedStack.begin());
		
	}
}
