
public class DoubleyLinkedLIstMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLInkedList d = new DoubleLInkedList();
		
		d.addFront("Hi");
		System.out.println(d.toString());
		d.addRear("Bye");
		d.addFront("NYSCAS");
		System.out.println(d);
		d.removeFront();
		System.out.println(d);
		d.addFront("Shalom");
		System.out.println(d);
		d.removeRear();
		System.out.println(d);
		d.size();
		d.isEmpty();
		
	}

}
