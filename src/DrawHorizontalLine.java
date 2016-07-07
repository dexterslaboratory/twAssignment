
import java.io.*;

/**
 * Created by siddharth on 7/7/16.
 */
public class DrawHorizontalLine {
    public static void main(String args[])throws IOException{
        System.out.println("Enter the value of n");
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int n = Integer.parseInt(input);
        new DrawHorizontalLine().drawLine(n);
    }
    private void drawLine(int n){
        for(int i=0;i<n;i++){
            System.out.print('*');
        }
    }
}
