
public class CLient {
    public static void main(String[] args) {
        queue myQueue=new queue();
        myQueue.enqueue(10);
        myQueue.enqueue(20);
        // myQueue.display();    
        // System.out.println(myQueue.isEmpty());
        // System.out.println(myQueue.isFull());
        System.out.println(myQueue.first());

        System.out.println(myQueue.last());
    }
    
    

}