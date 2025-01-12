package in.ineuron.assignment_4;

class BankAccount {
    private double balance;

    // Constructor to initialize account balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: $" + amount);
            } else {
                System.out.println("Insufficient balance! Cannot withdraw $" + amount);
            }
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}
