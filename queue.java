class queue{
    int size;
    int front=-1;
    int rear=-1;
    int[]arr;
    
    queue(){
        this.arr=new int[5];
        this.size=arr.length;
        
    }
    public boolean isEmpty(){
        if(front==-1 && rear==-1){
            return true;

        }else{
            return false;
        }

    }
    public boolean isFull(){
        if(rear==size-1){
            return true;
        }else{
            return false;
        }
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return ;
        }else{
        rear++;
        arr[rear]=data;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }else{
        front++;
        }
    }
    public void display(){
        for(int i=0;i<=rear;i++){
            System.out.println(arr[i]);

        }
    }
    public int first(){
        if(isEmpty()){
            System.out.println("Queue is empty no element found at first location");
            return -1;
        }
        return arr[front+1]; //beacause enqueue operation was performed by incrementing rear, front remained at -1
    }
    public int last(){
        if(isEmpty()){
            System.out.println("Queue is empty no element found at first location");
            return -1;
        }
        return arr[rear];

    }
    

}