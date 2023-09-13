/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instrumentos.presentation.tipo;

import Data.Data;
import Logic.Instrumento;
import XML_DOM.TiposInstrumentos;
import java.util.List;
import java.util.Observer;

/**
 *
 * @author PABLO MORERA
 */
public class Model extends java.util.Observable{
    private Data dataInstrumentos;
    private Instrumento actual;
    private int changedProps;
    private TiposInstrumentos TipInst;
    
//    public static int NONE=0;
//    public static int LIST=1;
//    public static int CURRENT=2;

    public Model() {
        changedProps = 0;
    }
    
      public void CreateUserFile()
    {
        TipInst = new TiposInstrumentos("Instrumentos.xml");
    }
    
    int cantDatos;
    public void guardarDatoTabla(String dato){
        
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    public void commit(){
        setChanged();
        notifyObservers(changedProps);
        changedProps = 0;    
    }
    public void init(List<Instrumento> list){
        dataInstrumentos.setInstrumentos(list);
        setActual(new Instrumento());
        
    }

    public Data getDataInstrumentos() {
        return dataInstrumentos;
    }

    public void setDataInstrumentos(Data dataInstrumentos) {
        this.dataInstrumentos = dataInstrumentos;
        changedProps += 1;
    }

    public Instrumento getActual() {
        return actual;
    }

    public void setActual(Instrumento actual) {
        changedProps += 2;
        this.actual = actual;
    }

    public int getChangedProps() {
        return changedProps;
    }

    public void setChangedProps(int changedProps) {
        this.changedProps = changedProps;
    }

    public int getCantDatos() {
        return cantDatos;
    }

    public void setCantDatos(int cantDatos) {
        this.cantDatos = cantDatos;
    }
    
    
    
    
}
