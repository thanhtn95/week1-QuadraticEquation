import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        try {
            System.out.print("Enter a: ");
            a = sc.nextDouble();
            System.out.print("Enter b: ");
            b = sc.nextDouble();
            System.out.print("Enter c: ");
            c = sc.nextDouble();
            QuadraticEquation qe = new QuadraticEquation(a, b, c);
            double delta = qe.getDiscriminant();
            if (delta < 0) {
                System.out.println("The equation has no roots!");
            } else if (delta == 0) {
                System.out.println("Root1 = Root2 = "+qe.getRoot1());
            }else System.out.println("Root1 = "+qe.getRoot1()+", Root2 = "+qe.getRoot2());
            }catch(Exception e){
                System.err.println(e);
            }
        }
    }
