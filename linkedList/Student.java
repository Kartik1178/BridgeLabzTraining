/*
 * Singly Linked List based Student Record Management System
 * Each node stores student details and a reference to the next node
 */
class StudentNode {
    int roll;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int roll, String name, int age, char grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

/*
 * Manages student records using singly linked list
 */
class StudentList {

    private StudentNode head;

    // Add at beginning
    void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode node = new StudentNode(roll, name, age, grade);
        node.next = head;
        head = node;
    }

    // Add at end
    void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode node = new StudentNode(roll, name, age, grade);
        if (head == null) {
            head = node;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }

    // Delete by roll number
    void deleteByRoll(int roll) {
        if (head == null) return;

        if (head.roll == roll) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.roll != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    // Search student
    void search(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade
    void updateGrade(int roll, char grade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = grade;
                return;
            }
            temp = temp.next;
        }
    }

    // Display all students
    void display() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.roll + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addAtBeginning(1, "Alice", 20, 'A');
        list.addAtEnd(2, "Bob", 21, 'B');
        list.display();
        list.updateGrade(2, 'A');
        list.search(2);
    }
}
