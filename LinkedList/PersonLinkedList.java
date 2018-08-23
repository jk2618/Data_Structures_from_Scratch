public class PersonLinkedList {
    private Node head;
    public PersonLinkedList(Person person){ // constructor
        head = new Node();
        head.person = person;
        head.link = null;
    }

    // insert a new node from the start/head
    public boolean insertItemFirst(Person person){
        Node n = new Node();
        n.person = person;
        n.link = head;
        head = n;
        return true;
    }
    
    // insert a new node from the end
    public boolean insertItemLast(Person person){
        Node n = new Node();
        Node new_node;
        new_node = head;
        while(new_node.link != null){
            new_node = new_node.link;
        }
        n.person = person;
        n.link = null;
        new_node.link = n;
        return true;
    }

    public boolean deleteItem(String name){
        if (name.equals(head.person.getName())){
            head = head.link;
            return true;
        }else{
            Node x = head;
            Node y = head.link;
            while((y != null) && !(y.person.getName().equals(name))){
                x = y;
                y = y.link;
            }
            if (y != null){ // found the value
                x.link = y.link;
                return true;
            }else{
                return false;
            }
        }
    }

    public void printList(){
        Node z = head;
        while(z != null) { // the second block of last node should be null
            System.out.println(z.person.toString());
            z = z.link;
        }
    }
    
    class Node{ // nested class
        private Person person;
        private Node link;
    }
}
