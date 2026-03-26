public class Person {

    private String name = "UNKNOWN";
    private double weight = 70;
    private double height = 1.8;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            printError("height");
            return;
        }
        this.height = height;
    }

    public void reduceHeight(double height){
        this.height = height * 0.9;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0) {
            printError("weight");
            return;
        }

        this.weight = weight;
    }

    public Person() {

    }


    public Person(String name, double weight, double height) {
        setName(name);
        setHeight(height);
        setWeight(weight);
    }

    public Person(Person other) {
        this.name = other.name;
        this.height = other.height;
        this.weight = other.weight;
    }

    private void printError(String update) {
        System.out.println("Value for " + update + " must be > 0");
    }

    public double getBmi() {
        return (this.weight / (this.height / 100 * this.height / 100));
    }

    public String asString() {
        return String.format("Name: %s, Height: %.2f, Weight: %.2f, BMI: %.2f",
                this.name, this.height, this.weight, this.getBmi());
    }


}
