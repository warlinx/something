package com.company.patterns;
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void print(){
        System.out.println("This is singleton print method");
    }
}

class TestSingleton {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.print();
    }
}
/*
Основные моменты при реализации синглтона:
Конструктор класса должен быть с модификатором доступа private,
что не позволит создать экземпляр этого класса за его пределами;
должна быть private static final переменная, хранящая единственный экземпляр этого класса и public
static метод возвращающий экземпляр этого класса.
 */