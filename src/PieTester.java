import java.util.ArrayList;

public class PieTester
{
    public static void main(String[] args)
    {
        ArrayList<Pie> pieList = new ArrayList<>();

        pieList.add(new PecanPie(8, "pods"));
        pieList.add(new ApplePie(6));
        pieList.add(new Pie("Rubarb", 12));

        for(Pie pie : pieList) {
            System.out.println(pie.getSlices() + " slice " + pie.getType() + " pie");
        }
    }
}