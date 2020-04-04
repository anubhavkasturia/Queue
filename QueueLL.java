
public class QueueLL {
    private class Node{
        int data;
        Node next;
    }
    Node front;
    Node rear;

    QueueLL(){
        this.front=null;
        this.rear=null;
    }
    public boolean isEmpty(){
        if(front==null && rear==null){
            // System.out.println("Queue is empty");
            return true;
        }else{
            return false;
        }
    
    }
    public boolean isFull(){
        Node temp=new Node();
        if(temp==null){
            return true;
        }else{
            return false;
        }

    }
    public void enqueue(int data){
        Node temp=new Node();
        if(temp==null){
            System.out.println("Queue of LL is full"); //? unncessary tho
            return;
        }
        if(front==null){
            rear=front;
            
        }
        
        temp.data=data;
        temp.next=null;
        if(isEmpty()){ //?
            rear=temp;
            front=temp;
            return;
        }
        
        rear.next=temp;
        rear=temp;

    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty elements cannot be removed");
            return;
        }
       
        front=front.next;
    }
    public void display(){
        Node temp=front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public int first(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;

    }
    public int last(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return rear.data;

    }
}


