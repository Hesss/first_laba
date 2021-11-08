package Collection;

import Coords.Threecoords;
import Coords.Twocoords;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection<T extends Twocoords> {
    private List<T> Collection = new LinkedList<>();

    public void add(T typePoint) {
        Collection.add(typePoint);
    }

    public void outTwocoords() {
        Iterator<T> it =  Collection.iterator();
        while (it.hasNext()) {
            T typePoint = it.next();
            if(typePoint instanceof Twocoords && !(typePoint instanceof Threecoords))
                System.out.println(typePoint.toString());
        }
    }

    public void outThreecoords() {
        Iterator<T> it =  Collection.iterator();
        while (it.hasNext()) {
            T typePoint = it.next();
            if(typePoint instanceof Threecoords)
                System.out.println(typePoint.toString());
        }
    }
}
