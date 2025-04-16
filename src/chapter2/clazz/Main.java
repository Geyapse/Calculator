package chapter2.clazz;

public class Main {
    public static void main(String[] args) {
        Person personA = new Person("shoh", 28);
        Person personB = new Person("steve", 35);

//        System.out.println("설정전 personA이름: " + personA.name);
//        System.out.println("설정전 personB이름: " + personB.name);
//        personA.name = "shoh";
//        personB.name = "steve";
//        System.out.println("설정후 personA이름: " + personA.name);
//        System.out.println("설정후 personB이름: " + personB.name);
        String name = personA.getName();
        System.out.println("name = " + name);

        System.out.println("personA 의 주소 = " + personA.address);
        personA.setAddress("서울");
        System.out.println("personA 의 주소 = " + personA.address);
    }
}
