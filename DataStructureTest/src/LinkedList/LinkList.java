package LinkedList;

public class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int data) {
		Link newLink = new Link(data);
		newLink.next = first;
		first = newLink;
	}

	public void deleteFirst() {
		if (this.isEmpty())
			System.out.println("The list is empty!");
		else
			first = first.next;
	}

	public void displayList() {
		Link curentLink = first;
		if (isEmpty())
			System.out.println("The list is empty!");
		else {
			while (curentLink != null) {
				curentLink.displayLink();
				curentLink = curentLink.next;
			}
			System.out.println();
		}

	}
}
