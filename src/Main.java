public class Main {
    public static void main(String[] args) {

        boolean ticket = true; // Если билет куплен = тру
        int bonus_miles = ticket ? 20 : 0; // Бонусные мили насчитываются, если билет куплен
        int price_ticket = 12000; // цена билета
        int free_miles = 12000 / bonus_miles; // формула расчета для получения бонусных милей

        System.out.println("Your bonus miles " + free_miles); //вывод результата


    }
}
