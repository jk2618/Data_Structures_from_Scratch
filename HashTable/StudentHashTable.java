public class StudentHashTable {
    // HashTable works with arrays
    // ASCII code % length of array
    private StudentLinkedList[] arr;
    private int size;
    private int totalstudents;

    public StudentHashTable(){
        size = 1000;
        arr = new StudentLinkedList[size];
    }

    public int toHashCode(String rollno){
        int addasciis = 0;
        int codevalue = 0;
        for (int i = 0; i < rollno.length(); i++){
            addasciis = addasciis + (int)rollno.charAt(i);
        }
        codevalue = addasciis % arr.length;
        return codevalue;
    }

    public boolean insert(int key, Student data){
        if (arr[key] == null){ // if arr[key] is null, initialize the object
            arr[key] = new StudentLinkedList();
        }
        // if arr[key] is not null, insert student data into next position via Linked List
        arr[key].insertStudent(data);
        totalstudents++;
        return true;
    }

    public int getTotal(){
        return totalstudents;
    }

    public Student fetchStudentInfo(String rollno){
        int key = toHashCode(rollno);
        if (arr[key] == null){
            return null;
        }else{
            Student q = arr[key].fetchData(rollno);
            if (q != null){
                return q;
            }else{
                return null;
            }
        }
    }

    public boolean deleteStudent(String rollno){
        boolean have = arr[toHashCode(rollno)].haveRollno(rollno);
        if (have){
            int key = toHashCode(rollno);
            arr[key].deleteStudent(rollno);
            totalstudents--;
            return true;
        }
        return false;
    }

    public void showData(){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] != null){
                arr[i].showAll();
            }
        }
    }
}
