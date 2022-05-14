import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int v = 0;
        
        if((a == b) && (b == c) && (a == c)){
            v = 10000 + (a * 1000);
        }else if((a == b) && (a != c)){
            v = 1000 + (a*100);
        }else if((a == c) && (b != c)){
            v = 1000 + (a*100);
        }else if((b == c) && (a != b)){
            v = 1000 + (b*100);
        }else{
            v = (Math.max(a, Math.max(b, c))) * 100;
        }
        
        System.out.print(v);
        in.close();
    }
}
