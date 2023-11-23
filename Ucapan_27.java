import java.util.Scanner;
public class Ucapan_27 {
    
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String nama0rang = sc.nextLine();
        sc.close();;
        return nama0rang;
    }  
}
