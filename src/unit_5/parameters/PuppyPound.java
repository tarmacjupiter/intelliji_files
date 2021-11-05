package unit_5.parameters;

public class PuppyPound {
    public static void main(String[] args) {
        Dog lab = new Dog("Spot", 23);

        Dog brandy = new Dog("Brandy", 6);

        int brandyAge = 6;

        brandy.addDogYears(brandyAge);

        System.out.println(brandy);
        System.out.println(lab);
        //PuppyPound.haveBirthday();
        System.out.println(brandy.getAge());
        haveBirthday(brandy);
        System.out.println(brandy.getAge());
    }
    public static void haveBirthday(Dog pupper){
        pupper.setAge(pupper.getAge() + 1);
    }
}
