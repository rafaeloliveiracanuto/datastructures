package data_structure;

public class Main {
	public static void main(String[] args) throws Exception {
		LinkedStack linkedStack = new LinkedStack();
		Queue queue = new Queue(5);
		//System.out.println(linkedQueue.begin());
		queue.enqueue(5);
		queue.enqueue(8);
		queue.enqueue(0);
		queue.enqueue(87);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(3);
		queue.enqueue(6);
		/*
		linkedStack.push(4);
		linkedStack.push(9);
		linkedStack.push(7);
		linkedStack.push(1);
		linkedStack.pop();
		linkedStack.pop();
		linkedStack.pop();
		linkedStack.pop();
		*/
		System.out.println(queue.begin());
		System.out.println(queue.size());
		//System.out.println(linkedStack.top());
		//System.out.println(linkedStack.size());
		
	}
}
