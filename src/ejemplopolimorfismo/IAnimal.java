/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author Nabor
 */
public interface IAnimal {
    public abstract void falar();
    default public void moverse(){
        System.out.println("Movese o animal");
    }
    
}
