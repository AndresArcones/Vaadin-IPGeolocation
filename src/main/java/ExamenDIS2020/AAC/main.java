package ExamenDIS2020.AAC;

import ExamenDIS2020.AAC.backend.CrearJson;
import ExamenDIS2020.AAC.backend.FuncionesAnexoIP;
import ExamenDIS2020.AAC.backend.Ip;

import java.util.ArrayList;

public class main {

    public static void main(String[] args){
        ArrayList<Ip> ips = new ArrayList<>();

        ips = CrearJson.leerFicheroJson();


        //String ip = FuncionesAnexoIP.longToIp(2532573184);

        //System.out.println(ip);

    }
}
