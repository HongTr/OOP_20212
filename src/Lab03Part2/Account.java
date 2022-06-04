package Lab03Part2;

public class Account {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    private String Name;
    private float Balance;

    public void insert(float money){
        System.out.println("You have inserted " + money + "!");
        Balance += money;
        System.out.println("Your account balance: " + Balance);
    }

    public void withDraw(float money){
        if (money > Balance){
            System.out.println("Sorry, your account doesn't have enough money!");
        }
        else{
            System.out.println("You will withdraw " + money + "!");
            Balance -= money;
            System.out.println("Your account balance" + Balance);
        }
    }
}
