/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.hitung;

import halo.world.KoneksiKeDb;
import junit.framework.TestCase;
import org.junit.Test;


/**
 *
 * @author dimmaryanto93
 */
public class TestHitung extends TestCase{
    
    private KoneksiKeDb koneksiKeDb = new KoneksiKeDb();
    
    @Test
    public void testHitungGaji(){
        assertEquals("bni_db", koneksiKeDb.getNamaDb());
    }
    
}
