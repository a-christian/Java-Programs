package singlylinkedlistindexsearch;

/*
 *
 * @author Austin Christian
 * @date 2/6/17
 */


//Main class to display the functions
//Some methods aren't used
public class SinglyLinkedListIndexSearch {
	public static void main(String[] args) {
		SLinkedList list = new SLinkedList();
		list.addAtBegin(636);
		list.addAtBegin(173);
		list.addAtBegin(267);
		list.addAtBegin(857);
		list.addAtBegin(525);
		System.out.println(" Element at 0th Index : " + list.elementAt(0));
                System.out.println("The list looks as follow: ");
                list.display();
	}
}

//Building the node class
class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

//Bulk of the program
//methods to add to the beginning, 
//add to the end, display the current list,
//and return the value at the ith index are defined
class SLinkedList {
	public Node head;
	public int size;
	public SLinkedList() {
		head = null;
	}
	public void addAtBegin(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
		size++;
	}
        
	public void addAtEnd(int data) {
		if (head == null) {
			addAtBegin(data);
		} else {
			Node n = new Node(data);
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = n;
			size++;
		}
	}
	public int elementAt(int index){
		if(index>size){
			return -1;
		}
		Node n = head;
		while(index - 1 >= 0){
			n = n.next;
			index--;
		}
		return n.data;
	}
	
	
	public void display() {
		System.out.println("");
		Node currNode = head;
		while (currNode != null) {
			System.out.print("->" + currNode.data);
			currNode = currNode.next;
		}
	}
}