package homework.lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        // int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //   for (int i = 0; i < a.length; i++) {


        // public static void two(){
       /* int[] b = new int[8];
        for (int i = 0; i < b.length; i++) {
            b[i] = b[i] * 3;
            System.out.print(b[i]);
        }*/

        public static int four () {
            int[][] a = new int[3][3];
            a[0][0] = 1;
            a[0][1] = 0;
            a[0][2] = 0;
            a[1][0] = 0;
            a[1][1] = 1;
            a[1][2] = 0;
            a[2][0] = 0;
            a[2][1] = 0;
            a[2][2] = 1;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}


