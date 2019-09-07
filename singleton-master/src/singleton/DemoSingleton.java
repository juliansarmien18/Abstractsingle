package Singleton;

/**
 *
 * @author USUARIO
 */
public class DemoSingleton {

    private String single;
    private static DemoSingleton DemoSingleton;

    // El constructor es privado, no permite que se genere un constructor por defecto.
    private DemoSingleton(String single) {
        this.single = single;
        System.out.println("Esta es una demostracion de " + this.single);
    }

    public static DemoSingleton getSingletonInstance(String single) {
        if (DemoSingleton == null){
            DemoSingleton = new DemoSingleton(single);
        }
        else{
            System.out.println("No se puede crear el objeto "+ single + " debido a Singleton");
        }
        
        return DemoSingleton;
    }
    

}
