interface SoundMaker {
  void makeSound();
}

class Animal implements SoundMaker {
  public void makeSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void makeSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void makeSound() {
    System.out.println("The dog says: bow wow");
  }
}

class Cat extends Animal {
  public void makeSound() {
    System.out.println("The cat says: meow");
  }
}

class Inher2 {
  public static void main(String[] args) {
    SoundMaker[] animals = new SoundMaker[]{new Animal(), new Pig(), new Dog(), new Cat()};

    for (SoundMaker animal : animals) {
      animal.makeSound();
    }
  }
}