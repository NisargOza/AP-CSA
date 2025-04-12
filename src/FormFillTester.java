public class FormFillTester
{
    public static void main(String[] args)
    {
        FormFill information = new FormFill("Karel", "Dog");

        System.out.println(information.fullName());
        information.setBirthday(5, 2012);
        System.out.println(information.birthday());
        information.setEmailAddress("coolDog@email.com");
        System.out.println(information.contactInformation());
    }
}