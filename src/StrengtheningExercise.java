public class StrengtheningExercise extends Exercise {

    private int repetitions;
    private int weight;

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public int getRepetitions() {
        return this.repetitions;
    }

    public StrengtheningExercise(){
        super("UNKNOWN", 0);
        this.repetitions = 0;
        this.weight = 0;
    }

    public StrengtheningExercise(String name, int duration, int repetitions, int weight) {
        super(name, duration);
        this.repetitions = repetitions;
        this.weight = weight;
    }

    public StrengtheningExercise(StrengtheningExercise strengtheningExercise) {
        super(strengtheningExercise.getName(), strengtheningExercise.getDuration());
        this.repetitions = strengtheningExercise.getRepetitions();
        this.weight = strengtheningExercise.getWeight();
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", Repetitions: %d, Weight: %d", this.repetitions, this.weight);
    }


}
