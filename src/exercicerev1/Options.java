/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicerev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author walidsassi
 */
public class Options implements OptionsInterface{
    HashMap<String, ArrayList<String>> optionsValides;
    HashMap<String, ArrayList<String>> optionsInvalides;
    String optionsSans;
    int codeErreur;
    // constructeur 
    public Options (String[] arguments, String optionsAcceptables){
        this.optionsValides =  new HashMap<>();
        this.optionsInvalides = new HashMap<>();
        // parcourir la liste des arguments
        for (String s: arguments) {  
            int index = Arrays.asList(arguments).indexOf(s);
            // tout d'abord il faut vérifier que l'argument est une option pas une valeur 
            if (s.contains("-")){
                     ArrayList<String> ValuesArray = new ArrayList<String>();
                     // verifier si l'option existe dans la chaine des options acceptables
                    if (optionsAcceptables.contains(s)){
                      // il faut maintenant construire le vecteur des valeurs acceptées de l'option
                      ValuesArray = getValuesOfOptions(s,arguments,index);
                      optionsValides.put(s, ValuesArray);
                    }else{
                      ValuesArray = getValuesOfOptions(s,arguments,index);
                      optionsInvalides.put(s, ValuesArray);  
                      //Ajouter l'option invalide à la chaine
                      this.optionsSans +=s;
                      this.codeErreur =2;  
                    }
                // 
            }
        }
      
    }
    // cette méthode recherche les valeurs associés à l'option en cours de traitement et nous rend le tableau de valeurs
    ArrayList<String > getValuesOfOptions (String s, String[] arguments,int index){
        ArrayList<String> vecteur = new ArrayList<>();
        // commencer la recherche après la position de l'option
        int i = index +1;
        if (i< arguments.length-2){
        while (-1==arguments[i].indexOf("-")){
            vecteur.add(arguments[i]);
            i++;
        }
        }
        return vecteur;
    }
    public Options (String arguments, String[] optionsAcceptables){
        
    }
    public Options (String[] arguments, String[] optionsAcceptables){
        
    }

    @Override
    public HashMap getOptionsValides() {
        return (HashMap) optionsValides;
    }

    @Override
    public HashMap getOptionsInvalides() {
        return (HashMap) optionsInvalides;
    }

    @Override
    public String getOptionsSans() {
        return optionsSans;
    }

    @Override
    public int getErreur() {
        return codeErreur;
    }

    @Override
    public String toString() {
        return "Options{" + "optionsValides=" + optionsValides + ", optionsInvalides=" + optionsInvalides + ", optionsSans=" + optionsSans + ", codeErreur=" + codeErreur + '}';
    }
    
}
