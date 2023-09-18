import java.util.Scanner;

public class DrawChessBoard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Add meg a tábla méretét:");
        int size = scn.nextInt();

        for(int i = 0;i < size;i++){
            int s;
            if (i % 2 == 0) s = 0;
            else s = 1;
            for(int j = s; j< size;j++){
                if(j % 2 == 0) System.out.print(' ');
                else System.out.print('%');
            }
            System.out.print('\n');
        }
    }
}