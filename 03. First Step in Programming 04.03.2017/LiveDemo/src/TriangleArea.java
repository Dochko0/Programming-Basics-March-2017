import java.util.Scanner;

/**
 * Created by User on 6.3.2017 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        int result = a*b;
        System.out.println(result);
    }
}
