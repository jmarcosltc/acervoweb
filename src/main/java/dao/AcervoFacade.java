/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Acervo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Joao
 */
@Stateless
public class AcervoFacade extends AbstractFacade<Acervo> {

    @PersistenceContext(unitName = "biblioteca")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AcervoFacade() {
        super(Acervo.class);
    }
    
}
