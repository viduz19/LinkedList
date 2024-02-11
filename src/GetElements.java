import java.util.LinkedList;

    public class GetElements {
        public static void main(String[] args) {
            LinkedList<String> ll = new LinkedList<>();
            ll.add("Java");
            ll.add("Python");
            ll.add("C");
            ll.add("JavaScript");

            System.out.println("Before :- " +ll);
            String str = ll.get(2);
            System.out.println("Get element:- "+str);

        }
    }

