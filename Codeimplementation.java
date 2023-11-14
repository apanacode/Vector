package Vector;

import java.util.Vector;

public class Codeimplementation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // creation of vector list

        Vector<Integer> v1 = new Vector<>();

        // addition of elements in the list

        v1.add(11);
        v1.add(12);
        v1.add(13);
        System.out.println(v1);
        Vector<Integer> v2 = new Vector<>();
        v2.add(1);
        v2.add(2);
        v2.add(3);
        System.out.println(v2);
        v1.addAll(v2);
        System.out.println(v1);
        v1.add(0, 23);
        System.out.println(v1);

        // retrieval of elements from the list

        System.out.println(v1.get(2));

        // deletion of elements from the list

        v1.remove(2);

        System.out.print(v1);
        v1.removeAll(v2);
        System.out.println(v1);

        v1.clear();
        System.out.println(v1);

        Vector<String> v3 = new Vector<>();
        v3.add("ravi"); // adding of elements into the new list v3
        v3.add("rathi");
        v3.add("gaka");
        v3.add("laddu");

        // verification of elements in the list

        System.out.println(v3.contains("gaka"));
        System.out.println(v3.containsAll(v2));

        // updation of elements in the list
        v3.set(1, "ramu");
        System.out.print(v3);

    }

}
