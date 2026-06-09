public class Main {
    public static void main(String[] args) {
        // A1: Create a Dog with no constructors defined.
        Dog d1 = new Dog();
        System.out.println("\nDefaults for d1 fields (before any assignment):");
        System.out.println("name = " + d1.name);   // expected: null
        System.out.println("age = " + d1.age);     // expected: 0
        System.out.println("breed = " + d1.breed); // expected: null
        
        // A2: Print the object directly.
        System.out.println("Printing dog1 directly:");
        System.out.println(d1);

        Dog d2 = new Dog(); // uses default constructor values
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.name + ", age = " + d2.age + ", breed = " + d2.breed);

        Dog d3 = new Dog("Rex", 4, "Collie"); // uses parameterized constructor
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.name + ", age = " + d3.age + ", breed = " + d3.breed);
        
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);

        laptop l1 = new laptop();
        System.out.println("l1 (default constructor): " + l1);

        laptop l2 = new laptop("Dell", 16, 15.6);
        System.out.println("l2 (parameterized): " + l2);

        l2.setRamGB(32);
        l2.setBrand("HP");
        l2.setScreenSize(17.0);

        System.out.println("Updated l2 brand: " + l2.getBrand());
        System.out.println("Updated l2 RAM: " + l2.getRamGB());
        System.out.println("Updated l2 screen size: " + l2.getScreenSize());

        System.out.println("l2 after updates: " + l2);
    }
}
