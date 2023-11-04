public class BankAccount {
        private double principal;
        private double rate;
        private int time;
    
        public BankAccount(double principal, double rate, int time) {
            this.principal = principal;
            this.rate = rate;
            this.time = time;
        }
    
        public double calculateSimpleInterest() {
            return principal * rate * time;
        }
    
        public double calculateCompoundInterest() {
            double compoundInterest = principal * Math.pow((1 + rate), time) - principal;
            return compoundInterest;
        }
        public static void main(String[] args) {
            double principal = 100000;
            double rate = 0.05;
            int time = 5;
    
            // Calculate simple interest
            BankAccount account1 = new BankAccount(principal, rate, time);
            double simpleInterest = account1.calculateSimpleInterest();
    
            // Calculate compound interest
            BankAccount account2 = new BankAccount(principal, rate / 12, time * 12);
            double compoundInterest = account2.calculateCompoundInterest();
    
            System.out.println("Simple Interest: " + simpleInterest + " RWF");
            System.out.println("Compound Interest: " + compoundInterest + " RWF");
    
            // Calculate total amount paid with compound interest for loan
            double loanPrincipal = 500000;
            double loanRate = 0.18;
            int loanTime = 3;
    
            BankAccount loan = new BankAccount(loanPrincipal, loanRate / 12, loanTime * 12);
            double totalPayment = loanPrincipal + loan.calculateCompoundInterest();
            
            System.out.println("Total payment with compound interest: " + totalPayment + " RWF");
        }
    }

