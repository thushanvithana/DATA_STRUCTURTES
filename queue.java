
//QUEUE/////QUEUE/////QUEUE/////QUEUE/////QUEUE/////QUEUE/////QUEUE//
class QueueX{
	private int maxSize;	// size of the array
	private int[] queArray;
	private int front;		//front of the queue
	private int rear; 		//rear of the queue
	private int nItems; 	//number of items int queue
	   
	public QueueX(int s){
		maxSize = s;	//set array size
		queArray = new int[maxSize]; 
		front = 0;
		rear = -1;
		nItems = 0; // number of items
	}
	//insert method
	public void insert(int j){
		if(rear == maxSize-1)
			System.out.println("Queue is full);
		else{
			queArray[++rear] = j;// increment rear and insert item
			nItems++;
		}
	}
	//remove method
	public int remove(){
		if(nItems == 0){ //check weather queue is empty
			System.out.println("Queue is empty");
			return -99;
		}
		else{
			nItems --;
			return queArray[front++]; // access item and increment front
		}
	}
	//peak method
	public int peakFront(){
		if(nItems == 0){ //check weather queue is empty
			System.out.println("Queue is empty");
			return -99;
		}
		else{
			return queArray[front]; // access item
		}
	}
	//insert//circular queue/////////
	public void insert(int j){
		if(nItems == maxSize){
			System.out.println("Queue is full");
		}
		else{
			
			if(rear == maxSize-1  )
				rear = -1;
			
			queArray[++rear] = j;
			nItems++;
		}
	}
	//remove//circular queue/////////
	public void remove(){
		if(nItems ==0){
			Sysstem.out.println("Queue is empty");
		}
		else{
			int temp = queArray[front++];
			
			if(front == maxSize)
				front =0;
			
			
			nItems++;
			return temp;
		}
	}
}

