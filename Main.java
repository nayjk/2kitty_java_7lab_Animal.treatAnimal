package com.metanit;

public class Main {

    public static void main(String[] args) {
      Cat cat = new Cat("Соня", "рыбку", "под диваном", "кошечка");
      Dog dog = new Dog("Бетта", "куриное филе", "на пуфике", "собака");
      Rabbit rabbit = new Rabbit("Фуфик", "финтифлюшки", "в домике", "кролик");
        Vet veterinar = new Vet();
        veterinar.treatAnimal(cat);
        veterinar.treatAnimal(dog);
        veterinar.treatAnimal(rabbit);
    }
}
class Animal {
    Animal animal;
    String name;
    String food;
    String location;
    String kind;
    public Animal(String name, String food, String location, String kind) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.kind = kind;
    }
}
class Cat extends Animal {
    public Cat(String name, String food, String location, String kind) {
        super(name, food, location, kind);
    }
}
class Dog extends Animal {
    public Dog(String name, String food, String location, String kind) {
        super(name, food, location, kind);
    }
}
class Rabbit extends Animal {
    public Rabbit(String name, String food, String location, String kind) {
        super(name, food, location, kind);
    }
}
class Vet{
    public void treatAnimal(Animal animal){
        System.out.println("\n!Приём у врача:");
        System.out.println("на приёме у врача сейчас " + animal.kind);
        System.out.println("питомец: " + animal.name + "" +
                "\nкушает: " + animal.food + "" +
                "\nпоследний раз был найден: " + animal.location);
        System.out.print("--------------");
    }
}