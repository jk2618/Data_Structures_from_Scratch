public class MainPersonQueue {
    public static void main(String[] args){
        PersonQueue q = new PersonQueue();
        q.enqueue(new Person("Amir", "10-458"));
        q.enqueue(new Person("Fahad", "11-366"));
        q.enqueue(new Person("Tracy", "11-956"));

        // First In First Out
        q.showAll();
    }
}
