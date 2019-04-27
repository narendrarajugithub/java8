package java8sample.core;

public class Methodreference {

	public void textMsg() {
		System.out.println("text msg");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new Thread(Methodreference::printme);
		t.start();
	}

	public static void printme() {
		
		System.out.println("method  reference");
	}
	
}
