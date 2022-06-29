
package com.practica01.domain;

import java.io.Serializable;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;



@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long n_estado;

    String nombre;
    String capital;
    int cant_poblacion;
    int cant_costas;

    public Estado() {
    }

    public Estado(String nombre, String capital, int cant_poblacion, int cant_costas) {
        this.nombre = nombre;
        this.capital = capital;
        this.cant_poblacion = cant_poblacion;
        this.cant_costas = cant_costas;
    }

}
    
    

