import java.util.ArrayList;
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

    @Override
    public String toString() {
        return price + " price, " + ram + " ram";
    }

    public static class PriceSortComparator implements Comparator<Double> {

        @Override
        public int compare(Double o1, Double o2) {
            
        }
    
        
    }

    public static void main(String[] args) {
        NoteBook notebook_1 = new NoteBook(10000, 16);
        NoteBook notebook_2 = new NoteBook(20000, 32);
        NoteBook notebook_3 = new NoteBook(10000, 32);
        NoteBook notebook_4 = new NoteBook(20000, 16);
        NoteBook notebook_5 = new NoteBook(30000, 64);
        NoteBook notebook_6 = new NoteBook(40000, 64);
        NoteBook notebook_7 = new NoteBook(50000, 128);

        ArrayList<NoteBook> nbList = new ArrayList<NoteBook>();
        nbList.add(notebook_1);
        nbList.add(notebook_2);
        nbList.add(notebook_3);
        nbList.add(notebook_4);
        nbList.add(notebook_5);
        nbList.add(notebook_6);
        nbList.add(notebook_7);


        for (NoteBook nb : nbList) {
            System.out.println(nb);
        }


    }

}