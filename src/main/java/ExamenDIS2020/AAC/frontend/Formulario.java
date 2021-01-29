package ExamenDIS2020.AAC.frontend;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value="", layout= mainview.class)
public class Formulario extends VerticalLayout{

    TextField texto;

    Text resultado;

    Button enviar;

    public Formulario(){
        texto = new TextField("IP");

        enviar = new Button("Enviar");

        resultado = new Text("");



        add(texto,enviar,resultado);
        enviar.addClickListener(c->resultado.setText(texto.getValue()));

    }


}
