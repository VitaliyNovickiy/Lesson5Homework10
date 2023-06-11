import java.util.Random;
public class Program {
    public static void main(String[] args) {

                int teamSize = 25;

                int[] team1 = new int[teamSize];
                int[] team2 = new int[teamSize];

                Random random = new Random();

                for (int i = 0; i < team1.length; i++) {
                    team1[i] = random.nextInt(23) + 18;
                    team2[i] = random.nextInt(23) + 18;
                }

                System.out.println("Возраст игроков первой команды:");
                for (int i = 0; i < team1.length; i++) {
                    System.out.print(team1[i] + " ");
                }
                System.out.println();

                System.out.println("Возраст игроков второй команды:");
                for (int i = 0; i < team2.length; i++) {
                    System.out.print(team2[i] + " ");
                }
                System.out.println();

                int sumTeam1 = 0;
                for (int i = 0; i < team1.length; i++) {
                    sumTeam1 += team1[i];
                }
                double AgeTeam1 = (double) sumTeam1 / team1.length;

                int sumTeam2 = 0;
                for (int i = 0; i < team2.length; i++) {
                    sumTeam2 += team2[i];
                }
                double AgeTeam2 = (double) sumTeam2 / team2.length;

                System.out.println("Средний возраст игроков первой команды: " + AgeTeam1);
                System.out.println("Средний возраст игроков второй команды: " + AgeTeam2);
            }
        }

