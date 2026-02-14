class RotateList{
    static T void rotateList(List<T> list,int k) {
        int n = list.size();
        k = k % n;
    reverseList(list,0,k-1);
    reverseList(list,k,n-1);
    reverseList(list,0,n-1);
    }
static <T> void reverseList(List<T> list,int start,int end){
        T temp=list.get(start);
        list.set(start,list.get(end));
        list.set(end,temp);
        start+=1;
        end-=1;
    }
public static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(4,2,5,3434,5));
        rotateList(list,3);
        System.out.println(list);
}

}