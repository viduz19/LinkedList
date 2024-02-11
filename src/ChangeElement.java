import java.util.LinkedList;

public class ChangeElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Vidusha");
        ll.add("Damith");
        ll.add("Maleesha");
        ll.add("Saththya");
        System.out.println("Before List:- " + ll);
        ll.set(3,"Chamath");
        System.out.println("After List:- " + ll);
    }
}

