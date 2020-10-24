package DataStructures;

public class Test1 {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(3);
        list.insert(8);
//        System.out.println("Two elements:");
//        list.printData();

        list.insert(10);
        list.insert(6);
        list.insert(4);
        list.insert(1);
        list.insert(21);
        list.insert(65);
       // System.out.println("More elements: ");
        System.out.println("List: ");
        list.printData();

//        list.delete(65);
//        //System.out.println("Deleted element");
//        list.printData();
//        System.out.println("=========");
//        System.out.println("Is the list empty? " + list.isEmpty());

//        DoublyLinkedList list2 = new DoublyLinkedList();
//        System.out.println(list2.isEmpty());

        // Access index at which there's a certain number
        int index = list.accessData(3);
        System.out.println("The data is at index: " + index);
        System.out.println("The data at the head is: " + list.accessHead());
        System.out.println("The data at the tail is: " + list.accessTail());
//        list.changeData(65,5);
//        System.out.println("The new list: ");
//        list.printData();
        int checkIndex = 5;
        System.out.println("The data at the index " + checkIndex + " is: " + list.checkAtIndex(checkIndex));




    }
}
