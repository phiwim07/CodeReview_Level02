public class Exercise {
    String name;
    int duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiration() {
        return duration;
    }

    public void setDiration(int duration) {
        this.duration = duration;
    }

    public Exercise(String name, int duration){
        this.name = name;
        this.duration = duration;
    }


}
