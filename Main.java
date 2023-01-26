import java.util.Scanner;
    // Uçak Bileti Fiyatı Hesaplama
    // Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
    // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
    // Mesafe başına ücret 0,10 TL / km olarak alın.
    // İlk olarak uçuşun toplam fiyatını hesaplayın
    // Sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
    // Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2)
    // Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    // Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    // Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    // Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    // Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
public class Main {
        public static void main(String[] orgs) {
            int km, TL, yas, tip;
            double startKm = 0.10;
            double sonuc, indirim, toplam, gdi;
            Scanner input = new Scanner(System.in);

            System.out.print("Gideceğiniz mesafeyi km cinsinden giriniz : ");
            km = input.nextInt();
            System.out.print("Yaşınızı giriniz : ");
            yas = input.nextInt();
            System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
            tip = input.nextInt();

            if (km <= 0 || yas <= 0 || (tip != 1 && tip != 2)) {
                System.out.println("Hatalı Veri Girdiniz!");
            } else if ((yas < 12) && (tip == 1)) {
                sonuc = km * startKm;
                indirim = sonuc * 0.50;
                toplam = sonuc - indirim;
                System.out.print("Ödeyeceğiniz tutar :" + toplam + " TL " );
            } else if ((yas < 12) && (tip == 2)) {
                sonuc = km * startKm * 2;
                indirim = sonuc * 0.50;
                gdi = sonuc * 0.20;
                toplam = sonuc - indirim - gdi;
                System.out.print("Ödeyeceğiniz tutar :" + toplam + " TL " );
            } else if ((yas > 12) && (yas <= 24) && (tip == 1)) {
                sonuc = km * startKm;
                indirim = sonuc * 0.10;
                toplam = sonuc - indirim;
                System.out.print("Ödeyeceğiniz tutar :" + toplam + " TL " );
            } else if ((yas > 12) && (yas <= 24) && (tip == 2)) {
                sonuc = km * startKm * 2;
                indirim = sonuc * 0.10;
                gdi = sonuc * 0.20;
                toplam = sonuc - indirim - gdi;
                System.out.print("Ödeyeceğiniz tutar :" + toplam + " TL " );
            } else if ((yas > 24) && (yas < 65) && (tip == 1)) {
                sonuc = km * startKm;
                toplam = sonuc;
            } else if ((yas > 24) && (yas < 65) && (tip == 2)) {
                sonuc = km * startKm * 2;
                gdi = sonuc * 0.20;
                toplam = sonuc - gdi;
                System.out.print("Ödeyeceğiniz tutar :" + toplam + " TL " );
            }else if ((yas > 65)  && (tip == 1)) {
                sonuc = km * startKm;
                indirim = sonuc * 0.30;
                toplam = sonuc - indirim ;
                System.out.print("Ödeyeceğiniz tutar :" + toplam + " TL ");
            }else if ((yas > 65)  && (tip == 2)) {
                sonuc = km * startKm * 2;
                indirim = sonuc * 0.30;
                gdi = sonuc * 0.20;
                toplam = sonuc - indirim - gdi ;
                System.out.print("Ödeyeceğiniz tutar :" + toplam + " TL " );

            }


            }

        }















































