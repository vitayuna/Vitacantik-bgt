import java.util.Scanner;

public class vitatugas {
    public static void main(String[] args) {
        Scanner vita = new Scanner(System.in);
        String[] nama = new String[6];
        for (int y = 0; y < nama.length; y++) {
            System.out.println("masukan nama siswa");
            nama[y] = vita.nextLine();

        }
        System.out.println("--------------------");
        for (String n : nama);


    }
}
