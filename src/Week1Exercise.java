public class Week1Exercise {
    public static void main(String[] args) {
        String customerName = "Arissa";
        String accountNumber = "8937282919";
        double balance = 1269.09;
        boolean isPremium = true;
        double interestRate = 0.035;
        double interest = balance * interestRate;
        String expectedTitle = "Dashboard";
        String actualTitle = "Dashboard";

        System.out.println("Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Premium?: " + isPremium);
        System.out.println(actualTitle.equals(expectedTitle));
        System.out.printf("Interest : %.2f%n", interest);


    }
}
