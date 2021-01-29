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



    public static void crearFicheroJson(ArrayList<Ip> ips){
        try{
            FileWriter mywriter = new FileWriter("localizaIP.json");
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
            ips = gson.fromJson(new FileReader("localizaIP.json"),new TypeToken<ArrayList<Ip>>(){}.getType());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return ips;
    }


}
