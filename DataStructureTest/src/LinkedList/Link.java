package LinkedList;

public class Link {
	int data;
	Link next;
	
	public Link(int data) {
		this.data=data;
	}
	public void displayLink() {
		System.out.print("{"+this.data+"} ");
	}
}
