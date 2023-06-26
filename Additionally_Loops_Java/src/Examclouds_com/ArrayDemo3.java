package Examclouds_com;
/** Создать массив типа String размером 3х6.
    И записать в него значения:
      a1  a2  a3  a4  a5  a6
      b1  b2  b3  b4  b5  b6
      c1  c2  c3  c4  c5  c6
    Распечатать массив.*/
public class ArrayDemo3 {
    public static void main(String[] args) {
        String[][] array = {
                {"a1", "a2", "a3", "a4", "a5", "a6"},
                {"b1", "b2", "b3", "b4", "b5", "b6"},
                {"c1", "c2", "c3", "c4", "c5", "c6"}
        };

        // Распечатка массива
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
