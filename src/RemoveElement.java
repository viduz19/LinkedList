import java.util.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Vidusha");
        ll.add("Damith");
        ll.add("Maleesha");
        ll.add("Saththya");
        System.out.println("Before List:- "+ll);

        String str = ll.remove(2);
        System.out.println("Remove element:- "+str);

        System.out.println("After List:- "+ll);


    }
}

