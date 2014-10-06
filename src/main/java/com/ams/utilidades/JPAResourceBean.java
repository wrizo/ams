package com.ams.utilidades;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;


/**
 * Este es un bean de Aplicación que mantiene el JPA EntityManagerFactory.  
 * 
 * Como este recurso es a nivel de aplicación el EntityManagerFactory 
 * es creado una sola vez para la aplicación
 * <p>
 * @author Félix Medina
 * @author <a href=mailto:fmedina@inss.gob.ni>fmedina@inss.gob.ni</a>
 */

public class JPAResourceBean {
	
	@PersistenceContext(unitName="ams")
	private EntityManagerFactory iEMF;

	public EntityManagerFactory getEMF() 
	{
		try
		{
			if (iEMF == null)
			{
		    	iEMF = Persistence.createEntityManagerFactory("ams");
			}
		}
		catch (Exception e) 
		{
		    System.out.println(e.getMessage());
		}
        return iEMF;
	}

}

