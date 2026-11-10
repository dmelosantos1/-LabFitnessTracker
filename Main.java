import java.util.Scanner;

class Workout{
    String type;
    int duration;
    public void showWorkout(){
        System.out.println("Workout Type: " +type);
        System.out.println("Duration: "+duration+" minutes");
    }
}

class RunningWorkout extends Workout{
    double distance;
    public void ShowDetails(){
        showWorkout();
        System.out.println("Distance: "+distance+ "KM");

        double CalBurned = distance * 60;
        System.out.println("Calories Burned: " +CalBurned+ "kcal");
    }
}

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        RunningWorkout run = new RunningWorkout();

        System.out.print("Enter workout type: ");
        run.type = scanner.nextLine();

        System.out.print("Enter duration (in minutes): ");
        run.duration = scanner.nextInt();

        System.out.print("Enter distance (in km): ");
        run.distance = scanner.nextDouble();

        System.out.println("--- Workout Details ---");
        run.ShowDetails();

        scanner.close();

    }
}