package chapter2.clazz;

public class Car {
        String name;
        String carModel;

        public Car(String name, String carModel) {
            this.name = name;
            this.carModel = carModel;
        }

        public void drive() {
            System.out.println(name +"[" + this.carModel + "] 을 주행 합니다");
        }

        public void accelerate() {
            System.out.println(name + "[" + this.carModel + "] 을 가속 합니다");
        }

}
