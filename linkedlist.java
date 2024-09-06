
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
            if(n.data==7){
              System.out.println("Found");
              return idx; 
            }
           }
         return idx;
    }
    
    public void display(){
        Node n=head;
        while(n.next!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
        System.out.print(n.data+" ");
    }
}
