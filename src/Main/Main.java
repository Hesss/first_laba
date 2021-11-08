package Main;

import Coords.Twocoords;
import Coords.Threecoords;
import Collection.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Twocoords> list = new Collection<>();
        list.add(new Twocoords(2, 5));
        list.add(new Twocoords(2, 1));
        list.add(new Twocoords(67, 2));
        list.add(new Threecoords(5, 12, 8));
        list.add(new Threecoords(2, 20, 5));
        list.add(new Threecoords(31, 6, 9));

        System.out.println("2-х мерные Координаты: ");
        list.outTwocoords();

        System.out.println("3-х мерные Координаты: ");
        list.outThreecoords();
    }
}
