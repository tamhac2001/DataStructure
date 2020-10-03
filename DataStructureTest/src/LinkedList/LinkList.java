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
		Link currentLink = first;
		if (isEmpty())
			System.out.println("The list is empty!");
		else {
			while (currentLink != null) {
				currentLink.displayLink();
				currentLink = currentLink.next;
			}
			System.out.println();
		}
	}

	public void find(int data) {
		Link currentLink = first;
		while (currentLink != null) {
			if (currentLink.data == data) {
				System.out.println("Found " + data + " in list!");
				break;
			} else
				currentLink = currentLink.next;
		}
		if (currentLink == null)
			System.out.println("No " + data + " in list!");
	}

	public void delelete(int data) {
		if (isEmpty())
			System.out.println("The list is empty!");
		else {
			Link currentLink = first;
			Link previousLink = currentLink;
			while (currentLink != null) {
				if(currentLink==first && currentLink.data==data) deleteFirst();
				else if (currentLink.data == data) {
					previousLink.next = currentLink.next;
					break;
				} else {
					previousLink = currentLink;
					currentLink = currentLink.next;
				}
			}
			if (currentLink == null)
				System.out.println("No " + data + " in list!");
		}
	}
}
