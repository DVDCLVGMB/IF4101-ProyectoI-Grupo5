package com.bulkgym.business;

import com.bulkgym.domain.ItemRutinaMedida;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ItemRutinaMedidaBusinessTest {
	
	 ItemRutinaMedidaBusiness business = new ItemRutinaMedidaBusiness();

	 
	 @BeforeEach
	    public void setUp() {
	        business = new ItemRutinaMedidaBusiness();

	        business.insertarItemRM(1, 201);
	        business.insertarItemRM(1, 202);
	        business.insertarItemRM(1, 203);
	        business.insertarItemRM(1, 204);
	        business.insertarItemRM(1, 205);
	    }
	 
    @Test
    public void testInsertarItemRM_Simulada() {
    	

         // Insertar, a traves del llamado del metodo en la clase ItemRutinaMedidaBusiness, 3 registros ficticios
         business.insertarItemRM(1, 201); // Altura
         business.insertarItemRM(1, 202); // Peso
         business.insertarItemRM(1, 203); // Cintura

         // Acceder y modificar manualmente los registros 
         List<ItemRutinaMedida> items = business.obtenerItems();

         items.get(0).getMedidaCorporal().setTipoMedida("Altura");
         items.get(0).getMedidaCorporal().setUnidad("cm");
         items.get(0).setValorMedida(175);

         items.get(1).getMedidaCorporal().setTipoMedida("Peso");
         items.get(1).getMedidaCorporal().setUnidad("kg");
         items.get(1).setValorMedida(70);

         items.get(2).getMedidaCorporal().setTipoMedida("Cintura");
         items.get(2).getMedidaCorporal().setUnidad("cm");
         items.get(2).setValorMedida(85);

         // Verificar mediante tests
         assertEquals(8, items.size()); //Tamaño de la lista de registros

         //Recordar que en la lista se comienza por el indice 0, por lo que se va a analizar los test desde esa posicion
         
         assertAll("Verificar datos realistas",
                 () -> {
                	 
                     assertEquals("Altura", items.get(0).getMedidaCorporal().getTipoMedida());
                     assertEquals("cm", items.get(0).getMedidaCorporal().getUnidad());
                     assertEquals(175, items.get(0).getValorMedida());
                 },
                 () -> {
                     assertEquals("Peso", items.get(1).getMedidaCorporal().getTipoMedida());
                     assertEquals("kg", items.get(1).getMedidaCorporal().getUnidad());
                     assertEquals(70, items.get(1).getValorMedida());
                 },
                 () -> {
                     assertEquals("Cintura", items.get(2).getMedidaCorporal().getTipoMedida());
                     assertEquals("cm", items.get(2).getMedidaCorporal().getUnidad());
                     assertEquals(85, items.get(2).getValorMedida());
                 }
         );
         
 

     }
    @Test
    public void testBuscarItemPorId_Existe() {
        ItemRutinaMedida item = business.buscarItemPorId(2);
        assertNotNull(item);
        assertNotEquals("Cintura", item.getMedidaCorporal().getTipoMedida());
        assertEquals(100, item.getValorMedida());
    }

    @Test
    public void testBuscarItemPorId_NoExiste() {
        ItemRutinaMedida item = business.buscarItemPorId(10);
        assertNull(item);
    }
    
    
    @Test
    public void testEliminarItemPorId_Exitoso() {
        boolean eliminado = business.eliminarItemPorId(2);
        assertTrue(eliminado);

        ItemRutinaMedida item = business.buscarItemPorId(2);
        assertNull(item);

        List<ItemRutinaMedida> items = business.obtenerItems();
        assertEquals(4, items.size());
    }

    @Test
    public void testEliminarItemPorId_NoExiste() {
        boolean eliminado = business.eliminarItemPorId(99);
        assertFalse(eliminado);
    }
}
