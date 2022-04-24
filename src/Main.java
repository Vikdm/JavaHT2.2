public class Main {

    public static void main(String[] args) {

        int score = 100;
        int add = 1800;

        int bonus;
        if (add >= 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        int balance = score + add + bonus;

        System.out.println("Баланс: " + balance);

    }
}
