package data_structure;

public class SpecialStack{
	private Object []array;
	private int topRed;
	private int topBlack;
	private int auxLength;
	
	public SpecialStack(int length) {
		array = new Object[length];
		topRed = -1;
		topBlack = length;
		auxLength = topBlack;
	}
	
	public boolean isEmptyRed() {
		return topRed == -1;
	}
	
	public boolean isEmptyBlack() {
		return topBlack == auxLength;
	}
	
	public void pushRed(Object object) {
		if(topRed + 1 == topBlack) {
			Object []newArray = new Object[auxLength * 2];
			for(int i = 0; i < topRed; i++) {
				newArray[i] = array[i];
			}
			for(int i = auxLength - 1; i >= topBlack; i--) {
				newArray[i] = array[--auxLength];
			}
			
			auxLength = auxLength * 2;
			array = newArray;
		}
		array[++topRed] = object;
		
	}
	
	public void pushBlack(Object object) {
		if(topBlack - 1 == topRed) {
			Object []newArray = new Object[auxLength * 2];
			for(int i = 0; i < topRed; i++) {
				newArray[i] = array[i];
			}
			for(int i = auxLength - 1; i >= topBlack; i--) {
				newArray[i] = array[--auxLength];
			}
			
			auxLength = auxLength * 2;
			array = newArray;
		}
		array[--topBlack] = object;
	}
	
	public Object popRed(){
		if(isEmptyBlack()) {
			System.out.println("A parte vermelha está vazia!");
			return -1;
		}else {
			topRed = topRed - 1;
			return array[topRed + 1];
		}
	}
	
	public Object popBlack(){
		if(isEmptyBlack()) {
			System.out.println("A parte preta está vazia!");
			return -1;
		}else {
			topBlack = topBlack + 1;
			return array[topBlack - 1];
		}
	}
	
	public Object topRed() {
		if(isEmptyRed()) {
			System.out.println("A pilha está vazia");
			return -1;
		}
		return array[topRed];
	}
	
	public Object topBlack(){
		if(isEmptyBlack()) {
			System.out.println("A pilha está vazia");
			return -1;
		}
		return array[topBlack];
	}
	
	public int sizeRed() {
		return topRed + 1;
	}
	
	public int sizeBlack() {
		return auxLength - topBlack;
	}

}










