import java.util.Random;

public class AgesProgram {

    public static void main(String[] args) {
        int[] team1 = generateTeamAges(25);
        int[] team2 = generateTeamAges(25);

        System.out.println("Команда №1:");
        printTeamAges(team1);
        double averageAge1 = calculateAverageAge(team1);
        System.out.println("Середній вік команди №1: " + averageAge1);

        System.out.println("Команда №2:");
        printTeamAges(team2);
        double averageAge2 = calculateAverageAge(team2);
        System.out.println("Середній вік команди 2: " + averageAge2);
    }

    public static int[] generateTeamAges(int teamSize) {
        int[] ages = new int[teamSize];
        Random random = new Random();

        for (int i = 0; i < teamSize; i++) {
            ages[i] = random.nextInt(23) + 18; // Випадковий вік від 18 до 40
        }

        return ages;
    }

    public static void printTeamAges(int[] ages) {
        for (int age : ages) {
            System.out.print(age + " ");
        }
        System.out.println();
    }

    public static double calculateAverageAge(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return (double) sum / ages.length;
    }
}