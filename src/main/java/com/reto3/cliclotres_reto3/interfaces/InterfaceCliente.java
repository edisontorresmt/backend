/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reto3.cliclotres_reto3.interfaces;


import com.reto3.cliclotres_reto3.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Admin
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>{

}
