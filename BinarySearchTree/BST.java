public class BST {
    private Node root;
    public BST(){
        root = null;
    }

    public boolean insert(Employee emp){
        Node n = new Node();
        n.data = emp;
        n.lc = null;
        n.rc = null;
        if (root == null){
            root = n;
            return true;
        }
        Node p = root;
        Node c = root;
        while(c != null){
            p = c;
            if (emp.getName().compareTo(c.data.getName()) < 0){
                c = c.lc;
            }else{
                c = c.rc;
            }
        }
        if (emp.getName().compareTo(p.data.getName()) < 0){
            p.lc = n;
        }else{
            p.rc = n;
        }

        return true;
    }

    public Node findNode(String key){
        Node c = root;
        while(c != null){
            if (key.compareTo(c.data.getName()) == 0){
                break;
            } if (key.compareTo(c.data.getName()) < 0){
                c = c.lc;
            } else{
                c = c.rc;
            }
        }
        return c;
    }

    // find parent node
    public Node findParent(String key){
        Node p = root;
        Node c = root;
        do{
            if (key.compareTo(c.data.getName()) == 0){
                break;
            }
            p = c;
            if (key.compareTo(c.data.getName()) < 0){
                c = c.lc;
            }else{
                c = c.rc;
            }
        } while(c != null);
        System.out.println("Parent node is: >> " + p.data.getName());
        if (c != null){
            return p;
        } else{
            return null;
        }
    }

    public Employee getData(Node n){
        return n.data;
    }

    // find descendants of Node n
    public void showAll(Node n){
        Node p = n;
        if (p != null){
            System.out.println(" " + p.data);
            showAll(p.lc);
            showAll(p.rc);
        }
    }

    public class Node{ // nested class
        private Node lc; // left child
        private Employee data;
        private Node rc; // right child
    }
}
