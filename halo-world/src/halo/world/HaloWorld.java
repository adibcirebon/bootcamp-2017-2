/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halo.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author dimmaryanto93
 */
public class HaloWorld {

    private String namaVariable;

    private Integer iniBilangan = 1;
    private Integer iniBilanganKe2 = 1;

    public void namaFunction() {
        namaVariable = "Dimas Maryanto";
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] x) {
        Integer value = 2;
        Double valueDouble = Double.valueOf(value);
        BigDecimal gajiPokok;

        HaloWorld halo = new HaloWorld();
        System.out.println("bilangan + bilanganKe2 = " + (halo.iniBilangan + halo.iniBilanganKe2));

        Tv samsung = new Tv();
        String channelNo1 = samsung.no1();
        samsung.no2();
        System.out.println("channel no 1 adalah " + channelNo1);

        if (halo.iniBilangan == halo.iniBilanganKe2) {
//            ini nilainya sama
            System.out.println("bilangan dan bilanganKe2 nilainya sama");
        } else {
//            ini nilainya beda
            System.out.println("bilangan dan bilanganKe2 nilainya beda");
        }

//        i++ sama i = i+1
        for (Integer i = 0; i < 100; i++) {
            System.out.println("Ini teks ke " + i);
        }
//        deklarasi variabl namanya i = 0
// i = 0 < 100 = true => ini teks ke 0
// i = 1 < 100 = true => ini text ke 1
// 1 = 99 < 100 = true => ini text ke 99
// i = 100 < 100 = false => gak yang ditampilin

        Integer index = 0;
        do {
            System.out.println("ini text ke " + index);
            index++;
        } while (index < 10);

        Harimau macanPutih = new Harimau();
        macanPutih.jumlahKaki();
        macanPutih.jumlahKaki(5);
        macanPutih.berburu();

        KoneksiKeDb koneksi = new KoneksiKeDb();
        koneksi.setNamaDb("lkasjdfkljasdf");

        String texts[] = {"nilai ke 1", "nilai ke 2", "nilai ke 3"};

        for (String text : texts) {
            System.out.print(text + ",");
        }
        System.out.println("");
        System.out.println("nilai yang di set adalah " + koneksi.getNamaDb());

        List<Integer> listText = new ArrayList<>();
        listText.add(2);
        listText.add(1);
        listText.add(1);

        for (int i = 0; i < listText.size(); i++) {
            System.out.println(listText.get(i));
        }

        Map<String, String> myMap = new HashMap<>();
        myMap.put("001", "Halo ini data ke 1");
        myMap.put("002", "ini data ke 2");

        System.out.println(myMap.get("001"));

        myMap.forEach((key, nilai) -> {
            System.out.println("key dari my map adalah " + key + " dan nilainya adalah " + nilai);
        });

        Set<Integer> listTextUnique = new HashSet<>();
        listTextUnique.add(2);
        listTextUnique.add(1);
        listTextUnique.add(1);
        listTextUnique.add(2);

        System.out.println("jumlah value di emlement list text unix " + listTextUnique.size());
        for(Integer uniqueText: listTextUnique){
            System.out.println("unique text "+ uniqueText);
        }
    }

}
