/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iespaucasesnoves.boats.api;

import java.util.Date;

/**
 *
 * @author DRAKUL
 */
public class Mecanic extends Empleat {

    private Habilitat habilitat;

    public Mecanic(Habilitat habilitat, String nom, String cognom, Document tipusDocument, String adreca, String telefon, String correu, Date dataAlta, Double sou) {
        super(nom, cognom, tipusDocument, adreca, telefon, correu, dataAlta, sou);
        this.habilitat = habilitat;
    }

}
