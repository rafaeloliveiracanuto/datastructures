package data_structure;

public class Main {
	public static void main(String[] args) throws Exception {
		LinkedStack linkedStack = new LinkedStack();
		Queue queue = new Queue(1);
		//System.out.println(linkedQueue.begin());
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(1);
		//queue.enqueue(6);
		//queue.dequeue();
		//queue.dequeue();
		// 3 6
		DoubleLinkedDeque dld = new DoubleLinkedDeque();
		//5 8 4 2
		dld.insertAtBegin(5);
		dld.insertAtEnd(9);
		dld.removeAtBegin();
		dld.removeAtEnd();
		dld.insertAtBegin(14);
		dld.insertAtEnd(98);
		dld.insertAtBegin(5);
		dld.insertAtEnd(8);
		dld.insertAtEnd(4);
		dld.insertAtEnd(2);
		

		System.out.println(dld.first());
	
		System.out.println(dld.last());
		
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
		//System.out.println(queue.begin());
		//System.out.println(queue.size());
		//System.out.println(linkedStack.top());
		//System.out.println(linkedStack.size());
		
	}
}
