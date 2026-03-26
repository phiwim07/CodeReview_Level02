public class Exercise {
    private String name;
    private int duration;

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

    public Exercise(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Duration: %d", name, duration);
    }


}
