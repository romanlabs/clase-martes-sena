
public static void main(String[] args) {
    int a = 8;
    int b = 5;
    int c = 0;

    System.out.println("los valores normales de 'a' y de 'b' son " + a + b );
    System.out.println("El objetivo es cambiar de lugar los valores de 'a' y de 'b'.");
    
    c = a;
    a = b;
    b = c;
    
    System.out.println("ahora los valores son " + a + b);

    System.out.println("---------------------------------");
    System.out.println("ahora sin la variable '3'");

    int r = 10;
    int m = 5;

    r = r+m; 
    m = r-m;
    r = r-m;
     
    System.out.println("valores " + r + m);



}