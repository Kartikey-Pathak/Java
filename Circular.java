class Circular{
    static class queue{
         static int arr[];
         static int size;
         static int rear;
         static int front;
 
         public queue(int size) {
             arr=new int[size];
             this.size=size; // Assign the parameter 'size' to the inner class's static variable
             rear=-1;
             front=-1;
         }
         public static boolean isEmpty(){
             return rear==-1&&front==-1;
         }

          public static boolean isFull(){
            return (rear+1)%size==front;
          }

         //Enqueue
         public static void add(int data){     //O(1)
             if(isFull()){  //overflow
                 System.out.println("The Size Is Full Can't ADD");
                 return;
             }

             if(front==-1){  //1st element add
                front=0;
             }
              rear=(rear+1)%size;
              arr[rear]=data;
         }
         //Dequeue
         public static int remove(){       //O(1)
             if(isEmpty()){
                System.out.println("Queue is already empty...");
                return -1;
             }
             int res=arr[front];
               
             //single elemet
             if(rear==front){
                rear=front=-1;
             }else{
                front=(front+1)%size;
             }


              return res;
         }
         public static int peek(){
             if(isEmpty()){
                 System.out.println("Queue is already empty...");
                 return -1;
              }
              
              return arr[front];
         }
     }
     public static void main(String args[]){
         queue q=new queue(7);
         q.add(1);
         q.add(2);
         q.add(3);
         q.add(4);
         q.add(5);
         q.add(6);
         q.add(7);
         q.remove();
         q.remove();
         q.add(8);
         q.add(9);
 
         while(!q.isEmpty()){
             System.out.print(" "+q.peek());
             q.remove();
         }
     }
 }
