import java.util.*;
public class characterPattern {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of lines ");
    int n = sc.nextInt();
    char ch= 'A';
    for(int i = 1;i<=n; i++){
        for(int alpha=1;alpha<=i;alpha++){
           System.out.print(ch);
           ch++;
        }
        System.out.println();
        
    }
   } 
}
