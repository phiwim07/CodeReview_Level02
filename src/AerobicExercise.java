public class AerobicExercise extends Exercise{

    private String name;
    private int duration;
    private int distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public AerobicExercise(){
        super("UNKNOWN", 0);
        this.distance = 0;
    }

    public AerobicExercise(String name, int duration, int distance) {
        super(name, duration);
        this.distance = distance;
    }

    public AerobicExercise(AerobicExercise aerobicExercise) {
        super(aerobicExercise.getName(), aerobicExercise.getDuration());
        this.distance = aerobicExercise.getDistance();
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Duration: %d, Distance: %d", this.name, this.duration, this.distance);
    }

}
