/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presentation;

import Logic.TipoInstrumento;
import java.util.List;

/**
 *
 * @author PABLO MORERA
 */
public class Controller {
    private Model mod;
     private View vista; 
    
    public Controller(View view){
        vista = view;
        mod = new Model();
        mod.CreateUserFile();   
    }
    
    public void addInstrumento(String cod,String nom,String uni) throws Exception{
        mod.addInstrumento(new TipoInstrumento(cod,nom,uni));
        uptadeTable();
    }
    
    public void uptadeTable(){
        vista.UptadeTable(mod.uptadeTable());
    }
}
