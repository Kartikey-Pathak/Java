class QueueLinked{
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class queue{
           static Node head=null;
           static Node tail=null;

         public static boolean isEmpty(){
             return head==null&&tail==null;
         }


         //Enqueue
         public static void add(int data){     //O(1)
            
            Node newnode=new Node(data);

            if(tail==null){
               head=tail=newnode;
               return;
            }
            tail.next=newnode;
            tail=newnode;

                      

         }
         //Dequeue
         public static int remove(){       //O(1)
             if(isEmpty()){
                System.out.println("Queue is already empty...");
                return -1;
             }
            
             int val=head.data;
             if(head==tail){
                tail=null;
             }
          
             head=head.next;
          
             return val;
         }
         public static int peek(){
             if(isEmpty()){
                 System.out.println("Queue is already empty...");
                 return -1;
              }
              
              return head.data;
         }
     }
     public static void main(String args[]){
         queue q=new queue();
         q.add(1);
         q.add(2);
         q.add(3);
        
         q.remove();
 
         while(!q.isEmpty()){
             System.out.print(" "+q.peek());
             q.remove();
         }
     }
 }