public class Idman {
    private int burpee_sayisi;
    private int push_up_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(){

    }
    public Idman(int burpea_sayisi, int push_up_sayisi, int situp_sayisi, int squat_sayisi){
        this.burpee_sayisi=burpea_sayisi;
        this.push_up_sayisi=push_up_sayisi;
        this.situp_sayisi=situp_sayisi;
        this.squat_sayisi=squat_sayisi;
    }
    public int getBurpea_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpea_sayisi(int burpea_sayisi) {
        this.burpee_sayisi = burpea_sayisi;
    }

    public int getPush_up_sayisi() {
        return push_up_sayisi;
    }

    public void setPush_up_sayisi(int push_up_sayisi) {
        this.push_up_sayisi = push_up_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hareketiyap(String Hareketturu,int sayi){
        if (Hareketturu.equals("Burpee")){
            burpeeyap(sayi);
        } else if (Hareketturu.equals("Push Up")) {
            push_upyap(sayi);
        } else if (Hareketturu.equals("Sit Up")) {
            sit_upyap(sayi);
        } else if (Hareketturu.equals("Squat")) {
            squat_yap(sayi);
        }else{
            System.out.println("geçersiz Hareket....");
        }
    }

    public void burpeeyap(int sayi){
        if (burpee_sayisi == 0){
            System.out.println("Yapacak burpee kalmadı...");
        } else if (burpee_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin burpee sayısını geçtin...");
            burpee_sayisi=0;
            System.out.println("Kalan burpee : " + burpee_sayisi);
        }else {
            burpee_sayisi-=sayi;
            System.out.println("Kalan burpee sayısı : " + burpee_sayisi);
        }
    }
    public void push_upyap(int sayi){
        if (push_up_sayisi == 0){
            System.out.println("Yapacak push up kalmadı...");
        } else if (push_up_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin push up sayısını geçtin...");
            push_up_sayisi=0;
            System.out.println("Kalan push up : " + push_up_sayisi);
        }else {
            push_up_sayisi-=sayi;
            System.out.println("Kalan push up sayısı : " + push_up_sayisi);
        }
    }
    public void sit_upyap(int sayi){
        if (situp_sayisi == 0){
            System.out.println("Yapacak sit up kalmadı...");
        } else if (situp_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin sit up sayısını geçtin...");
            situp_sayisi=0;
            System.out.println("Kalan sit up : " + situp_sayisi);
        }else {
            situp_sayisi-=sayi;
            System.out.println("Kalan sit up sayısı : " + situp_sayisi);
        }
    }
    public void squat_yap(int sayi){
        if (squat_sayisi == 0){
            System.out.println("Yapacak squat kalmadı...");
        } else if (squat_sayisi - sayi < 0) {
            System.out.println("Hedeflediğin squat  sayısını geçtin...");
            squat_sayisi=0;
            System.out.println("Kalan squat : " + squat_sayisi);
        }else {
            squat_sayisi-=sayi;
            System.out.println("Kalan squat sayısı : " + squat_sayisi);
        }
    }
    public boolean idmanbittimi(){
        return (burpee_sayisi==0) && (push_up_sayisi == 0) && (situp_sayisi == 0) && (squat_sayisi == 0);
    }

}
