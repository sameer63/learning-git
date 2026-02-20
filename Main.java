package LinkedListNode;

import LinkedListNode.MyLinkedList;
public class Main {
    public static void main(String args[]){
        MyLinkedList<String> ls=new MyLinkedList<>();

        ls.add("Hi");
        ls.add("hlo");
        ls.add("Bye");
        ls.add("How");
        ls.add("hey");

        ls.delete("hey");

        
        ls.display();
    }
    
}
