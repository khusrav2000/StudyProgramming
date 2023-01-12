import java.util.ArrayList;
import java.util.Collections;

public class JavaSubstringComparions {
    public void getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList subsList = new ArrayList<String>();
        for (int i = 0; i < s.length() - k; i++) {
            subsList.add(s.substring(i, i + k));
        }
        Collections.sort(subsList);
        for (Object i : subsList) {
            System.out.println(i.toString());
        }
        System.out.println(subsList.get(0));
        System.out.println(subsList.get(subsList.size() - 1));

    }
}
