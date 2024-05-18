import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    

        //  UserStory без залежностей
        UserStory userStory1 = new UserStory(1, "Розробка інтерфейсу користувача", 4, new ArrayList<>());
        UserStory userStory2 = new UserStory(2, "Імплементація логіки програми", 6, Arrays.asList(userStory1));
        UserStory userStory3 = new UserStory(3, "Тестування функціоналу", 3, Arrays.asList(userStory2));
        UserStory userStory4 = new UserStory(4, "Реліз на маркетплейсах", 2, Arrays.asList(userStory3));

        System.out.println("Створення тікетів UserStory:\n" + userStory1 + "\n" + userStory2 + "\n" + userStory3 + "\n" + userStory4 + "\n\n");

        // Зараз треба спринт та додаємо UserStory до нього
        Sprint sprint = new Sprint(15, 5); 
        System.out.println("Статус UserStory1: " + sprint.addUserStory(userStory1) +
            "\nСтатус UserStory2: " + sprint.addUserStory(userStory2) +
            "\nСтатус UserStory3: " + sprint.addUserStory(userStory3) +
            "\nСтатус UserStory4: " + sprint.addUserStory(userStory4) + "\n\n");

        // Загальну оцінку почасу виконання спринту
        checkingTotalEstimateTime(sprint);

        // Перший тікет зроблено та перевіряємо загальну оцінку часу виконання спринту
        userStory1.complete();
        checkingTotalEstimateTime(sprint);

        // Створюємо баг і додаємо його до спринту для перевірки оновлення загальної оцінки часу виконання спринту
        Bug bug1 = Bug.createBug(5, "Виправлення багу в інтерфейсі користувача", 2, userStory1);
        if (bug1 != null) {
            System.out.println(bug1);
            sprint.addBug(bug1);
        } else {
            System.out.println("Не вдалося створити баг для незавершеної UserStory або UserStory = null.");
        }
        checkingTotalEstimateTime(sprint);

        // Виправляємо баг і знову перевіряємо загальну оцінку часу виконання спринту
        if (bug1 != null) {
            bug1.complete();
        }
        checkingTotalEstimateTime(sprint);

        // Завершуємо інші тікети і перевіряємо оцінку часу
        userStory2.complete();
        userStory3.complete();
        userStory4.complete();

        checkingTotalEstimateTime(sprint);

        System.out.println("Результати:");
        List<Ticket> tickets = sprint.getTickets(); // Використовуємо List замість ArrayList
        for (Ticket ticket : tickets){
            System.out.println("'" + ticket + "' завершено");
        }
    }

    public static void checkingTotalEstimateTime(Sprint sprint) {
        System.out.println("Загальна оцінка часу виконання спринту: " + sprint.getTotalEstimate() + "\n\n");
    }
}
