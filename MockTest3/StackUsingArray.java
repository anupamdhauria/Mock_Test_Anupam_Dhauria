/*Implement a stack using an array in Java.
 Include the necessary methods such as push, pop, and isEmpty.
*/

class Stack{
    private int top=-1;
    private int maxSize;
    private int [] stackArray;

    public Stack(int size){
        this.maxSize=size;
        stackArray=new int[maxSize];
        top=-1;
    }

    public void push(int ele){
        if(top==maxSize-1){
            System.out.println("stack is full .cannot push new element");
        }else{
            stackArray[++top]=ele;
            System.out.println(ele+ " pushed to the stack");
        }
    }

    public int  pop(){

        if(isEmpty()){
            System.out.println("stack is empty.cannot poped element");
            return -1;
        }
        return stackArray[top--];
          
        
    }
    public boolean isEmpty(){
        return(top==-1);
    }
}
public class StackUsingArray{
    public static void main(String[] args) {
        Stack stack = new Stack(4);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        while (!stack.isEmpty()) {
            System.out.println("poped element: "+stack.pop());
        }
    }
}