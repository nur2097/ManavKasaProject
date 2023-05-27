import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double aTl = 2.14;
        double aKg;
        double eTl = 3.67;
        double eKg;
        double dTl = 1.11;
        double dKg;
        double mTl = 0.95;
        double mKg;
        double pTl = 5.00;
        double pKg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo : ");
        aKg = inp.nextInt();

        System.out.print("Elma kaç kilo : ");
        eKg = inp.nextInt();

        System.out.print("Domates kaç kilo : ");
        dKg = inp.nextInt();

        System.out.print("Muz kaç kilo : ");
        mKg = inp.nextInt();

        System.out.print("Patlıcan kaç kilo : ");
        pKg = inp.nextInt();

        double toplam = aTl * aKg + eTl * eKg + dTl * dKg + mTl * mKg + pTl * pKg ;

        System.out.println("Toplam Tutar : " + toplam);


    }
}
