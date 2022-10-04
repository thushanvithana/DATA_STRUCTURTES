class Link{

	public int iData;//data item
	public Link next;//refernce to the next link
	
	public Link(int id){//constructor
		iData = id;
		next = null;
	}
	public void displayLink(){//display data item
		System.out.println(iData);
	}

	//insert first method
	public void insertFirst(int id){
		Link newLink  = new Link(id);
		newLink.next = first;
		first = newLink;
	}
	//deleteFirst method
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;		
	}
	
	//displayList method
	public void displayList(){
		Link current = first;
		while(current !=  null){
			current.displayDetails();
			current = current.next();
		}		
	}
}
