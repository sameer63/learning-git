package LinkedListNode;

public class MyLinkedList<T> {
    Node<T> head;

    public MyLinkedList(){}

    public void add(T data){
        Node<T> newNode=new Node<>(data);  

        if(head==null){
            head=newNode;
            return;
        }

        Node<T> temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
  }
  void display(){
       Node<T> temp=head;
       while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
       }
       System.out.println("null");
  }

  void delete(T key){
    if(head==null){
        return;
    }
    if(head.data==key){
        head=head.next;
    }else{
        Node<T> temp=head;
        while(temp.next.next!=null&&temp.next.data!=key){
            temp=temp.next;
        }
        if(temp.next.next==null&&temp.next.data==key){
            temp.next=temp.next.next;
        }
        else if(temp.next.data==key){
            temp.next=temp.next.next;
            temp.next=null;
        }
   }


    
  }
}
