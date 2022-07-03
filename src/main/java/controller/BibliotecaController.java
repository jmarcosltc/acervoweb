/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.AcervoFacade;
import entity.Acervo;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Joao
 */

@Named("bibliotecaBean")
@ViewScoped
public class BibliotecaController implements Serializable {
    
    private Acervo acervo;
    @EJB
    private AcervoFacade af;
    
    public void create() {
        this.af.create(acervo);
        this.acervo = new Acervo();
    }
    
    public void update() {
        this.af.edit(acervo);
        this.acervo = new Acervo();
    }
    
    public void delete(Acervo a) {
        this.af.remove(a);
    }
    
    public List<Acervo> getRead() {
        return this.af.findAll();
    }
    
    public void updateForm(Acervo a) {
        this.acervo = a;
    }

    public Acervo getAcervo() {
        if (this.acervo == null) {
            return this.acervo = new Acervo();
        }
        return acervo;
    }

    public void setAcervo(Acervo acervo) {
        this.acervo = acervo;
    }
    
}
