package DataStructures;

public class DLLNode {
    int data;
    DLLNode previous;
    DLLNode next;

    public DLLNode(int data){
        this.data=data;
        this.previous=null;
        this.next=null;
    }
}
