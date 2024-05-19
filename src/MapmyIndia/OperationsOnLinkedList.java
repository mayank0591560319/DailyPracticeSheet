package MapmyIndia;

public class OperationsOnLinkedList {
class Node{
	int data;
	public Node(int ele) {
		data=ele;
	}
	
	Node next;
	
}
Node head;
public void  disp() {
	Node temp=head;
	while(temp!=null) {
		System.out.println(temp.data);
		
		temp=temp.next;
	}
	System.out.println();
	
}
public int sizeOfLinkedlist() {
	Node temp=head;
	int size=0;
	while(temp!=null) {
		temp=temp.next;
		size++;
	}
	return size;
	
}
public boolean isEmpty() {
	
	return sizeOfLinkedlist()==0;
}

public int getFirst() {
	Node temp=head;
	if(isEmpty()) {
		 throw new RuntimeException("Linkedlist is Empty");
	}
	return temp.data;
}
public int getLast() {
	
	if(isEmpty()) {
		throw new RuntimeException();
	}
	Node temp=head;
	while(temp!=null) {
		temp=temp.next;
	}
	return temp.data;
}
public int getAt(int index) {
	Node temp=head;
	for(int i=0;i<=index;i++) {
		temp=temp.next;
	}
	return temp.data;
	
}
public Node getAtNode(int idx) {
	if(idx>sizeOfLinkedlist() || idx<0) {
		throw new RuntimeException("Index value cannot be -ve greater than the size   ");
		
	}
	Node temp=head;
	if(isEmpty()) {
		throw new RuntimeException("Linkedlist has an empty Value");
	}
	for(int i=0;i<=idx;i++) {
		temp=temp.next;
	}
	return temp;
}
public Node getLastNode() {
	if(isEmpty()) {
		throw new RuntimeException("LinkedList has an Empty value ");
	}
	Node temp=head;
	while(temp!=null) {
		temp=temp.next;
	}
	return temp;
}
public void addLastNode(int ele) {
	Node newNode = new Node(ele);
	if (isEmpty()) {
		head = newNode;
		return;
	}
	Node last = getLastNode();
	last.next = newNode;
	
}
public void addFirstNode(int ele) {
	Node newNode=new Node(ele);
	newNode.next=head;
	head=newNode;
}
public void addAt(int idx,int ele) {
	if(idx<0 || idx>sizeOfLinkedlist()) {
		throw new RuntimeException("Out of the Threshold Value");
	}
	if(idx==0) {
		addFirstNode(ele);
	}else {
		Node before=getAtNode(idx-1);
		Node after=before.next;
		Node newNode=new Node(ele);
		newNode.next=after;
		before.next=newNode;
	}
	
}
public int removeLast() {
	if (isEmpty()) {
		throw new RuntimeException("Empty LinkedList");
	}
	if (sizeOfLinkedlist() == 1) {
		int ans = head.data;
		head = null;
		return ans;
	}
	Node secondLast = getAtNode(sizeOfLinkedlist() - 2);
	Node last = secondLast.next;
	secondLast.next = null;
	return last.data;
}
public int removeFirst() {
	if (isEmpty()) {
		throw new RuntimeException("Empty LinkedList");
	}
	int ans = head.data;
	head = head.next;
	return ans;
}
public int removeAt(int idx) {
	if (idx == 0) {
		return removeFirst();

	} else if (idx ==  - 1) {
		return removeLast();
	}
	if (idx < 0 || idx >= sizeOfLinkedlist()) {
		throw new IndexOutOfBoundsException();
	}
	Node prev = getAtNode(idx - 1);
	Node curr = prev.next;
	Node after = curr.next;

	prev.next = after;
	return curr.data;
}
public void revLinkedList() {
	Node curr = head;
	Node prev = null;
	while (curr != null) {
		Node after = curr.next;
		curr.next = prev;

		prev = curr;
		curr = after;
	}
	head = prev;
}
public void sortLinkedList(boolean ascending) {
    head = mergeSort(head, ascending);
}

private Node mergeSort(Node head, boolean ascending) {
    if (head == null || head.next == null) {
        return head;
    }
    Node middle = getMiddle(head);
    Node nextOfMiddle = middle.next;
    middle.next = null;
    Node left = mergeSort(head, ascending);
    Node right = mergeSort(nextOfMiddle, ascending);
    return sortedMerge(left, right, ascending);
}

private Node getMiddle(Node head) {
    if (head == null) {
        return head;
    }
    Node slow = head, fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}

private Node sortedMerge(Node a, Node b, boolean ascending) {
    if (a == null) {
        return b;
    }
    if (b == null) {
        return a;
    }
    Node result;
    if (ascending) {
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b, ascending);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, ascending);
        }
    } else {
        if (a.data >= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b, ascending);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next, ascending);
        }
    }
    return result;
}
}
