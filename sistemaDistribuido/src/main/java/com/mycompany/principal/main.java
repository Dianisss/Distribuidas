
package com.mycompany.principal;

import com.mycompany.entidades.Producto;

import com.mycompany.session.ProductoJpaController;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class main {
    
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("laboratorio");
        
        ProductoJpaController pjc= new ProductoJpaController(emf);
        
        Producto p =new Producto();
        
        p.setNombre("Mantequilla");
        p.setPrecio(BigDecimal.valueOf(13.87));
       
        pjc.create(p);
        
    }
    
    
}
