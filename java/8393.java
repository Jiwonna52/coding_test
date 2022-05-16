import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            answer += i;
        }
        
        System.out.println(answer);
    }
}
