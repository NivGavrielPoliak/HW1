public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int aprroxBy = Integer.parseInt(args[0]);
        int sign = 1;

        for (int i = 0; i < aprroxBy; i++) 
        {
                approxPi += sign*1.0/(2*i+1); 
                sign *= -1; //alternate between positive and negative sign via the placement of the approximation
        }
        approxPi = 4 * approxPi;     
        System.out.println(approxPi + " " + actualPi);
    }
}
