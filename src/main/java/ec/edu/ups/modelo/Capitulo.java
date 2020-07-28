/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Diego Duchimaza
 */
@Entity
public class Capitulo implements Serializable{
     private static final long serialVersionUID = 1L;
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int codigo;
     private int numero;
     private String titulo;
     
     @JsonbTransient
     @ManyToOne
     private Libro libro;
     
     @JsonbTransient
     @OneToOne
     private Autor autor;
     
     public Capitulo(){
         
     }

    public Capitulo(int codigo, int numero, String titulo, Libro libro, Autor autor) {
        this.codigo = codigo;
        this.numero = numero;
        this.titulo = titulo;
        this.libro = libro;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Capitulo other = (Capitulo) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
     
     
}

