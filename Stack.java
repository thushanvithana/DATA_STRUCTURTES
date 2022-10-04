class StackX{
	private int maxSize;//size of stack array
	private double[] stackArray;
	private int top;
	
	public StackX(int s){
		maxSize = s; //set array size
		stacArray = new double[maxSize];
		top = -1; //number of items
			
	}
	
	
	
	
	
	//push method
	public void push(double j){
		//check weather stack is full
		if(top == maxSize-1)
			System.out.println("Stack is full");
		else
			stacArray[++top] = j;
	}
	//pop method
	public void pop(){
		//check weather stack is empty
		if(top == -1)
			return -99;
		else
			return stacArray[top--];
	}
	//peek method
	public void peek(){
		//check weather stack is empty
		if(top == -1)
			return -99;
		else
			return stacArray[top];
	}
	
	
	
	
}