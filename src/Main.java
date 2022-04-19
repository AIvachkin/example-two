public class Main {
    public static void main(String[] args) {
// задание 4
        short diet1 = 250 ;
      short diet2 = 500 ;
      int weightLoss = 7000 ;
      int daysDiet1 = weightLoss / diet1 ;
      int daysDiet2 = weightLoss / diet2 ;
      System.out.println("При первой диете необходимо " + daysDiet1 + " дней для сброса веса");
      System.out.println("При второй диете необходимо " + daysDiet2 + " дней для сброса веса");
      int averageDays = (daysDiet1 + daysDiet2)/2 ;
      System.out.println("В среднем уйдет " + averageDays + " дней на сброс веса");

    }
}