/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servicios.iservicios;

import com.utileria.Computadora;
import java.util.LinkedList;

/**
 *
 * @author rafaelm
 */
public interface ICRUD {
    
    boolean agregar(Computadora compu);
    LinkedList leer();
    
}
