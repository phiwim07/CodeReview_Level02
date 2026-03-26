public class AerobicExercise {

    String name;
    int duration;
    int distance;

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

    public AerobicExercise(String name, int duration, int distance){
        this.name = name;
        this.duration = duration;
        this.distance = distance;
    }

    public AerobicExercise(AerobicExercise aerobicExercise) {
        this.name = aerobicExercise.getName();
        this.duration = aerobicExercise.getDuration();
        this.distance = aerobicExercise.getDistance();
    }
}
