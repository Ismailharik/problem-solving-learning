package org.example.lambdaExpression;

public class Main {
    public static void main(String[] args) {
        printThing((s)-> {
            System.out.println("CALLED " + s);
            return "return called";
        });


        // Anonymous Inner Class
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();
        Animal animal = new Animal(){
            @Override
            public void makeNoise() {
//                super.makeNoise(); // this will print how how how again
                System.out.println("Anonymous How How ");
            }
        };
        animal.makeNoise();
    }
    static void printThing(Printable thing){
        System.out.println(thing.print("param"));

    }


}
