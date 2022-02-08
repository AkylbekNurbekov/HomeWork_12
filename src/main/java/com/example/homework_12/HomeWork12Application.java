package com.example.homework_12;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeWork12Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Dog dog = context.getBean("myAnimal",Dog.class);
        Dog dog2 = context.getBean("myAnimal2",Dog.class);

        Person person = context.getBean("myPerson",Person.class);
        System.out.println("Жаныбардын ээси: "+person.getName()+" "+person.getAge()+"\n" +
                "Менин жаныбырым: " + person.getAnimal());
        dog.animalPlus();

        Person person1 =  context.getBean("myPerson2",Person.class);
        System.out.println("\nЖаныбардын ээси: " + person1.getName() + " " + person1.getAge() +"\n"+
                "Хадичанын жаныбары: " +person1.getAnimal());
        dog2.animalMinus();

    }

}
