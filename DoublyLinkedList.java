package DataStructures;

public class DoublyLinkedList {
    DLLNode head;

    /**
     * @param data
     */
    public void insert(int data){
        DLLNode newNode = new DLLNode(data);

        newNode.next = head;
        newNode.previous = null;

        if(head!=null)
            head.previous=newNode;

        head=newNode;
        //System.out.println("value inserted");
    }

    public void delete(int data){
        if(head==null) return;
        if(head.data==data){
            head=head.next;
            head.next.previous=null;
            //System.out.println("Value deleted: " + data);
            return;
        }

        DLLNode current = head;

        while (current.next!=null){
            if(current.next.data==data) {
                if (current.next.next == null) {
                    current.next = null;
                    return;
                } else {
                    current.next = current.next.next;
                    if (current.next.next != null) {
                        current.next.next.previous = current;
                    }
                    return;
                }
            }

            current=current.next;
        }

    }

    public boolean isEmpty(){
        return head==null;
    }

    public int accessHead(){
        return head.data;
    }

    public int accessTail(){
        DLLNode node;
        node = head;
        while (true){
            if(node.next==null){
                return node.data;
            }
            node = node.next;
        }
    }

    public int accessData(int data){
        DLLNode newNode;
        int index = 1;
        int headIndex = 0;
        newNode = head;
        if(newNode.data==data){
            return headIndex;
        }
        while(newNode.next!=null){
            if(newNode.next.data==data) {
                return index;
            }
            newNode=newNode.next;
            index++;
        }
        return index;
    }

    public void changeData(int oldData, int newData){
        if(head.data==oldData){
            head.data=newData;
            //System.out.println("Data changed at the head");
        }
        DLLNode current;
        current=head;
        while (current.next!=null){
            if(current.next.data==oldData) {
                current.next.data = newData;
            }
            current=current.next;
        }

    }

    public int checkAtIndex(int index){
        if(index==0){
            return head.data;
        }
        DLLNode current;
        current=head;
        int counter = 1;
        while (current.next!=null){
            if(counter==index){
                return current.next.data;
            }
            current=current.next;
            counter++;
        }
        return 0;
    }

    public void printData(){
        DLLNode current = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        while (current!=null){
            System.out.println(current.data + " ");
            current=current.next;

        }
        System.out.println();
    }


}
