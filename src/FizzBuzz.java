import java.io.IOException;

/**
 * Created by siddharth on 7/8/16.
 */
public class FizzBuzz {
    public FizzBuzz(){
        for(int i=0;i<100;i++){
            int n=i+1;
            if(n%15==0)
                System.out.println("FizzBuzz");
            else if(n%5==0)
                System.out.println("Buzz");
            else if(n%3==0)
                System.out.println("Fizz");
            else
                System.out.println(n);
            }
        }

    public static void main(String args[])throws IOException {
        new FizzBuzz();
    }
}
