public class DragonTester
{
    public static void main(String[] args)
    {
        Dragon drag = new Dragon(6, "w");
        System.out.println(drag);

        System.out.println(drag.getAttack());
        System.out.println(drag.getLevel());
        System.out.println(drag.fight());
    }
}
