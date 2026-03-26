public class StrengtheningExercise {
    private String name;
    private int duration;
    private int repetitions;
    private int weight;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return this.duration;
    }

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

    public StrengtheningExercise(String name, int duration, int repetitions, int weight) {
        this.name = name;
        this.duration = duration;
        this.repetitions = repetitions;
        this.weight = weight;
    }

    public StrengtheningExercise(StrengtheningExercise strengtheningExercise) {
        this.name = strengtheningExercise.getName();
        this.duration = strengtheningExercise.getDuration();
        this.repetitions = strengtheningExercise.getRepetitions();
        this.weight = strengtheningExercise.getWeight();
    }


}
