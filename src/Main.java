public class Main {
    public static void main(String[] args) {

        // задание 1
        byte a = 6;
        short b = -15454;
        int c = 245454766;
        long d = 2125875212L;
        float e = 2.78454f;
        double f = -34.45127865324;
        char g = 43;
        boolean h = a > 8;
        System.out.println (h);
        System.out.println(g);

        // задание 2
        float boxerWeight1 = 78.2f;
        float boxerWeight2 = 82.7f;
        float summBoxWeigth = boxerWeight1 + boxerWeight2;
        float diffBoxWeight = boxerWeight2 - boxerWeight1;
        System.out.println("Общий вес бойцов " + summBoxWeigth + " кг");
        System.out.println("Разница между весами бойцов" + diffBoxWeight + " кг");

    }
}