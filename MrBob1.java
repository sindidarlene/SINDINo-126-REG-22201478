public class MrBob1 {
    public static double CompoundInterest(double p, double r, double t, double n){
        double result = p*Math.pow(1+(r/n),n*t);
        return result;
    }
    public static void main(String args[]){
        MrBob1 CI = new MrBob1();
        double computeSimpleInterest =CI.CompoundInterest(500000, 0.18, 3, 12);
        System.out.println("The Compund Interest of Mr Bob:"+" "+ computeSimpleInterest);
    }
}
