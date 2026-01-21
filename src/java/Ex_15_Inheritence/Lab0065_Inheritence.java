package Ex_15_Inheritence;

public class Lab0065_Inheritence {
    //Inheriting the properties from parent class (Super class) to child class (sub class) id called as inheritance.

    //A child class can inherit some properties from his parent class also it has his own properties as well.
    //It reduces the complexity of code.
    //ex -
    static class Monkey {
        void eat() {
            System.out.println("eat");
        }

        void sleep() {
            System.out.println("sleep");
        }

        void jump() {
            System.out.println("jump higher");
        }
    }

    static class Human extends Monkey {

        void drive() {
            System.out.println("drive");
        }

        void jump() {
            System.out.println("jump little higher");
        }
    }
    //same method parent having and child also having called as Method Overriding. If child also possess same
    // properties then it is override.

    static class Superhuman extends Human {
        void code() {
            System.out.println("code");
        }
    }
    //Monkey is parent class with his own properties then Human has properties of money and its own and
    //superhuman has properties of monkey,human and his own and this concept is called as Multilevel Inheritance.

    //How to create object for Super class(Monkey)?
    class Inheritance {
        public static void main(String[] args) {
            Monkey obj1 = new Monkey();
            Human obj2 = new Human();
            Superhuman obj3 = new Superhuman();
        }

    }
}




