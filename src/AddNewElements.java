import java.util.LinkedList;


public class AddNewElements {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println("Before:- "+ll);

        ll.add(2,25);
        System.out.println("After:- "+ll);
    }
}
