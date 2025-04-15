public class Food {
    private String name;
    private int calories;

    public Food(String theName, int theCalories) {
        name = theName;
        calories = theCalories;
    }

    public void setName(String theName) {
        name = theName;
    }

    public void setCalories(int theCalories) {
        calories = theCalories;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String toString() {
        return name + " have " + calories + " calories.";
    }
}
