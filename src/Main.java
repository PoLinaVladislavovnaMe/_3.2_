// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      BmiService service= new BmiService();

      double bmi1=(int) service.calculate(98, 1.87);
      System.out.println("Ваш индекс массы тела равен " + bmi1);
      System.out.println();

        double bmi2=(int) service.calculate(76, 1.66);
        System.out.println("Ваш индекс массы тела равен " + bmi2);
        System.out.println();
    }
}