

/**
 *
 *     DEPOSIT, // Представляет собой депозитную транзакцию.
 *      WITHDRAWAL // Представляет собой транзакцию вывода средств
 *
 *  */
enum TransactionType {
    DEPOSIT, // Представляет собой депозитную транзакцию.
    WITHDRAWAL // Представляет собой транзакцию вывода средств
}
 class Amount {
    double amount; // Сумма транзакции
     TransactionType transactionType; //Перечислимое значение, указывающее тип транзакции ( DEPOSIT или WITHDRAWAL).

     public void printAmount(){
         System.out.println(amount + " " + transactionType);
     }
}

class PersonalAccount {
    int accountNumber;
    String  accountHolder;
    double balance;
    Amount[] transactions;
    int transactionCount;
    PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new Amount[10];
    }
    void deposit(double amount){
        this.balance += amount;
    }
    void withdraw(double amount){
        this.balance -= amount;
    }
    void printTransactionHistory(){
        System.out.println("История транзакций для аккаунта " + accountNumber + ":");
        for (int i = 0; i < transactionCount; i++) {
            transactions[i].printAmount();
        }
    }
    double getBalance(){
        return this.balance;
    }
    int getAccountNumber() {
        return accountNumber;
    }
    String getAccountHolder(){
        return accountHolder;
    }
    public void printPersonalAccount(){
        System.out.println(this.accountHolder + ", accountholder " +   this.balance + " balance" + this.accountNumber + " accountNumber" + this.transactions.toString()  + " transaction");
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    public static void main(String[] args) {
        PersonalAccount personalAccount = new PersonalAccount(213123, "RasulJohnBek");

        personalAccount.deposit(1000);
        personalAccount.deposit(500);

        personalAccount.withdraw(200);

        System.out.println("Текущий баланс: " + personalAccount.getBalance());

        personalAccount.printPersonalAccount();
    }
}