//import java.security.PublicKey;

class ToOverLoad
{
    int getSum(int a,int b)
    {
        return a+b;
    }
    int getSum(int a,int b,int c)
    {
        return a+b+c;
    }
    int  getSum(int ... args)
    { 
        int sum=0;
        for(int x:args)
        {
            sum+=x;
        }
        return sum;
    }
}


// to override

class Animal
 {
    void makeSound() {
        System.out.println("Animal makes a generic sound");
    }
}

class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Dog barks");
    }

    //overload
    void makeSound(int volume)
    {
        System.out.println("Dog bbarks with volume :"+volume);
    }
}

class Cat extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Cat meows");
    }
}

public class Test_overLoad_overRide {
    public static void main(String args[])
    {
        ToOverLoad s=new ToOverLoad();
        System.out.println(s.getSum(1,2,3,4,5));
        System.out.println(s.getSum(1, 1,1));

        // override
        System.out.println("\noverRide ::");
        Animal genereicAnimal=new Animal();
        Animal dog=new Dog();
        Animal cat=new Cat();

        dog.makeSound();
        cat.makeSound();

        // overload 
        System.out.println("\nOverLoad ::\n");
        Dog mydog=new Dog();
        mydog.makeSound();;
        mydog.makeSound(5);

    }
}
