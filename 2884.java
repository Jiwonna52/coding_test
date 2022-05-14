import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int H = in.nextInt();
        int M = in.nextInt();
        int tmp = 0;
        
        if(M >= 45){
            M = M - 45;
        }else{
                tmp = M - 45;
                M = 60 + tmp;
            if(H == 0){
                H = 23;
            }else{
                H = H - 1;
            }
        }
        
        System.out.print(H + " " + M);
        in.close();
        
    }
}
