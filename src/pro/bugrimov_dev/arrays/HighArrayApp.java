package pro.bugrimov_dev.arrays;

public class HighArrayApp {

    public static void main(String ... args) {
        int maxSize = 100;

        HighArray array = new HighArray(maxSize);

        array.insert(77);
        array.insert(99);
        array.insert(55);
        array.insert(12);
        array.insert(64);
        array.insert(32);
        array.insert(84);
        array.insert(61);
        array.insert(83);
        array.insert(97);
        array.insert(29);

        array.display();

        int searchKey = 32;
        if (array.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can`t find " + searchKey);
        }

        array.delete(84);
        array.delete(29);
        array.delete(32);

        array.display();
    }
}
