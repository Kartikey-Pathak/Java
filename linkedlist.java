
public class linkedlist{
    
    Node head;
  //  The Node class is necessary for creating the nodes of the linked list, where each node contains data and a reference to the next node.
    
  public class Node{
    int data;
    Node next;
}

    public void insert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        
     if(head==null){
        head=node;
     }else{
          Node n=head;
          while(n.next!=null){
            n=n.next;
           }
          n.next=node;
     }
    }

    public void insertatfirst(int data){
      Node node=new Node();
      node.data=data;
      node.next=null;
      node.next=head;
      head=node;
    }

    public void insertat(int idx,int data){

      //Base Case Check 
      if(idx<0||idx>0&&head==null){
        System.err.println("Invalid Index");
        return;

      }


        Node node=new Node();
        node.data=data;
        node.next=null;
        Node n=head;

        if(idx==0){
            insertatfirst(data);  // if idx 0 then add first ...
        }
        else{
        for (int i = 0; i < idx-1; i++) {
            n=n.next;   
        }
        node.next=n.next;   //new node connected to idx+1th node....
        n.next=node;   //n node ie(idx-1)th connected to new node with data.....
    }
    }

    public void deleteat(int idx){

      //Base Case Check
      if(idx<0||head==null){
        System.out.println("Wrong Index Is Entered.");
        return;
      }



      Node n=head;
      Node ntemp=null;
      if(idx==0){
        head=head.next;
      }else{
      for (int i = 0; i < idx-1; i++) {
          n=n.next;
      }
      ntemp=n.next;
      n.next=ntemp.next;
      ntemp=null;     //completely removed..
    }
    }



    //................................................................................................................................


     //Function to delete the values if that value matches with the users wished to delete...

     public void deletethe(int del){
      Node n=head;
      Node prev=null;
      while(n!=null){
        if(n.data==del){
          if(n==head){
            head=n.next;
          }else{
            prev.next=n.next;  //link the prev node to the current's node's next node if the value matches
          }
        }else{  // value is not there so, let's travel....
    
            prev=n;
        }
        n=n.next;   // so outside the else so that it can travel even when we found the value or not at that Node( @ n.data ).  
      }
     }

//................................................................................................................................

    public void removelast(){
      
      if(head==null){
        System.out.println("No Element to Delete...");
      }
      
      if(head.next==null){
        head=null;
      }

      Node currnode=head;  // starting node
      Node currnextnode=head.next;  // just next to the starting node
      
      while(currnextnode.next!=null){
        currnode=currnode.next;
        currnextnode=currnextnode.next;
      }
       
      currnode.next=null;// deleted


    }


    public int find(int val){
      int idx=0;
           Node n=head;

           while(n.next!=null){
            n=n.next;
            idx++;
            if(n.data==val){
              System.out.println("Found");
              return idx; 
            }
           }
         System.out.println("Value Not Found...");
         return -1;
    }

    // Reversing The LinkedList...
    
    public void reverse(){
      Node prev=null;
      Node curr=head;
 
      //Check The conditions For The head
      if(head==null|| head.next==null){
        return;
      }


      while(curr!=null){
        Node currnext=curr.next;
        curr.next=prev;
        prev=curr;
        curr=currnext;
      }
      head.next=null;
      head=prev;  //prev node is head because the curr node will be at null.
    }


    
    public void display(){
        Node n=head;

        //Base Case When Whole List Is Empty..
        if(n==null){
          System.err.println("Empty List......");
          return;
        }


        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        
    }
}
