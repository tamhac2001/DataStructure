package LinkedList;

public class LinkListApp {

	public static void main(String[] args) {
		LinkList theList = new LinkList();
		theList.insertFirst(28);
		theList.insertFirst(5);
		theList.insertFirst(2001);
		theList.displayList();
		theList.deleteFirst();
		theList.displayList();
		theList.find(28);
		theList.delelete(5);
		theList.displayList();
	}

}
