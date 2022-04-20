public class Main {
    public static void main(String[] args) {
int Masha = 67760 ;
int Denis = 83690 ;
int Kristina = 76230 ;
byte year = 12 ;
float Profit = 1.1f ;
int currentIncomeMasha = Masha*year ;
int currentIncomeDenis = Denis*year ;
int currentIncomeKristina = Kristina*year ;
float futureIncomeMasha = currentIncomeMasha*Profit ;
float futureIncomeDenis = currentIncomeDenis*Profit ;
float futureIncomeKristina = currentIncomeKristina*Profit ;
float deltaMasha = futureIncomeMasha - currentIncomeMasha ;
float deltaDenis = futureIncomeDenis - currentIncomeDenis ;
float deltaKristina = futureIncomeKristina - currentIncomeKristina ;

System.out.println("Маша будет получать после прибавки " + futureIncomeMasha + " руб/мес. " +
        "Ее доход в годовом исчислении вырасет на " + deltaMasha + " руб");
System.out.println("Денис будет получать после прибавки " + futureIncomeDenis + " руб/мес. " +
                "Его доход в годовом исчислении вырасет на " + deltaDenis + " руб");
System.out.println("Кристина будет получать после прибавки " + futureIncomeKristina + " руб/мес. " +
                "Ее доход в годовом исчислении вырасет на " + deltaKristina + " руб");
    }
}