import java.util.*;
public class invertedStar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines: ");
        int n= sc.nextInt();
        for(int line=n;line>0;line--){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
