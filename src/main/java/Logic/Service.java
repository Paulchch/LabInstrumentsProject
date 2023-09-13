/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import Data.Data;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.text.DecimalFormat;

/**
 *
 * @author Pamela
 */

public class Service {
    private static Service theInstance;

    public static Service instance(){
        if (theInstance == null) theInstance = new Service();
        return theInstance;
    }
    private Data data;

    private Service(){
        data = new Data();
    }

    //================= TIPOS DE INSTRUMENTO ============
    public void create(Instrumento e) throws Exception{
        Instrumento result = data.getInstrumentos().stream()
                .filter(i->i.getCodigo().equals(e.getCodigo())).findFirst().orElse(null);
        if (result==null) data.getInstrumentos().add(e);
        else throw new Exception("Tipo ya existe");
    }

    public Instrumento read(Instrumento e) throws Exception{
        Instrumento result = data.getInstrumentos().stream()
                .filter(i->i.getCodigo().equals(e.getCodigo())).findFirst().orElse(null);
        if (result!=null) return result;
        else throw new Exception("Tipo no existe");
    }

    public void update(Instrumento e) throws Exception{
        Instrumento result;
        try{
            result = this.read(e);
            data.getInstrumentos().remove(result);
            data.getInstrumentos().add(e);
        }catch (Exception ex) {
            throw new Exception("Tipo no existe");
        }
    }

    public void delete(Instrumento e) throws Exception{
        data.getInstrumentos().remove(e);
     }

    public List<Instrumento> search(Instrumento e){
        return data.getInstrumentos().stream()
                .filter(i->i.getNombre().contains(e.getNombre()))
                .sorted(Comparator.comparing(Instrumento::getNombre))
                .collect(Collectors.toList());
    }

 }
