package Self_Study;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class setsAndListsTutorial {
    public static void main(String[] args) {

        Set<Integer> t = new TreeSet<>();
        String[] vv = new String[4];

        t.add(5);
        t.add(6);
        t.add(7);

        boolean x = t.contains(5);

        t.clear();

        int s = t.size();
        System.out.println(x);


    }
}
