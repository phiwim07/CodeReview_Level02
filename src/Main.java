public class Main {
    public static void main(String[] args) {

        Person person = new Person("Philipp Wimmer", 80, 184);

        AerobicExercise running = new AerobicExercise("Running", 60, 12);
        StrengtheningExercise benchpress = new StrengtheningExercise("Benchpress", 20, 10, 100);
        WorkoutSession workoutsession = new WorkoutSession(person);
        workoutsession.addAerobicExercise(running);
        workoutsession.addStrenghteningExercise(benchpress);

        System.out.println(person.asString());
        System.out.println("Calories burned: " + workoutsession.getTotalCaloriesBurned());
    }


}
