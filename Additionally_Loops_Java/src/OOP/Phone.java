package OOP;

public class Phone {
        private String number;
        private String model;
        private double weight;

        // Конструктор с тремя параметрами
        public Phone(String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        // Конструктор с двумя параметрами (вызывает конструктор с тремя параметрами)
        public Phone(String number, String model) {
            this(number, model, 0.0);
        }

        // Конструктор без параметров
        public Phone() {
            this("", "", 0.0);
        }

        // Геттер для поля number
        public String getNumber() {
            return number;
        }

        // Метод receiveCall с одним параметром
        public void receiveCall(String callerName) {
            System.out.println("Звонит " + callerName);
        }

        // Перегруженный метод receiveCall с двумя параметрами
        public void receiveCall(String callerName, String callerNumber) {
            System.out.println("Звонит " + callerName + ". Номер телефона: " + callerNumber);
        }

        // Метод sendMessage с переменной длиной аргументов
        public void sendMessage(String... numbers) {
            System.out.println("Отправка сообщения по следующим номерам:");
            for (String number : numbers) {
                System.out.println(number);
            }
        }

        // Геттер и сеттер для поля model
        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        // Геттер и сеттер для поля weight
        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }
    }
