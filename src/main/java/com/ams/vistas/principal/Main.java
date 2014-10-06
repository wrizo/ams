package com.ams.vistas.principal;

import java.util.List;

import javax.persistence.EntityManager;

import com.ams.modelo.gestion_usuario.Usuarios;
import com.ams.utilidades.JPAResourceBean;

public class Main
{   
  //almacena una referencia al EMF global para adquirir el EntityManager
    private static JPAResourceBean jpaResourceBean = new JPAResourceBean();
    
    public static void main(String[] args)
    {
        EntityManager oEM = jpaResourceBean.getEMF().createEntityManager();
        
        try
        {
            javax.persistence.Query query = oEM.createQuery("select * from gestion_usuario.usuarios");
            List<Usuarios> lista = (List<Usuarios>) query.getResultList();
            
            if (lista != null && lista.isEmpty() == false)
            {
                for (Usuarios pais : lista)
                {
                    System.out.println(pais.getUserName());
                }
            }
            
        }
        finally
        {
            oEM.close();
        }
    }
}
