import java.util.Scanner;
import java.util.*;
public class Vowels {
    public static void main(String[] arg){
        char c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        c=s.next().charAt(0);
        s.close();
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c+" is a vowel");
                break;
            default:
                System.out.println(c+" is a consonant");
                break;
        }


    }
}
