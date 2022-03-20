import java.util.*;
public class mainclass{
    public static void main(String args[]){
        DLL dll = new DLL();
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("\n1. Insert at beginning\n2. Insert at specific location\n3. Insert at end\n4. Display data\n5. Delete data\n6. Exit\nEnter your choice : ");
            int choice = in.nextInt();
            int data;
            switch(choice){
                case 1:
                    System.out.print("Enter the data to be inserted : ");
                    data = in.nextInt();
                    dll.insertatfirst(data);
                    break;
                case 2:
                    System.out.print("Enter the position to insert : ");
                    int index = in.nextInt();
                    System.out.print("Enter the data to be inserted : ");
                    data = in.nextInt();
                    dll.insertinbtwn(index, data);
                    break;
                case 3:
                    System.out.print("Enter the data to be inserted at last : ");
                    data = in.nextInt();
                    dll.insertatlast(data);
                    break;
                case 4:
                    System.out.print("Data present : ");
                    dll.display();
                    break;
                case 5:
                    System.out.print("Enter the index position to be deleted : ");
                    index = in.nextInt();
                    dll.deletespecific(index);
                    break;
                case 6:
                    System.out.println("GoodBye");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }        
    }
}