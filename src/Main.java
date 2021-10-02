public class Main {
    public static void main(String[] args) {
        int sum = 100;
        int add = 1100;
        int bonus;
            if (add >= 1000) {
                bonus = add / 100;
            } else {
                bonus = 0;
            }
        int totalSum = sum + add + bonus;

        System.out.println("Сумма счета: " + totalSum + " руб.");
        System.out.println("Бонус составил: " + bonus + " руб.");
    }
}