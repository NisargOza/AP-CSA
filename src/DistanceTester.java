public class DistanceTester
{
    public static void main(String[] args)
    {
        // Create three Distance objects

        // Convert one to miles, one to leagues and
        // double one mileage

        // Print out the converted values
        // Use the getter!
        Distance value = new Distance(5.0);
        double milesConversion = value.toMiles();
        System.out.println(value.getKilometers() + " km  = " + milesConversion + " miles ");

        Distance value2 = new Distance(20.0);
        double leaguesConversion = value.toLeagues();
        System.out.println(value2.getKilometers() + " km = " + leaguesConversion + " leagues ");

        Distance value3 = new Distance(10.0);
        double milesDouble = value3.doubleMiles();
        System.out.print(value3.getKilometers() + " km (one way) = " + milesDouble + " (round trip)");
    }
}


