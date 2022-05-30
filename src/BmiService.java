public class BmiService {
    public double calculate(double height, double weight) {
        double rezult = weight / (height * height);
        return rezult;

    }
}
