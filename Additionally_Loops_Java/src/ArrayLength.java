public class ArrayLength {
    public static void main(String[] args) {
        String[] company = {"MAIB", "ORANGE", "CRISTAL", "CEDACRI", "ENDAVA"};
        int count = getArrayLength(company);
        System.out.println("Количество элементов в массиве: " + count);
    }

    public static int getArrayLength(String[] array) {
        return array.length ;
    }
}