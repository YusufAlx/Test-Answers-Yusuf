import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String Array that holds 50 strings
        String[] strArr = new String[50];
        //for loop that goes through array
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = "/";
            System.out.println(strArr[i]);
        }
        Random rand = new Random();
        int[] intArr = new int[50];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt(50);
            int temp = ;
        }

    }
    public static void V(String[] arg){
        //2 dimensional array that has 5 rows and 8 columns
        int[][] intArr = new int[5][8];
        //for loop that goes through the 2d array
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]+":");
        }
    }
}