import java.util.*;
    class Animal
    {
        public int age;

        public Animal(int age)
        {
          this.age = age;
          System.out.println("An animal has been created.");
        }

        public void eat()
        {
          System.out.println("An animal is eating");
        }
    }

      class Dog extends Animal
      {
          public Dog()
          {
            super(15);
            System.out.println("A dog has been created.");
          }

          public void ruff()
          {
            System.out.println("The dog says ruff");
          }

          public void run()
          {
            System.out.println("The dog is running.");
          }
      }

      class Cat extends Animal
      {
          public Cat()
          {
            super(7);
            System.out.println("A cat has been created.");
          }

          public void meow()
          {
            System.out.println("A cat meows");
          }

          public void prance()
          {
            System.out.println("a cat is prancing");
          }
      }


      public class Inheritance
      {
        public static void main(String args[])
        {
          Animal a = new Animal(5);
          Dog d = new Dog();
          Cat c = new Cat();
          d.ruff();
          c.meow();
          a.eat();
          d.eat();
          c.eat();
          d.run();
          c.prance();
        }
    }
