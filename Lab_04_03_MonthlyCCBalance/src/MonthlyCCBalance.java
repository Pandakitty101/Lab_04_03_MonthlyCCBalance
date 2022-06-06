public class MonthlyCCBalance {
    public static void main(String[] args)
    {
        int creditCardBalance = 5000;
        final double INTEREST_RATE = 0.17;
        double firstMonthInterest;
        double firstMonthBalance;
        double secondMonthInterest;

        firstMonthInterest = creditCardBalance * INTEREST_RATE;
        firstMonthBalance = firstMonthInterest + creditCardBalance;
        secondMonthInterest = firstMonthBalance * INTEREST_RATE;

        System.out.println("Your interest for the first month with a starting balance of 5000 and an interest rate of 17% is " + firstMonthInterest);
        System.out.println("Your interest for the second month is " + secondMonthInterest);

    }
}
