public class PersonStack {
    private Person [] stack; // integer array
    private int top; // the last index
    private int size;

    public PersonStack(){ // constructor
        top = -1;
        size = 50;
        stack = new Person [50];
    }

    public PersonStack(int size){
        top = -1;
        this.size = size;
        stack = new Person [this.size];
    }

    public boolean push(Person item){
        if (!isFull()){
            top++;
            stack[top] = item;
            return true;
        }else {
            return false;
        }
    }

    public boolean isFull(){
        return (top == stack.length - 1);
    }

    public Person pop(){
        return stack[top--];
    }

    public boolean isEmpty(){
        return (top == -1);
    }
}
