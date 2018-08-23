public class MainPersonStack {
    public static void main(String[] args){
        Person person1 = new Person("Amir", "34-123");
        Person person2 = new Person("Jessica", "37-456");
        Person person3 = new Person("Sherlock", "55-789");

        PersonStack stack = new PersonStack();
        stack.push(person1);
        stack.push(person2);
        stack.push(person3);

        // First In Last Out
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
    }
}
