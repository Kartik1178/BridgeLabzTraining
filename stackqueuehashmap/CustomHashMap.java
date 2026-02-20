/* class for creating the node in each buck */
class Node{
    int key;
    int value;
    Node next;
    Node(int key,int value){
        this.key=key;
        this.value=value;
        this.next=null;
    }
}
/* class for implementing the custom made hashmap*/
class CustomHashMap{
    private int SIZE=10;
    private Node[] buckets;
    CustomHashMap(){
        buckets=new Node[SIZE];
    }
    private int hash(int key){
        return key%SIZE;
    }
public void put(int key,int value){
        int index=hash(key);
        Node head=buckets[index];
        if(head==null){
            buckets[index]=new Node(key,value);
            return;
        }
        Node current=new Node(key,value);
        while(current!=null){
            if(current.key=key){
                current.value=value;
                return;
            }
            if(current.next==null){
                break;
            }
    current=current.next;
        }
current.next=new Node(key,value);

}
public void int get(int key){
        int index=hash(key);
        Node current=buckets[index];
        while(current!=null){
            if(current.key==key){
                return current.value;
            }
            current=current.next;
        }


        return -1;
    }

    public void remove(int key){
        int index=hash(key);
        Node current=buckets[index];
        Node prev=null;
        while(current!=null){


            if(current.key==key){
                if(prev==null){
                    buckets[index]=current.next;
                }
                else {
                    prev.next = current.next;
                }
            return;
            }
            prev=current;
            current=current.next;
        }
    }
    //main method for testing
    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap();

        // Insert values
        map.put(1, 10);
        map.put(11, 20); // collision with key 1
        map.put(2, 30);

        // Retrieve values
        System.out.println(map.get(1));   // 10
        System.out.println(map.get(11));  // 20
        System.out.println(map.get(2));   // 30

        // Remove a key
        map.remove(1);

        // After removal
        System.out.println(map.get(1));   // -1
        System.out.println(map.get(11));  // 20
    }
}