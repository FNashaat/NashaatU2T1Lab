public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Poppy", 2, 13);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Howard", 11, 16);
        cat2.printCatInfo();
        cat2.introduce();
    }

}
