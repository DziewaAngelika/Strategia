/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.methods.SortTypes;
import sort.strategy.Strategy;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] dataNonSort = DataGenerator.generate(100000);
        
       /* Wzorzec Stratega */
        //...
        Strategy strategy = new Strategy();
        strategy.Sort(SortTypes.Bubble);
       
        System.out.println(strategy.Sort(SortTypes.Bubble));
        System.out.println(strategy.Sort(SortTypes.Quick));
        System.out.println(strategy.Sort(SortTypes.Insertion));
        System.out.println(strategy.Sort(SortTypes.Selection));
    }
}
