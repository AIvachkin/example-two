public class Main {
    public static void main(String[] args) {

        // задание 3
        byte banan = 5;
        byte bananWeight = 80;
        short milk = 200;
        int milkWeight = milk/100*105;
        byte icecream = 2;
        byte icecreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;
        int breakfastWeight = banan * bananWeight + milkWeight + icecream * icecreamWeight + egg * eggWeight;
        float breakfastKG = breakfastWeight/1000f;
        System.out.println("Вес спорт-завтрака " + breakfastKG + " кг");

    }
}