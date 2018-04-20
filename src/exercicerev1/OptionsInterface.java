/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicerev1;

import java.util.HashMap;

/**
 *
 * @author walidsassi
 */
public interface OptionsInterface {
    public HashMap getOptionsValides();
    public HashMap getOptionsInvalides();
    public String getOptionsSans();
    public int getErreur();
    @Override
    public String toString();
}
