package ExamenDIS2020.AAC.frontend;

import ExamenDIS2020.AAC.backend.CrearJson;
import ExamenDIS2020.AAC.backend.FuncionesAnexoIP;
import ExamenDIS2020.AAC.backend.Ip;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.IntegerField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.Iterator;

@Route(value="", layout= mainview.class)
public class Formulario extends VerticalLayout{

    Ip ip;

    TextField texto;

    Text resultado;

    Button enviar;

    public Formulario(){
        ip = new Ip();
        texto = new TextField("IP");

        enviar = new Button("Enviar");

        resultado = new Text("");



        add(texto,enviar,resultado);
        enviar.addClickListener(c->{

            ip = devolverGeo(texto.getValue());
            resultado.setText(ip.toString());
        });

    }


    public Ip devolverGeo(String ipdoted){

        if(Long.parseLong(ipdoted) > Long.parseLong("4294967295")){
            resultado.setText("Ip demasiado grande");
        }

        Long ipLong = FuncionesAnexoIP.Dot2LongIP(ipdoted);

        Ip ip = new Ip();
        ArrayList<Ip> ips = CrearJson.leerFicheroJson();
        Iterator iterator_ips = ips.iterator();

        while(iterator_ips.hasNext()){
            ip = (Ip) iterator_ips.next();
            if(ipLong>= ip.getIp_from() && ipLong <= ip.getIp_to()){
               return ip;
            }
        }

        return new Ip();
    }


}
