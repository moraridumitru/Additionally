package OOP;


public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("063456789", "iPhone", 150.0);
        Phone phone2 = new Phone("067654321", "Samsung");
        Phone phone3 = new Phone();

        System.out.println("Телефон 1:");
        System.out.println("Номер: " + phone1.getNumber());
        System.out.println("Модель: " + phone1.getModel());
        System.out.println("Вес: " + phone1.getWeight());

        System.out.println("Телефон 2:");
        System.out.println("Номер: " + phone2.getNumber());
        System.out.println("Модель: " + phone2.getModel());
        System.out.println("Вес: " + phone2.getWeight());

        System.out.println("Телефон 3:");
        System.out.println("Номер: " + phone3.getNumber());
        System.out.println("Модель: " + phone3.getModel());
        System.out.println("Вес: " + phone3.getWeight());

        phone1.receiveCall("Александр");
        phone2.receiveCall("Екатерина", "067654321");
        phone3.sendMessage("063456789", "067654321");
    }
}


