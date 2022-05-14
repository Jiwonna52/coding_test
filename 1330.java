import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        
        if(A > B){
            System.out.print(">");
        }else if(A < B){
            System.out.print("<");
        }else{
            System.out.print("==");
        }
    }
}
