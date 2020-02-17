/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes;

import com.Heroes.lib.MovementFeat;
import com.Heroes.lib.MovementFeatModel;
import com.Heroes.lib.interfaceClass.IFeatAttribute;
import java.io.PrintStream;
import java.util.List;

/**
 *
 * @author lele
 */
public class Main {
    public static void main(String[] args) {
        PrintStream os = System.out;
        
        os.println("Caso 1: L'utente ha scelto che il potere segue il personaggio.");
        MovementFeatModel model1 = new MovementFeatModel();
        model1.setFollow(true);
        MovementFeat movementFeat1 = new MovementFeat(model1);
        printFeat(movementFeat1, os);
        os.println("==");
        
        os.println("Caso 2: L'utente imposta 20 m/V");
        MovementFeatModel model2 = new MovementFeatModel();
        model2.setValue(1);
        model2.setMultiplier(2);
        MovementFeat movementFeat2 = new MovementFeat(model2);
        printFeat(movementFeat2, os);
        
        
    }
    
    private static void printFeat(IFeatAttribute featAttribute, PrintStream os) {
        String header = featAttribute.getName() + ": " + featAttribute.getDescription();
        String magnitude = "Magnitudo: " + featAttribute.getMagnitude();
        os.println(header);
        os.println(magnitude);
    }
}
