public class Main {
    public static void main(String[] args) {
        boolean ticket = true;
        int bonus_miles = ticket ? 20 : 0;
        int price_ticket = 12000;
        int free_miles = 12000 / bonus_miles;

        System.out.println("Your bonus miles " + free_miles);


    }
}
