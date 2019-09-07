/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import logica.armaduras.Armadura;
import logica.armaduras.ArmaduraPesada;
import logica.armas.Arma;
import logica.armas.Hacha;


public class FabricaElfo implements FabricaAbstracta {

    @Override
    public Arma crearArma() {
        return new Hacha();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraPesada();
        
    }
    
}
