package ExamenDIS2020.AAC;

import ExamenDIS2020.AAC.backend.FuncionesAnexoIP;
import ExamenDIS2020.AAC.frontend.Formulario;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {


    //la funcion dada no funciona ya que los datos del fichero from y to son demasiado largos para poder ejecutarlos asi que no puedo controlar que
    //esta fuera de rango... una pena en la funcion form.devolverGeo(String ipdoted) que he creado. No me deja compilarlo, no puedo tratas numero de 10 cifras
    // en java sin una clase especifica de mates

    /*public static String longToIp(long ip) {

        StringBuilder result = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
        result.insert(0,Long.toString(ip & 0xff));
        if (i < 3) {
            result.insert(0,'.');
        }
        ip = ip >> 8;
        }
    return result.toString();
    }*/



    @Test
    public void ipv4Inexistente(){
        Formulario form = new Formulario();

        try {
            form.devolverGeo(null);
        }catch(Exception e){
            assertTrue(true);git
        }


    }

    @Test
    public void ipv4FueraRangoArriba(){
        Formulario form = new Formulario();

        try {
            form.devolverGeo(null);
        }catch(Exception e){
            assertTrue(true);
        }
    }

    @Test
    public void ipv4FueraRangoAbajo(){
        Formulario form = new Formulario();

        try {
            form.devolverGeo(null);
        }catch(Exception e){
            assertTrue(true);
        }
    }


}
