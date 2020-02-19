package data_structure;

public class Main {
	public static void main(String[] args) throws Exception {
		Queue fila = new Queue(2);
		fila.enqueue(1);
		fila.enqueue(2);
		fila.enqueue(3);
		fila.enqueue(4);
		fila.enqueue(5);
		fila.enqueue(6);
		fila.enqueue(7);
		fila.dequeue();
		fila.dequeue();
		System.out.println(fila.begin());
		System.out.println(fila.size());
		
	}
}
