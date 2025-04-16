package chapter2.clazz;

public class Person {
    String name;
    int age;
    String address;

    Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // 게터
    String getName() {
        return this.name;
    }

    // 세터
    void setAddress(String address){
        this.address = address;
    }

}
