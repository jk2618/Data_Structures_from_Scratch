public class MainPersonLinkedList {
    public static void main(String[] args){
        Person person1 = new Person("Scooby", "AX-7764");
        Person person2 = new Person("Ryan", "AR-3398");
        Person person3 = new Person("Rina", "MR-8865");

        // instantiation
        PersonLinkedList list = new PersonLinkedList(person1);
        // insert from the first node
        list.insertItemFirst(person2);
        // insert from the last node
        list.insertItemLast(person3);

        list.printList();
    }
}
