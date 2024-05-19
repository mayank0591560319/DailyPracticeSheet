package MapmyIndia;

public class RunClass {
	public static void main(String[] args) {
		OperationsOnLinkedList l = new OperationsOnLinkedList();
		
		l.addFirstNode(4);
	    l.addFirstNode(2);
	    l.addFirstNode(1);
	    l.addFirstNode(3);

	   
	    System.out.print("Original list: ");
	    l.disp();

	   
	    l.sortLinkedList(true);
	    System.out.print("Sorted in ascending order: ");
	    l.disp();

	   
	    l.sortLinkedList(false);
	    System.out.print("Sorted in descending order: ");
	    l.disp();
	}
}
