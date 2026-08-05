import java.util.Scanner;
public class CaF {
    public static void main(String[] args) {
        Scanner cs = new Scanner (System.in);
        int a;
        int f;
        System.out.println("Por favor digite un valor grado C");
        a = cs.nextInt();
        f = (a* 9/5)+32; 
        System.out.println(f);
    }  
}
