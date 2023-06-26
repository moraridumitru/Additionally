package Examclouds_com;
/**  Создать массив типа String с размером 7.
     Записать в него значения дней недели.
     Вывести на консоль значение последнего элемента. */
public class ArrayDemo1 {
        public static void main(String[] args) {
            String[] daysOfWeek = new String[7];

            daysOfWeek[0] = "Понедельник";
            daysOfWeek[1] = "Вторник";
            daysOfWeek[2] = "Среда";
            daysOfWeek[3] = "Четверг";
            daysOfWeek[4] = "Пятница";
            daysOfWeek[5] = "Суббота";
            daysOfWeek[6] = "Воскресенье";

            String lastDayOfWeek = daysOfWeek[6];
            System.out.println("Последний день недели: " + lastDayOfWeek);
        }
    }
