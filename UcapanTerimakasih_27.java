import java.util.Scanner;

public class UcapanTerimakasih_27 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+ " for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anyhting.");        
    }
    public static void UcapanTambahan(String tambahan) {
        System.out.println("Pesan Tambahan: " + tambahan);
    
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
        UcapanTambahan("our dedication to teaching is truly appreciated");
    }
}
