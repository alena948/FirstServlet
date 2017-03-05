/**
 * Created by Алёна on 04.03.2017.
 */
public class Calculation {

    public double[] calc(double A, double B, double C) throws Exception {
        double[] roots = new double[2];
        if ((B * B - 4 * A * C) >= 0) {
            roots[0] = (-B + Math.sqrt(B * B - 4 * A * C)) / (2 * A);
            roots[1] = (-B - Math.sqrt(B * B - 4 * A * C)) / (2 * A);
            return roots;
        }
        else throw new Exception();
    }
}
