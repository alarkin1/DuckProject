/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duckproject;

/**
 *
 * @author Alex
 */
public class DuckProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck rocketman = new ModelDuck();
        rocketman.setFlyBehavior(new FlyRocketPowered());
        rocketman.performFly();
        
        
        
    }
    
}
