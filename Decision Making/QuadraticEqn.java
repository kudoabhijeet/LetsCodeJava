import java.util.*;

public class QuadraticEqn {
    public static void main(String[] args) {
        
        double a,b,c;
        double d ,r1,r2;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Quadratic Equation : Ax^2 +Bx + C");
        System.out.println("Enter Value of A :");
        a = sc.nextDouble();
        System.out.println("Enter Value of B :");
        b = sc.nextDouble();
        System.out.println("Enter Value of C :");
        c = sc.nextDouble();

        // Determinant 
        d = b*b - 4*a*c;
        if (d > 0){
            r1 = (-b + Math.sqrt(d)) / (2 * a);
            r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", r1,r2);
        }
        else if (d == 0) {
            r1=r2 = -b / 2*a;
            System.out.format("root1 = root2 = %.2f;", r1);
        }
        else {
            System.out.println("Complex Roots!");
        }

    }
}