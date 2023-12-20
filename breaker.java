import java.io.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String word;
        if (args.length > 1) word = args[1]; else {
            System.out.println("Please input word");
            System.out.printf(" >> ");
            Scanner sc = new Scanner(System.in);
            word = sc.next();
        }
        int[] l = this.countLetters(word);
        System.out.println();
        System.out.println("Number of Vowels: " + (String)l[0]);
        System.out.println("Number of Consonants: " + (String)l[1]);
        System.out.println();
    }
    
    public int[] countLetters(String w) {
        /* @args: Takes a single word string, can have capital letters.
         * @return: Returns an array of the consonants and vowels in the string. The number at index 0 is the number of vowels, and the value at index 1 is the number of consonants.
         */
        int v = 0;
        int c = 0;
        w.toLowerCase();
        for (int i = 0; i < w.length(); i++) {
            switch (w.charAt(i)) {
                case 'a': v++; break;
                case 'e': v++; break;
                case 'i': v++; break;
                case 'o': v++; break;
                case 'u': v++; break;
                default: c++; break;
            }
        }
        return new int[]{v, c};
    }
}
