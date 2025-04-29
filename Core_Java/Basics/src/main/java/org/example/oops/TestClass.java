package org.example.oops;

import org.example.oops.model.Smartphone;
import org.example.oops.views.iPhone;

public class TestClass {

    /*
    This is class, also known as blue-print of custom object
    Here we need to initialize it with constructors,
    and in OOPS concepts we have
    Encapsulation -  like getter, setter
    Polymorphism - In inheritance we can extend the parent attributes, right
                    like if parent has two childers, both can extend there parent properties
                    , like similalary
                    if parent - Smartphone and childrens are samsung, iphone,
                    we can call Parent smarphone = new Samsung() like this
                    like morphing
    Inheritance - In inheritance we can extend the parent attributes, right
                    like if parent has two childers, both can extend there parent properties
    Abstration
     */

    private int id; // This is class variables

    public static void main(String[] args) {
        Smartphone iphone = new iPhone();

        System.out.println(iphone.getInternalRamGB());

        iphone.setInternalRamGB(400);
        System.out.println("After setting the internalGB new value");
        System.out.println(iphone.getInternalRamGB());

        System.out.println("------------");

        iPhone iphone1 = new iPhone();

        System.out.println(iphone1.getInternalRamGB());

        iphone1.setInternalRamGB(400);
        System.out.println("After setting the internalGB new value");
        System.out.println(iphone1.getInternalRamGB());
    }

    public void testEncapsulation(){
        EncapsulationTest encapsulationTest = new EncapsulationTest();

        long testId = 1;

        encapsulationTest.setId(testId);

        System.out.println(encapsulationTest.getId());
    }
}
