
package Fabricas;

import logica.armaduras.Armadura;
import logica.armaduras.ArmaduraDeGuerrero;
import logica.armas.Arma;
import logica.armas.Espada;

/**
 *
 * @author Usuario
 */
public class FabricaHumano implements FabricaAbstracta {

    @Override
    public Arma crearArma() {
        return new Espada();
    }

    @Override
    public Armadura crearArmadura() {
        return new ArmaduraDeGuerrero();
       
    }
    
}
