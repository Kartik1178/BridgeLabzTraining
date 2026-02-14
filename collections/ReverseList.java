class ReverseList{
    public static <T> void reverseList(List<T> list){
        int l=0;
        int r=list.size()-1;
        while(l<r){
            T temp=list.get(l);
            list.set(l,list.get(r));
            list.set(r,temp);
            l++;
            r--;
        }
    }
public static void main(String[] args){
        List<Integer> arraylist=new ArrayList<>(Arrays.asList(43,2,42,3));
        ReverseList.reverseList(arraylist);
        System.out.println("Arraylist displayed as "+arraylist);
        List<Integer> linkedList=new LinkedList<>(Arrays.asList(42,4,52,1));
        ReverseList/reverseList(linkedList);
        System.out.println("Linked List displayed as "+linkedList);


}



}