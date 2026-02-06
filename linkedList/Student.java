class StudentNode{
int RollNo;
String Name;
int Age;
 char Grade;
StudentNode next;
StudentNode(int RollNo,String Name,int Age,char Grade){
    this.RollNo=RollNo;
    this.Name=Name;
    this.Age=Age;
    this.Grade=Grade;
    this.next=null;
}

}
class StudentLinkedList {
    private StudentNode head;

    void insertNodeAtBeginning(int RollNo, String Name, int Age, char Grade) {
        StudentNode newNode = new StudentNode(RollNo, Name, Age, Grade);
        newNode.next = head;
        head = newNode;
    }

    void insertNodeAtEnd(int RollNo, String Name, int Age, char Grade) {
        StudentNode newNode = new StudentNode(RollNo, Name, Age, Grade);
        while (temp.next == null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void addAtPosition(int RollNo, String Name, int Age, char Grade, int position) {
        if (position == 0) {
            insertNodeAtBeginning( int RollNo, String Name,int Age, char Grade);
        }
        StudentNode studentNode = new (RollNo, Name, Age, Grade)
        temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node out of error");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    void deleteByRollNo(int RollNo) {
        temp = head;
        if (temp.RollNo == RollNo) {
            head = head.next;
            return
        }
        while (temp != null && temp.next != RollNo) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Node not found");
            return
        }
        temp.next = temp.next.next;
        return
    }

    void searchByRollNo(int rollNo) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }
     void updateGrade(int rollNo, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }
void displayStudents(){
        if(head==null){
            System.out.println("no students to display");
            return
        }
        temp=head;
        while(temp){
           displayStudent(temp);
           temp=temp.next;
        }

}
    private void displayStudent(StudentNode student) {
        System.out.println(
                "Roll No: " + student.rollNo +
 ", Name: " + student.name + ", Age: " + student.age +
 ", Grade: " + student.grade
        );
    }

}
public class StudentRecordManagement {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        // Adding students
        list.addAtBeginning(101, "Alice", 20, 'A');
        list.addAtEnd(102, "Bob", 21, 'B');
        list.addAtEnd(103, "Charlie", 19, 'C');
        list.addAtPosition(2, 104, "David", 22, 'B');

        System.out.println("\nAll Student Records:");
        list.displayAll();

        System.out.println("\nSearching Roll No 102:");
        list.searchByRollNo(102);

        System.out.println("\nUpdating grade for Roll No 103:");
        list.updateGrade(103, 'A');

        System.out.println("\nDeleting Roll No 101:");
        list.deleteByRollNo(101);

        System.out.println("\nFinal Student Records:");
        list.displayAll();
    }
}

