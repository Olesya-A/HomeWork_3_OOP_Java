import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//        Создать класс Notebook с полями (price(double), ram(int))
//        1. Сгенерировать список объектов типа Notebook с разными значениям price и ram
//        2. Релизовать 3 сортировки: 1 - по цене, 2 - по памяти, 3 - сначала по памяти, потом по цене
//        3. Отсортировать тремя способами стандартными средствами (Collections#sort или List#sort)

public class NoteBook {

    double price;
    int ram;

    public NoteBook(double price, int ram) {
        this.price = price;
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return price + " price, " + ram + " ram";
    }

    public static class PriceSortComparator implements Comparator<NoteBook> {

        @Override
        public int compare(NoteBook o1, NoteBook o2) {
            if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else if (o1.getPrice() > o2.getPrice()) {
                return 1;
            }
            return 0;
        }
    }

    public static class RamSortComparator implements Comparator<NoteBook> {

        @Override
        public int compare(NoteBook o1, NoteBook o2) {
            if (o1.getRam() < o2.getRam()) {
                return -1;
            } else if (o1.getRam() > o2.getRam()) {
                return 1;
            }
            return 0;
        }
    }


    public static void main(String[] args) {

        ArrayList<NoteBook> nbList = new ArrayList<NoteBook>();

        nbList.add(new NoteBook(20000, 16));
        nbList.add(new NoteBook(15000, 16));
        nbList.add(new NoteBook(10000, 32));
        nbList.add(new NoteBook(10000, 16));
        nbList.add(new NoteBook(30000, 32));
        nbList.add(new NoteBook(40000, 128));
        nbList.add(new NoteBook(50000, 64));

        System.out.println("Сортировка по цене.");
        Comparator<NoteBook> PriceComparator = new PriceSortComparator();
        Collections.sort(nbList, PriceComparator);
        for (NoteBook nb : nbList) {
            System.out.println(nb);
        }

        System.out.println();
        System.out.println("Сортировка по памяти.");
        Comparator<NoteBook> RamComparator = new RamSortComparator();
        Collections.sort(nbList, RamComparator);
        for (NoteBook nb : nbList) {
            System.out.println(nb);
        }

        System.out.println();
        System.out.println("Сортировка по памяти, потом по цене");
        Comparator<NoteBook> RamPriceComparator = (o1, o2) -> {
            if (o1.getRam() - o2.getRam() == 0) {
                return (int)(o1.getPrice() - o2.getPrice());
            }
            return o1.getRam() - o2.getRam();
        };
        Collections.sort(nbList, RamPriceComparator);
        for (NoteBook nb : nbList) {
            System.out.println(nb);
    }
}
}
