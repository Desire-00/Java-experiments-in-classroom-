class SimpleInterest {

    private double principal;
    private double rate;
    private double time;

    public SimpleInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double computeSimpleInterest() {
        return (principal * rate * time) / 100;
    }
    public static void main(String[] args) {
        // Compute simple interest
        SimpleInterest simpleInterest = new SimpleInterest(100000, 5, 5);
        double simpleInterestAmount = simpleInterest.computeSimpleInterest();
        System.out.println("Simple interest amount: " + simpleInterestAmount);

}
}
