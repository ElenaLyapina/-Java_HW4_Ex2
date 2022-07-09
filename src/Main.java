public class Main {
    public static void main(String[] args) {

        BmiService bodyMassIndex = new BmiService();
        double mass = 65.5;
        double height = 1.72;
        double bmiResult = bodyMassIndex.calculate(mass, height);

        System.out.println(bmiResult);

    }
}
