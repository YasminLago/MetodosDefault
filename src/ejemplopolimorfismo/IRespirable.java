package ejemplopolimorfismo;

/**
 *
 * @author ylagorebollar
 */
public interface IRespirable {
    default public void respirar(){
        System.out.println("Respiran dende a interfaz");
    }
}
