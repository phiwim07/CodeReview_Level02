public class AerobicExercise extends Exercise{

    private int distance;

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
        return String.format("Name: %s, Duration: %d, Distance: %d", getName(), getDuration(), this.distance);
    }

}
