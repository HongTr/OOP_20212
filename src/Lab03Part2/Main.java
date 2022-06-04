package Lab03Part2;

public class Main {
    public static void main(String[] args) {
        Account s1 = new Account();
        s1.setName("Truong Minh Hong");
        s1.setBalance(2019);

        System.out.println("Your account has: " + s1.getBalance());

        s1.withDraw(2000);
    }
}
