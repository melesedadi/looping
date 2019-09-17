import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner key = new Scanner (System.in);

        // Prompt the user to get 10 imput; save each input in  a list; print out that list
        ArrayList<String> words = new ArrayList<>();
//        System.out.println("enter  a word: ");
//        String word = key.nextLine();
//        words.add(word);
        String word = " ";

        for (int i = 0; i < 10; i++){
            System.out.println("enter  a word " +(i+1) +":");

            word = key.nextLine();
            words.add(word);
            System.out.println(i);
        }
        System.out.println(words);

    }
}
