import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        
        int h = A+((B+C)/60);
        int m = (B+C)%60;
        
        if(h >= 24){
            h = h - 24;
        }
        
        System.out.print(h + " " + m);
        
        in.close();
    }
}
