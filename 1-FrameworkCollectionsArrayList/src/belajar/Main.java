package belajar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection data = new ArrayList();
        // menambahkan data
        data.add(1);
        data.add("data kedua");
        data.add("data ketiga");

        // menampilkan data
        // menggunakan iterator
        Iterator show = data.iterator();
        while(show.hasNext()){
            System.out.println(show.next());
        }

        // menggunakan forEach
        data.forEach((show2) -> {
            System.out.println(show2);
        });

        System.out.println("-------------------------------------------------------------");

        Collection<Integer> data2 = new ArrayList<>();
        data2.add(1);
        data2.add(2);
        data2.addAll(Arrays.asList(4,5,6,7,8,9,10)); // angka yg sama tidak akan di timpa
        // hapus atau hapus data yg sama
        data2.remove(1);

        // menampilkan hasil
        Iterator show3 = data2.iterator();
        while(show3.hasNext()){
            System.out.println(show3.next());
        }

        data2.forEach((show4) -> {
            System.out.println(show4);
        });











    }
}
