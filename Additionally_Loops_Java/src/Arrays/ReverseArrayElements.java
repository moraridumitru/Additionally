package Arrays;

public class ReverseArrayElements {
    public static void main(String[] args){

        String[] a = { "Каждый "," охотник "," желает "," знать "," где "," сидит "," фазан "};
        //Выводим изначальный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];   //n-i-1 это просто формула для определения "противоположного" элемента массива:
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}