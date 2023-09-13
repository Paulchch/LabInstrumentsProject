/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumentos.presentation.tipo;

import Logic.Instrumento;

/**
 *
 * @author PABLO MORERA
 */
public class Controller {
    private Model mod;
    
    public Controller(){
        mod = new Model();
        mod.CreateUserFile();   
    }
    
    public void addInstrumento(String cod,String nom,String uni) throws Exception{
       Instrumento inst = new Instrumento(cod,nom,uni);
        mod.addInstrumento(inst);
    }
}
