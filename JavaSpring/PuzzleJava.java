import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public int sumArray(int[] arr){
        int i;
        int sum=0;
        for (i=0; i<arr.length; i++){
            sum = sum +arr[i];
        }
        return sum;
    }

    public ArrayList<Integer> greaterThan(int[] arr, int Y){
        int i;
        ArrayList<Integer> newArray= new ArrayList<Integer>();
        for (i=0; i<arr.length; i++){
            if (arr[i]>Y){
                newArray.add(arr[i]);
            }
        }
        return newArray;
    }

    public ArrayList<String> filterNames(ArrayList<String> arr){
        ArrayList<String> names5More = new ArrayList<String>();
        int i;
        for (i=0; i<arr.size(); i++){
            if (arr.get(i).length() > 5) {
                names5More.add(arr.get(i));
            }
        }
        return names5More;
    }

    public ArrayList<Character> shuffleChar(char[] arr){
        ArrayList<Character> charList = new ArrayList<Character>();
        int k;
        for (k=0; k < arr.length; k++){
            charList.add(arr[k]);
        }
        Collections.shuffle(charList);
        return charList;
    }

    public ArrayList<Integer> rand10Array(){
        Random gen = new Random();
        ArrayList<Integer> randArray = new ArrayList<Integer>();
        for (int i=0; i<10; i++){
            int randVal = gen.nextInt(45)+55;
            randArray.add(randVal); 
        }
        return randArray;
    }

    public String rand5chars(){
        Random gen = new Random();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randString ="";
        int length = 5;
        for (int i=0; i< length; i++){
            randString += characters.charAt(gen.nextInt(characters.length()));
        }
        return randString;


    }
}