package com.bulkgym.business;

import com.bulkgym.domain.ItemRutinaMedida;
import com.bulkgym.domain.MedidaCorporal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItemRutinaMedidaBusiness {

    private List<ItemRutinaMedida> listaItems; //guarda todos los objetos ItemRutinaMedida creados.

    public ItemRutinaMedidaBusiness() {
        this.listaItems = new ArrayList<>(); // inicializa listaItems como una lista vacía, para porteriormente poder guardar objetos en esa lista
    }

    public void insertarItemRM(int idRutina, int codMedida) { //Metodo temporal usado como prueba para verificar si elproyecto sirve de forma correcta
    	//Alno tener una coneccion con el Data, se tuvo que crear el metodo insertar de forma temporal en el business,para poder verificar si funciona correctamente el proyecto y el metodo como tal
        ItemRutinaMedida item = new ItemRutinaMedida(); //instancia la clase ItemRutinaMedida 
        item.setIdItemRutinaMedida(listaItems.size() + 1);  //El ID del nuevo item se asigna automáticamente con base en el tamaño de la lista actual, en caso de que la lista tenga un tamaño de 6, entonces el diguiente id del proximo registro sera 7
        item.setValorMedida(100); //establecer el valor de la medida en 100, como dato ficticio para comporbar si funciona el metodo
        item.setFechaMedicion(LocalDate.now()); //Asignar la fecha actual como fecha de medición.

        MedidaCorporal medida = new MedidaCorporal(); //crear un nuevo objeto MedidaCorporal
        medida.setIdMedidaCorporal(codMedida);
        
        //Se agregan datos ficticios para realizar la prueba
        medida.setTipoMedida("Altura");
        medida.setUnidad("cm");
        item.setMedidaCorporal(medida);

        listaItems.add(item); //se añade esa medida a la lista de medidas contenidas en una rutina
    }

    public List<ItemRutinaMedida> obtenerItems() {
        return listaItems; //retorna la lista de todas las medidas corporales insertadas
    }
    
    
    //Buscar medidas corporales 
    public ItemRutinaMedida buscarItemPorId(int idItem) {
        for (ItemRutinaMedida item : listaItems) {
            if (item.getIdItemRutinaMedida() == idItem) {
                return item;
            }
        }
        return null; // Si no se encuentra
    }
    
    
    //Eliminar medidas corporales
    
    public boolean eliminarItemPorId(int idItem) {
        for (int i = 0; i < listaItems.size(); i++) {
            if (listaItems.get(i).getIdItemRutinaMedida() == idItem) {
                listaItems.remove(i);
                return true; // Eliminado exitosamente
            }
        }
        return false; // No se encontró el item
    }

    
    //Modificar medidas corporales
    
    public boolean modificarItemPorId(int idItem, int nuevoValor, String nuevoTipo, String nuevaUnidad, LocalDate nuevaFecha) {
        for (ItemRutinaMedida item : listaItems) {
            if (item.getIdItemRutinaMedida() == idItem) {
                item.setValorMedida(nuevoValor);
                item.getMedidaCorporal().setTipoMedida(nuevoTipo);
                item.getMedidaCorporal().setUnidad(nuevaUnidad);
                item.setFechaMedicion(nuevaFecha);
                return true; // Modificación exitosa
            }
        }
        return false; // No se encontró el item
    }

}