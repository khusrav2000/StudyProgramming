import java.util.Arrays;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        /*if((new StringBuilder(a)).equals((new StringBuilder(b)).sorted()))
            return true;
        */
        char[] aa = a.toCharArray();
        Arrays.sort(aa);
        char[] bb = b.toCharArray();
        Arrays.sort(bb);
        if((new String(aa)).equals(new String(bb)))
            return true;
        return false;
    }
}
