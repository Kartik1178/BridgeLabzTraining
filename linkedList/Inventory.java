import java.util.Scanner;

class ItemNode{
    String itemName;
    int itemId;
    int quantity;
    int price;
    ItemNode next;
    ItemNode(String itemName,int itemId,int quantity,int price){
        this.itemName=itemName;
        this.itemId=itemId;
        this.quantity=quantity;
        this.price=price;
        this.next=null;
    }
}
class InventorySystem{
    private ItemNode head;
    void addItemInTheBeginning(String itemName,int itemId,int quantity,int price){
        ItemNode newNode=new ItemNode(itemName, itemId, quantity, price);
        temp=newNode;
        temp.next=head;
        head=temp;
    }
    void addItemInTheEnd(String itemName,int itemId,int quantity,int price){
        ItemNode newNode=new ItemNode(itemName, itemId, quantity, price);
        temp=head;
        if(head==null){
            head=newNode;
        return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    void addAtPosition(String itemName,int itemId,int quantity,int price,int position){
        ItemNode newNode=new ItemNode(itemName, itemId, quantity, price);
        temp=head;
        if(position<=0){
            System.out.println("Position invalid");
            return;
        }
        int count=1;
        while(count<position-1&&temp!=null){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("position invalid");
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

void removeNode(int id){
        ItemNode temp=head;
        if(temp==null){
            System.out.println("Empty list");
        }
        if(temp.itemId==id){
            head=head.next;
            return;
        }
        while(temp!=null && temp.next.itemId!=id){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Id not found");
            return;
        }
        temp.next=temp.next.next;
        return;
}
void updateQuantity(int quantity,int id){
        ItemNode temp=head;
        while(temp!=null and temp.id!=id){
            temp=temp.next;
    }
        if(temp==null){
            System.out.println("No id found");
            return;
        }
        temp.quantity=quantity;
        return;
}
void searchItem(int id,String name){
    ItemNode temp=head;
    while(temp!=null&&temp.itemId!=id&&temp.itemName!=name){
        temp=temp.next;
    }
    if(temp==null){
        System.out.println("No id found");
        return;
    }
    System.out.println("Item name: "+temp.itemName");
            System.out.println("Item price: "+temp.price");
                    System.out.println("Item id: "+temp.itemId");
                            System.out.println("Item quantity: "+temp.quantity");

}
void calculateTotal(){
    ItemNode temp=head;
    int total=0;
    while(temp!=null){
        total+=(temp.price*temp.quantity);
    temp=temp.next;
    }
        System.out,println("Total value "+total);
}
void sortById(){
        for(Node i=head;i!=null;i=i.next){
            for(Node j=head.next;j!=null;j=j.next){
                if(i.itemId>i.itemId){
                    swapItem(i,j);
                }
            }

        }
}
void sortbyName(){
    for(Node i=head;i!=null;i=i.next){
        for(Node j=head.next;j!=null;j=j.next){
            if(i.itemName.compareToIgnoreCase(j.itemName)>1){
                swapItem(i,j);
            }
        }
    }
    }

    private void swapData(itemNode a, itemNode b) {
        String tempName = a.itemName;
        int tempID = a.itemID;
        int tempQty = a.quantity;
        float tempPrice = a.price;

        a.itemName = b.itemName;
        a.itemID = b.itemID;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemName = tempName;
        b.itemID = tempID;
        b.quantity = tempQty;
        b.price = tempPrice;
    }

}
public class Inventory{
            public static void main(String[] args) {
                InventoryManagement inventory = new InventoryManagement();
                Scanner sc = new Scanner(System.in);

                while (true) {
                    System.out.println("\n---- Inventory Management ----");
                    System.out.println("1. Add at Beginning");
                    System.out.println("2. Add at End");
                    System.out.println("3. Add at Position");
                    System.out.println("4. Remove Item");
                    System.out.println("5. Update Quantity");
                    System.out.println("6. Search by ID");
                    System.out.println("7. Search by Name");
                    System.out.println("8. Display All Items");
                    System.out.println("9. Total Inventory Value");
                    System.out.println("10. Sort by Name");
                    System.out.println("11. Sort by Price");
                    System.out.println("12. Exit");

                    System.out.print("Enter choice: ");
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                        case 2:
                        case 3:
                            System.out.print("Enter Name: ");
                            String name = sc.next();
                            System.out.print("Enter ID: ");
                            int id = sc.nextInt();
                            System.out.print("Enter Quantity: ");
                            int qty = sc.nextInt();
                            System.out.print("Enter Price: ");
                            float price = sc.nextFloat();

                            if (choice == 1)
                                inventory.addAtBeginning(name, id, qty, price);
                            else if (choice == 2)
                                inventory.addAtEnd(name, id, qty, price);
                            else {
                                System.out.print("Enter Position: ");
                                int pos = sc.nextInt();
                                inventory.addAtPosition(pos, name, id, qty, price);
                            }
                            break;

                        case 4:
                            System.out.print("Enter ID to remove: ");
      inventory.removeItem(sc.nextInt());
                            break;

                        case 5:
                            System.out.print("Enter ID: ");
                            int uid = sc.nextInt();
                            System.out.print("Enter New Quantity: ");
                            inventory.updateQuantity(uid, sc.nextInt());
                            break;

                        case 6:
                            System.out.print("Enter ID: ");
                            inventory.searchByID(sc.nextInt());
                            break;

                        case 7:
                            System.out.print("Enter Name: ");
                            inventory.searchByName(sc.next());
                            break;

                        case 8:
                            inventory.displayAll();
                            break;

                        case 9:
                            inventory.totalInventoryValue();
                            break;

                        case 10:
                            inventory.sortByName();
                            break;

                        case 11:
                            inventory.sortByPrice();
                            break;

                        case 12:
                            System.exit(0);

                        default:
                            System.out.println("Invalid Choice!");
                    }



}