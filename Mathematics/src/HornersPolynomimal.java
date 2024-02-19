public class HornersPolynomimal {
    public static void main(String[] args) {

        System.out.println("Hello world! \n"+ "Horner's Polynomial Rule");

        int [] poly = {2,-6, 2, 1};
        int x = 3;
        HornersPolynomimal hornersPolynomimal = new HornersPolynomimal();
        int value = hornersPolynomimal.hornersAlgorithm(poly,x);

        System.out.println("Value of polynomial " + value);

    }

    public int hornersAlgorithm(int[] polynomial,int x){
        int result = polynomial[0];


        for(int i = 1; i<polynomial.length; i++){
            result = result*x + polynomial[i];
        }
        return result;
    }
}