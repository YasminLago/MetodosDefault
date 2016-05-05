/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplopolimorfismo;

/**
 *
 * @author ylagorebollar
 */
public class Cabalo implements IAnimal,IRespirable{

    @Override
    public void falar() {
        System.out.println("Fala o cabalo");
    }
    
}
