import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("İdman Programına Hoşgeldiniz");
        String idmanlar = "Geçerli hareketler...\n"
                          +"Burpee\n"
                          +"Push up (Şınav)\n"
                          +"situp (mekik)\n"
                          +"squat";
        System.out.println(idmanlar);
        System.out.println("Bir İdman Programı Oluşturun...");
        System.out.println("Burpee Sayısı");
        int burpee = s.nextInt();
        System.out.println("Push up sayısı");
        int push_up = s.nextInt();
        System.out.println("Sit up sayısı");
        int sit_up = s.nextInt();
        System.out.println("Squat sayısı");
        int squat = s.nextInt();

        s.nextLine();

        Idman idman = new Idman(50,50,50,20);
        System.out.println("İdmanınız Başlıyor...");
        while (!idman.idmanbittimi()){
            System.out.println("Hareket Türü (Burpee,Push up,Sit up,Squat)");
            String tur = s.nextLine();
            System.out.println("Bu hareketlerden kaçar tane yapacaksınız...");
            int sayi = s.nextInt();
            s.nextLine();
            idman.hareketiyap(tur,sayi);
        }
        System.out.println("İdmanını Başarı ile tamamladın Tebrikler...");
    }
}
