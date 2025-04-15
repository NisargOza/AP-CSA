public class Dragon
{
    private String attack;
    private int level;

    public Dragon(int theLevel, String theAttack) {
        level = theLevel;
        attack = theAttack;
    }

    public String getAttack() {
        return attack;
    }

    public int getLevel() {
        return level;
    }
    // Put getters here

    public String fight() {
        String result = "";
        int counter = 0;
        while(counter < level) {
            result += attack;
            counter++;
        }
        return result;
    }

    // String representation of the object
    public String toString()
    {
        return "Dragon is at level " + level + " and attacks with " + attack;
    }
}
