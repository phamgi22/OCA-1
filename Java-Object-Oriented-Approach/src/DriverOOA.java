import java.util.ArrayList;
import java.util.List;

public class DriverOOA {
    public static void main(String[] args) {
        List<Exercise> exerciseList = new ArrayList<>();
        Exercise soccer = new Soccer(12.5);
        Exercise sprint = new Sprint(0.1);
        Exercise stroll = new Stroll(10);
        Exercise raceWalking = new RaceWalking(5);
        exerciseList.add(soccer);
        exerciseList.add(stroll);
        exerciseList.add(sprint);
        exerciseList.add(raceWalking);
        performExcercises(exerciseList);
    }

    public static void performExcercises(List<Exercise> exerciseList) {
        for (Exercise e : exerciseList) {
            if (e instanceof BallSport) {
                System.out.println(e.getClass().getSimpleName());
            } else if (e instanceof OlympicSport) {
                System.out.println(e.getClass().getSimpleName());
            }
        }
    }
}
