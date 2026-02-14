import java.util.*;
class FindNthElement{
    static <T> T findNthElement(LinkedList<T>list,int n){
        if (n <= 0 || n > list.size()) {
            throw new IllegalArgumentException("Invalid value of N");
        }
        Iterator<T> fast=list.iterator();
        Iterator<T> slow=list.iterator();
        for(int i=0;i<n;i++){
            fast.next();
        }
T result=null;
        while(fast.hasNext()){
            fast.next();
            result=slow.next();

        }
if(result==null){
    result=slow.next();
}
return result;

    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        System.out.println(findNthElement(list, n)); // Output: D
    }

}