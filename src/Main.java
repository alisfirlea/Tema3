import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            double suma=0.0;
            int i=0;
            Scanner newNumber =new Scanner(System.in);
            System.out.println("introduceti numerele : ");
            int num =newNumber.nextInt();
            while (num!=0) {
                suma += num;
                i++;
                num = newNumber.nextInt();


            }
            double media =suma/i;
        System.out.println("Media numerelor introduse este = " +media
        );
    }
}
