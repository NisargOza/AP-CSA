public class Distance
{
    private double kilometers;

    public Distance(double km) {
        kilometers = km;
    }
    public double toMiles() {
        double miles = kilometers / 1.609;
        return miles;
    }
    public double toLeagues() {
        double leagues = kilometers / 5.556;
        return leagues;
    }

    public double doubleMiles() {
        double doubledMiles = toMiles() * 2;
        return doubledMiles;
    }

    public double getKilometers() {
        return kilometers;
    }
}
