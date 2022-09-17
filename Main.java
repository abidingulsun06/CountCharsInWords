import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Örnek Cümle
        //Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.
        Scanner s = new Scanner(System.in);
        boolean devamMi = true;

        System.out.println("Bir cümlede kaç karakter programını başlatmak için 'E' programdan çıkmak için 'H'");
        char secim = s.next().charAt(0);

        control(secim);

        if (secim == 'E' || secim == 'e') {
            while (devamMi) {
                s.nextLine();
                System.out.println("Bir Cümle giriniz:");
                String cumle = s.nextLine();

                if (cumle.length() == 0 || cumle == " ") {
                    System.out.println("Bir Cümle girmediniz tekrar girin:");
                    cumle = s.next();
                }

                if (cumle.length() != 0) {
                    System.out.println("Bir harf giriniz:");
                    char harf = s.next().charAt(0);

                    int count = 0;
                    for (int i = 0; i < cumle.length(); i++) {
                        if (cumle.charAt(i) == harf || cumle.charAt(i) == Character.toUpperCase(harf)) {
                            count++;
                        }
                    }

                    System.out.println("Cümlede " + count + " adet " + harf + " yada " +
                            Character.toUpperCase(harf) + " bulunmaktadır.");

                    System.out.println("Tekrar Başlamak için 'E' Programdan çıkmak için 'H'");
                    secim = s.next().charAt(0);

                    control(secim);

                    if (secim == 'H' || secim == 'h') {
                        System.out.println("Kullandığınız için teşekkürler :)");
                        return;
                    }

                }
            }
        } else if (secim == 'H' || secim == 'h') {
            devamMi = false;
            System.out.println("Kaç karakter geçiyor programımızı kullandığınız için teşekkürler");
        }

        s.close();
    }

    static void control(char par) {
        Scanner s = new Scanner(System.in);
        while (par != 'E' && par != 'e' && par != 'H' && par != 'h' && par == ' ') {
            System.out.println("Geçerisiz bir işlem yaptınız Tekrar deneyin.");

            System.out.println("Devam etmek istiyorsanız 'E' Programdan çıkmak için 'H'");
            par = s.next().charAt(0);

        }
        s.close();
    }

}
