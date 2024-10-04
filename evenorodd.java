import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a = s.nextInt();
        if (a%2==0)
        System.out.println("EVEN");
        else 
        System.out.println("Odd");
    }
}
