public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double total = service.calculate(62.5 , 1.81);
        System.out.println(total);
    }
}
