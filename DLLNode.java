//Class to represent a node in a doubly linked list

package DataStructures;

public class DLLNode {
    int data;                  // data that'll fill the node
    DLLNode previous;         //a reference to the previous node
    DLLNode next;            //a reference to the next node

    public DLLNode(int data){      //DLLNode class constructor
        this.data=data;            //initiaizing data
        this.previous=null;        //intializing previous node reference to NULL
        this.next=null;            //initializing next node reference to NULL
    } //constructor end
} //end class DLLNODE
