public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Grande", "желтого цвета", "сборка в России", 1.7, "2015 год выпуска");
        Car audi = new Car("Audi","A8 50 L TDI quattro","черный цвет кузова","сборка в Германии",3.0,"2020 год выпуска");
        Car bmw = new Car("BMW","Z8","черный цвет кузова","сборка в Германии",3.0,"в 2021 году");
        Car kia = new Car("Kia","Sportage 4 поколение","цвет кузова красный","сборка в Южной Корее",2.4,"2018 год выпуска");
        Car hyundai = new Car("Hyundai","Avante","цвет кузова оранжевый","сборка в Южной Корее",1.6,"год выпуска - 2016 год");
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);


    }
}