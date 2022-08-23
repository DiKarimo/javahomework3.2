public class BmiService {

    public double calculate(double weight, double height) {
        double bmi;
        if (height > 0) {
            bmi = weight / (height * height);
        } else {
            bmi = 0;
        }
        return bmi;
    }
}
