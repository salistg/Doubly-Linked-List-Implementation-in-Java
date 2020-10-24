//Class to test the DLL class

package DataStructures;

public class Test1 {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();  //created new DLL object
        
        //inserting data into the list
        list.insert(3);
        list.insert(8);
        list.insert(10);
        list.insert(6);
        list.insert(4);
        list.insert(1);
        list.insert(21);
        list.insert(65);
       //printing the list
        System.out.println("List: ");
        list.printData();

        //deleting from the list and printing the new list
//        list.delete(65);
//        System.out.println("Deleted element");
//        list.printData();
        
        //checking if the list is empty
//        System.out.println("=========");
//        System.out.println("Is the list empty? " + list.isEmpty());

        //creating a new empty list and checking it using the isEmpty() method
//        DoublyLinkedList list2 = new DoublyLinkedList();
//        System.out.println(list2.isEmpty());

        // Printing the data at index 3
        int index = list.findIndex(3);
        System.out.println("The data is at index: " + index);
        System.out.println("The data at the head is: " + list.accessHead());     //printing the data at the head of the list
        System.out.println("The data at the tail is: " + list.accessTail());     //printing the data at the tail of the list
        
        //changing the data 65 in the list with new data 5 and printing the new list
//        list.changeData(65,5);
//        System.out.println("The new list: ");
//        list.printData();
        
        //checking the data at certain index
        int checkIndex = 5;
        System.out.println("The data at the index " + checkIndex + " is: " + list.checkAtIndex(checkIndex));




    }
}
