import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = myObj.nextLine();
        System.out.println("Switch method output: ");
        for(int i=0; i<word.length(); i++){
            System.out.print(number(word.charAt(i)) + " ");
        }
        System.out.println();
        System.out.println("Arrays method output: ");
        for(int i=0; i<word.length(); i++){
            System.out.print(newNumber(word.charAt(i)) + " ");
        }
    }
    public static Integer number(Character character){
        return switch (character) {
            case 'a' -> 2;
            case 'b' -> 22;
            case 'c' -> 222;
            case 'd' -> 3;
            case 'e' -> 33;
            case 'f' -> 333;
            case 'g' -> 4;
            case 'h' -> 44;
            case 'i' -> 444;
            case 'j' -> 5;
            case 'k' -> 55;
            case 'l' -> 555;
            case 'm' -> 6;
            case 'n' -> 66;
            case 'o' -> 666;
            case 'p' -> 7;
            case 'q' -> 77;
            case 'r' -> 777;
            case 's' -> 7777;
            case 't' -> 8;
            case 'u' -> 88;
            case 'v' -> 888;
            case 'w' -> 9;
            case 'x' -> 99;
            case 'y' -> 999;
            case 'z' -> 9999;
            default -> 0;
        };
    }
    public static String newNumber(Character character){
        int arrayNum = 0;
        int charNum = 0;
        String returnWord = "";
        Character[] twos = {'a', 'b', 'c'};
        Character[] threes = {'d', 'e', 'f'};
        Character[] fours = {'g', 'h', 'i'};
        Character[] fives = {'j', 'k', 'l'};
        Character[] sixes = {'m', 'n', 'o'};
        Character[] sevens = {'p', 'q', 'r', 's'};
        Character[] eights = {'t', 'u', 'v'};
        Character[] nines = {'w', 'x', 'y', 'z'};
        Character[][] arrays = {twos, threes, fours, fives, sixes, sevens, eights, nines};
        for(Character[] array : arrays){
            for (char element : array) {
                if (element == character) {
                    int arrayLen = array.length;
                    int i = 0;
                    while (i < arrayLen) {
                        if (array[i] == element) {
                            charNum = i;
                            break;
                        } else {
                            i = i + 1;
                        }
                    }
                    int arraysLen = arrays.length;
                    int j = 0;
                    while (j < arraysLen) {
                        if (arrays[j] == array) {
                            arrayNum = j;
                            break;
                        } else {
                            j = j + 1;
                        }
                    }
                    break;
                }
            }
        }
        for(int i = 0; i<=charNum; i++){
            returnWord = returnWord.concat(String.valueOf(arrayNum+2));
        }
        return returnWord;
    }
    @Test
    public void test(){
        int number = number('a');
        Assert.assertEquals(number, 2);
        String newNumber = newNumber('a');
        Assert.assertEquals(newNumber, "2");
    }
}