
public class ClientLL {
    public static void main(String[] args) {
        QueueLL myLLq=new QueueLL();
        myLLq.enqueue(10);
        myLLq.enqueue(20);
        // myLLq.enqueue(30);
        // myLLq.enqueue(40);
        // myLLq.dequeue(); //working handled case
        // myLLq.dequeue(); //working handled case
        myLLq.enqueue(30);
        // myLLq.display();
        System.out.println(myLLq.last());
        System.out.println(myLLq.first());
        System.out.println(myLLq.isEmpty());
        System.out.println(myLLq.isFull());

    }

}