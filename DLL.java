public class DLL{
    
    Node head;
    public void insertatfirst(int data){
        
        Node node = new Node(data);
        node.previous = null;
        node.next = null;
        node.data = data;
        if(head != null){
            node.next = head;
            head.previous = node;
        }
        head = node;
    }
    
    public void insertinbtwn(int index, int data){
        
        Node node = new Node(data);
        node.data = data;
        if(index == 0){
            insertatfirst(data);
        }
        else{
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            node.previous = n;
            node.next.previous = node;
        }
    }
    
    public void insertatlast(int data){
        
        Node node = new Node(data);
        Node oldend = head;
        node.next = null;
        if(head == null){
            node.previous = null;
            node.data = data;
            head = node;
        }
        while(oldend.next != null){
            oldend = oldend.next;
        }
        oldend.next = node;
        node.previous = oldend;
    }
    
    public void deletespecific(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node temp = head;
            Node t = null;
            for(int i=0;i<index-1;i++){
                temp = temp.next;
            }
            t = temp.next;
            temp.next = t.next;
            t.previous = temp;
            System.out.print("Data deleted : " + t.data);
            t= null;
        } 
    }
    
    
    public void display(){
        
        Node node = head;
        while(node != null){
            System.out.print(node.data + " <--> ");
            node = node.next;
        }
        System.out.print("END\n");
    }
}