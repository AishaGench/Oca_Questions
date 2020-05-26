package Q_34;

public class Animal {
    String type = "Canine";
    int maxSpeed = 60;

    Animal () {}
    Animal (String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

class WildAnimal extends Animal {
    String bounds;
    WildAnimal(String bounds) {
        //line n1
        super(); //can be or not does not matter
        this.bounds = bounds;
    }
    WildAnimal(String type, int maxSpeed, String bounds) {
        //line n2
        super(type, maxSpeed);
        this.bounds = bounds;
    }

//    public static void main(String[] args) {
//        //And given the code fragment:
//        WildAnimal wolf = new WildAnimal("Long");
//        WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
//        System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bounds);
//        System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bounds);
//
//        //Output
//        // Canine 60 long
//        // Feline 80 Short
//
//    }
}
/*
        Which two modifications enable the code to print this output?
        A: Replace line n1 with:
            super();
            this.bounds = bounds

        B: Replace line n1 with:
            this.bounds = bounds
            super();

        C: Replace line n2 with:
            super(type, maxSpeed);
            this(bounds);

        D: Replace line n1 with:
            this("Canine", 60);
            this.bounds = bounds;

        E: Replace line n2 with
            super (type, maxSpeed);
             this.bounds = bounds;

             Answer is: Option A
                        Option E


 */




}
