import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJavaTester {
    public static void main(String[] args){
        PuzzleJava puzzleJava = new PuzzleJava();
        int[] X_array = {3,5,1,2,7,9,8,13,25,32};
        int total = puzzleJava.sumArray(X_array);
        System.out.println("The total is: " +Integer.toString(total));

        ArrayList<Integer> Counter = puzzleJava.greaterThan(X_array, 10);
		System.out.println(Counter); //ArrayList can print out, no need conversion to String!!!

        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");

        System.out.println(names);
        Collections.shuffle(names);
        System.out.println(names);

        ArrayList<String> newListNames = puzzleJava.filterNames(names);
        System.out.println(newListNames);

        char[] Alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> alphabetList = puzzleJava.shuffleChar(Alphabet);
        System.out.println(alphabetList);
        System.out.println(alphabetList.get(0));
        System.out.println(alphabetList.get(25));
        char chkV = alphabetList.get(0);
        if( chkV =='a'||chkV == 'e'||chkV == 'i'|| chkV == 'o'|| chkV == 'u'){
            System.out.println("The first shuffle letter is a vowel");
        }
        else {
            System.out.println("The first shuffle letter is a consonant");
        }

        ArrayList<Integer> nRandom = puzzleJava.rand10Array();
        System.out.println(nRandom);

        Collections.sort(nRandom);
        System.out.println(nRandom);
        System.out.println("The first Random Number is: "+nRandom.get(0)); 
        System.out.println("The last Random Number is: "+nRandom.get(9));
        
        String genString = puzzleJava.rand5chars();
        System.out.println(genString);

        for( int k=0; k<10; k++){
            String gen10String = puzzleJava.rand5chars();
            System.out.println("String"+k+" is: "+ gen10String); 
        }


    }
}