
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by siddharth on 7/7/16.
 */
public class DrawRightTriangle {
    public static void main(String args[])throws IOException{
        System.out.println("Enter the number of lines");
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int n = Integer.parseInt(input);
        new DrawRightTriangle().drawRightTriangle(n);
    }
    private void drawRightTriangle(int n){
        for(int i=0;i<n;i++){
            printAsterisk(i+1);
            System.out.println();
        }
    }

    private void printAsterisk(int n){
        if (n>0){
        System.out.print('*');
        printAsterisk(n-1);
        }
    }
}
