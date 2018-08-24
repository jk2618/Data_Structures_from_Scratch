public class MainEmployeeBST {
    public static void main(String[] args){
        Employee e1 = new Employee("Tiffany", 30);
        Employee e2 = new Employee("Mei", 31);
        Employee e3 = new Employee("Catherine", 44);
        Employee e4 = new Employee("Joe", 34);
        Employee e5 = new Employee("Chico", 18);

        BST bst = new BST();
        bst.insert(e1);
        bst.insert(e2);
        bst.insert(e3);
        bst.insert(e4);
        bst.insert(e5);

        // find all descendants
        bst.showAll(bst.findNode("Tiffany"));

        // find parent node
        System.out.println("**********");
        Employee e = bst.getData(bst.findParent("Chico"));
        System.out.println(e.toString());
    }
}
