package Sem1;

public class Sem1 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if ((i % 2 != 0 || i / 2 < 2) && (i % 3 != 0 || i / 3 < 2) && (i % 5 != 0 || i / 5 < 2) && (i % 7 != 0 || i / 5 < 2)) {
                System.out.print(i + " ");
            }
        }
    }
}
