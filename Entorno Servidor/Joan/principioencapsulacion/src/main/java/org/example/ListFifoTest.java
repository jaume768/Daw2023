package org.example;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListFifoTest {

    private Persona toni = new Persona("toni");
    private Persona miriam = new Persona("miriam ");

    private FifoInterfaz queu = new ListFifo();

    @Test
    public void testingAdd() {

        this.queu.add(this.toni);
        this.queu.add(this.miriam);

        assertEquals(2, queu.size());

    }


    @Test
    public void testDel() {

        this.queu.add(this.toni);
        this.queu.add(this.miriam);

        this.queu.del();
        assertEquals(1, this.queu.size());

    }


    @Test
    public void testLimit(){

        for (int i = 0; i < 10000; i++) {
            Persona persona = new Persona("Persona" + i);
            queu.add(persona);
        }

        assertEquals(10000, queu.size());
    }


    @Test
    public void testEmptyQueu() {

        Throwable exception = assertThrows(Exception.class,()-> this.queu.del());

    }


    @Test
    public void testingSize() {

        this.queu.add(this.toni);
        this.queu.add(this.miriam);

        assertEquals(2, this.queu.size());

    }
}
