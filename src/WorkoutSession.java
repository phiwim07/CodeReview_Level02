public class WorkoutSession {

    private Person person;
    private AerobicExercise[] aerobicExercises;
    private StrengtheningExercise[] strengtheningExercises;
    private final int MAX_EXERCISES = 10;
    private int totalCaloriesBurned;

    public WorkoutSession(Person person) {
        this.person = person;
        aerobicExercises = new AerobicExercise[MAX_EXERCISES];
        strengtheningExercises = new StrengtheningExercise[MAX_EXERCISES];
        totalCaloriesBurned = 0;
    }

    public WorkoutSession(WorkoutSession workoutsession) {
        this.person = workoutsession.person;
        this.aerobicExercises = workoutsession.aerobicExercises;
        this.strengtheningExercises = workoutsession.strengtheningExercises;
        this.totalCaloriesBurned = workoutsession.totalCaloriesBurned;
    }

    public void setPerson(Person person) {
        this.person = person;
        recalculateCaloriesBurned();
    }

    public Person getPerson() {
        return this.person;
    }

    public int getTotalCaloriesBurned() {
        return this.totalCaloriesBurned;
    }

    public void addAerobicExercise(AerobicExercise exercise) {
        for (int i = 0; i < MAX_EXERCISES; i++) {
            if (aerobicExercises[i] == null) {
                aerobicExercises[i] = exercise;
                updateTotalCaloriesBurned(exercise);
                return;
            }
        }
    }

    public void addStrenghteningExercise(StrengtheningExercise exercise){
        for (int i = 0; i < MAX_EXERCISES; i++){
            if (strengtheningExercises[i] == null){
                strengtheningExercises[i] = exercise;
                updateTotalCaloriesBurned(exercise);
                return;
            }
        }
    }

    private void updateTotalCaloriesBurned(AerobicExercise exercise) {
        totalCaloriesBurned += (int)(exercise.getDuration() * person.getWeight() * 17.5) / 200;
    }

    private void updateTotalCaloriesBurned(StrengtheningExercise exercise){
        totalCaloriesBurned += (exercise.getDuration() * 6);
    }

    private void recalculateCaloriesBurned(){
        totalCaloriesBurned = 0;
        for (int i = 0; i < MAX_EXERCISES; i++) {
            updateTotalCaloriesBurned(aerobicExercises[i]);
            updateTotalCaloriesBurned(strengtheningExercises[i]);
        }
    }

}
