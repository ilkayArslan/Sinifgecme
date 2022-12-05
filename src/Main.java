import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,tur,kimya,fizik,muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if(mat>100||mat<0) mat = 0;
        System.out.print("Lütfen Türkçe notunuzu giriniz : ");
        tur = input.nextInt();
        if(tur>100||tur<0) tur = 0;
        System.out.print("Lütfen Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if(kimya>100||kimya<0) kimya = 0;
        System.out.print("Lütfen Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if(fizik>100||fizik<0) fizik = 0;
        System.out.print("Lütfen Müzik notunuzu giriniz : ");
        muzik = input.nextInt();
        if(muzik>100||muzik<0) muzik = 0;

        double average = (mat+tur+kimya+fizik+muzik)/5;
        System.out.print(average<55? "Ortalaman : "+average + " ne yazık ki kaldın":"Ortalaman : "+average+" Tebrikler geçtin");
    }
}