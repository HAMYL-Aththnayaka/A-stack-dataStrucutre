public class Stack05{
	int maxSize;
	int top =-1;
	int [] Stack5;
	
	Stack05(int size){
		maxSize=size;
		Stack5 = new int[maxSize];
	}
	
	public boolean isFull(){
		return top == maxSize-1;
	}
	public boolean isEmpty(){
		return top == -1;
	}
	
	public void push(int value){
		if(isFull()){
			System.out.println("The Stack is Full");
		}
		 else{
			Stack5[++top]=value;
		 }
	}
	
	public int pop(){
		int temp =-1;
		
		if(isEmpty()){
			System.out.println("The stack is Empty");
		}
		 else{
			 temp = Stack5[top];
			 top--;
		 }
		 return temp;
	}
	 public void peek(){
		 int peek = Stack5[top];
		 System.out.println(peek);
	 }
	 
	 public void Display(){
		 for (int i = 0; i <maxSize-1 ; i++){
			 System.out.println(Stack5[i]);
		 }
	 }
	 
	 
	 public static void main(String args[]){
		 Stack05 s5 = new Stack05(5);
		  s5.push(1);
		  s5.push(2);
		  s5.push(3);
		  
		  s5.pop();
		  
		  s5.peek();
		  s5.push(1212);
		  
		  s5.Display();
		 
	 }
}