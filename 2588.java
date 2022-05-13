import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        String b = in.next();
        
        for(int i = 2; i>=0; i--){
            int to = b.charAt(i)-'0';
            System.out.println(a*to);
        }
        
        int to = Integer.parseInt(b);
        System.out.println(a*to);
        
        in.close();
    }
}

/*#include<iostream>

using namespace std;

int main(void){
    int a, b;
    
    cin >> a >> b;
    
    cout << a*(b%10) << '\n';
    cout << a*((b/10)%10) << '\n';
    cout << a*(b/100) << '\n';
    
    cout << a*b << '\n';
  
}*/
