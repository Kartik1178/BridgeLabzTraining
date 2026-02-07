import java.util.Stack;
class SortStackUsingRecursion{

    static void sortStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;

        }
        int top =stack.pop();
        sortStack(stack);
        insertElement(stack,top);
    }
static void insertElement(Stack<Integer> stack,Stack<Integer>  top){
        if(stack.isEmpty()||stack.peek()<top){
            stack.push(top);
            return;
        }
        int peek=stack.pop();
        insertElement(stack,top);
        stack.push(peek);
}
public static void main(String[] args){

    Stack<Integer> stack = new Stack<>();

    stack.push(3);
    stack.push(1);
    stack.push(4);
    stack.push(2);

    System.out.println("Original Stack: " + stack);

    sortStack(stack);

    System.out.println("Sorted Stack:   " + stack);

}


}