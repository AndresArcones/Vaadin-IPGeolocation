package ExamenDIS2020.AAC.backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Date;

import com.google.gson.*; //gson
import com.google.gson.reflect.TypeToken;


public class CrearJson {

    private static final String dir_json = new File("localizaIP.json").getAbsolutePath();
    private static final String dir_json3= new File("fecha_ultima_Actualizacion.json").getAbsolutePath();


    public static void crearFicheroJson(ArrayList<Ip> ips){
        try{
            FileWriter mywriter = new FileWriter(dir_json);
            mywriter.write(new Gson().toJson(ips));
            mywriter.close();
        }catch (Exception ex){
            System.out.println(ex);
        }

    }

    public static ArrayList<Ip> leerFicheroJson(){
        ArrayList<Ip> ips = new ArrayList<Ip>();
        Gson gson = new Gson();
        try {
            ips = gson.fromJson(new FileReader(dir_json),new TypeToken<ArrayList<Ip>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return ips;
    }


}
