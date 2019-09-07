/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import logica.armaduras.Armadura;
import logica.armaduras.ArmaduraLigera;
import logica.armas.Arco;
import logica.armas.Arma;


public class FabricaOrco implements FabricaAbstracta{
    @Override
    public Arma crearArma() {
        return new Arco();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraLigera();
        
    }
    
}
