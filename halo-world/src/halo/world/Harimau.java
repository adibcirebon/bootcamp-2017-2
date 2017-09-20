/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package halo.world;

/**
 *
 * @author dimmaryanto93
 */
public class Harimau extends Hewan {

    public void jumlahKaki() {
        System.out.println("jumlah kakinya adalah 4");
    }

    public void jumlahKaki(Integer jumlahKaki) {
        System.out.println("jumlah kaki adalah " + jumlahKaki);
    }

    @Override
    public void berburu() {
//        super.berburu(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Berburu dari kelas harimau");
    }

    public void berburu(String text) {
        System.out.println(text);
    }

}
