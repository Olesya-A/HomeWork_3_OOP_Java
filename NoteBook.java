import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//        Создать класс Notebook с полями (price(double), ram(int))
//        1. Сгенерировать список объектов типа Notebook с разными значениям price и ram
//        2. Релизовать 3 сортировки: 1 - по цене, 2 - по памяти, 3 - сначала по памяти, потом по цене
//        3. Отсортировать тремя способами стандартными средствами (Collections#sort или List#sort)

public class Notebook {

    double price;
    int ram;

    public Notebook(double price, int ram) {
        this.price = price;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return price + " price, " + ram + " ram";
    }

    public static class PriceSortComparator implements Comparator<Notebook> {

        @Override
        public int compare(Notebook o1, Notebook o2) {
            if (o1.price < o2.price) {
                return -1;
            } else if (o1.price > o2.price) {
                return 1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {

        ArrayList<Notebook> nbList = new ArrayList<Notebook>();

        nbList.add(new Notebook(10000, 16));
        nbList.add(new Notebook(20000, 32));
        nbList.add(new Notebook(10000, 32));
        nbList.add(new Notebook(20000, 16));
        nbList.add(new Notebook(30000, 64));
        nbList.add(new Notebook(40000, 64));
        nbList.add(new Notebook(50000, 128));

        

        Comparator<Notebook> PriceComparator = new PriceSortComparator();
        Collections.sort(nbList, PriceComparator);
        for (Notebook nb : nbList) {
            System.out.println(nb);
        }
    }
}
