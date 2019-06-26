/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.strategy;

import java.util.Dictionary;
import java.util.Enumeration;
import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;
import sort.methods.SortTypes;

/**
 *
 * @author Asus
 */
public class Strategy {
    
    public Strategy(){
        
    }
    
    public String Sort(SortTypes type){
        
        ISort sort= null;
        
        switch(type){
            case Bubble:
                sort= new Bubblesort();
                break;
            case Insertion:
                sort= new Insertionsort();
                break;
            case Selection:
                sort= new Selectionsort();
                break;
                case Quick:
                sort= new Quicksort();
                break;
        }
        
        return sort.sort();
    }
    
}
