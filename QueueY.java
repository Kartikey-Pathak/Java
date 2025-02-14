class QueueY{
   static class queue{
        static int arr[];
        static int size;
        static int rear;

        public queue(int size) {
            arr=new int[size];
            this.size=size; // Assign the parameter 'size' to the inner class's static variable
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        //Enqueue
        public static void add(int data){     //O(1)
            if(rear==size-1){  //overflow
                System.out.println("The Size Is Full Can't ADD");
                return;
            }
             rear++;
             arr[rear]=data;
        }
        //Dequeue
        public static int remove(){       //O(N)
            if(isEmpty()){
               System.out.println("Queue is already empty...");
               return -1;
            }
            int front=arr[0];
             //Now Shift
             for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
             }
             rear--;
             return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is already empty...");
                return -1;
             }
             
             return arr[0];
        }
    }
    public static void main(String args[]){
        queue q=new queue(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}