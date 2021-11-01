class Vehicle
{
    public void vehicleType()
    {
        String name="Car";
        System.out.println("Type of vehicle: "+name);
    }
}
class Car extends Vehicle
{
    public void brand()
    {
        String brandname="Ford";
        System.out.println("Name of the brand: "+brandname);
    }
}
class Sportscar extends Car
{
    public void speed()
    {
        int speed= 200;
        System.out.println();
        System.out.println("Maximum Speed of the car: "+ speed+"KMPH");
    }
}
public class Multileveldemo
{
    public static void main(String[] args)
    {
        Sportscar car= new Sportscar();
        car.brand();
        car.speed();
    }
}