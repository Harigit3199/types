class Animal
{
    String name,behaviour;
    int age;

    public void animalInfo()
    {
        System.out.println("Information of the Animal: ");
        System.out.println( );
    }
}
class Dog extends Animal
{
    public void dogInfo()
    {
        name="Dog";
        age=5;
        behaviour="barking";
        System.out.println("Name of the Animal: "+name);
        System.out.println("Age of the dog: "+age);
        System.out.println("Behaviour of the dog: "+ behaviour);

    }
}
class Cat extends Animal
{
    public void catInfo()
    {
        name= "Cat";
        age=3;
        behaviour="Sleeping";
        System.out.println("Name of the Animal: "+name);
        System.out.println("Age of the cat: "+age);
        System.out.println("Behaviour of the cat: "+behaviour);
        System.out.println( );
    }
}
public class Hierarchicaldemo
{
    public static void main(String[] args)
    {
        Cat cat= new Cat();
        cat.animalInfo();
        cat.catInfo();
        Dog dog= new Dog();
        dog.animalInfo();
        dog.dogInfo();


    }
}