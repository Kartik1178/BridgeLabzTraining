class TaskNode{
    int ID;
    String taskName;
    int priority;
    String dueDate;
    TaskNode(int ID,String taskName,int priority,String dueDate){
        this.ID=ID;
        this.taskName=taskName;
        this.priority=priority;
        this.dueDate=dueDate;
    }
    void display(){
        System.out.println(
                "ID: " + ID +
                        ", taskName: " + taskName + ", priority: " + priority+
                        ", dueDate: " + dueDate);
        );
    }
}
class TaskScheduler{
    private TaskNode head;
    private TaskNode current;
    void addTaskAtBeginning(int ID,String taskName,int priority,String dueDate){
       TaskNode newNode=new TaskNode( ID, taskName, priority,dueDate);
       if(head==null){
           head=newNode;
           newNode.next=head;
           current = head;
           return;
       }
       TaskNode temp=head;
while(temp.next!=head){
temp=temp.next;
}
temp.next=newNode;
newNode.next=head;
head=newNode;
    }
void addTaskAtEnd(int ID,String taskName,int priority,String dueDate){
    TaskNode newNode=new TaskNode( ID, taskName, priority,dueDate);
        if(head==null){
            head=newNode;
            newNode.next=head;
        return;
        }
        TaskNode temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

}
void addTaskAtPosition(int ID,String taskName,int priority,String dueDate,int position){
        if(position<=0){
            System.out.println("Invalid position");
        }
        if(position==1){
            addTaskAtBeginning(int ID,String taskName,int priority,String dueDate);
            return;
        }
        newNode temp=head;
        for(int i=0;i<position-1&&temp.next!=head;i++){
            temp=temp.next;
        }
        if(temp==null||temp.next=head){
            System.out.println("Invalid position");
            return;
        }
    TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        newNode.next=temp.next;
        temp.next=newNode;


}
void removeById(int id) {
    TaskNode temp = head;
    TaskNode prev = null;
    do {
        if (temp == null) {
            head = current = null;
            return;
        }
        if (temp.ID == id) {
            if (temp == head) {
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                head = temp.next.next;
                return;
            }
            prev.next = temp.next;
            return;
        }
        prev = temp;
        temp = temp.next;
    }
}
void viewNextTask(){


}

}
