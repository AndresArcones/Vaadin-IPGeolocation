package ExamenDIS2020.AAC.frontend;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;

public class mainview extends AppLayout {

    Formulario form = new Formulario();;

    public mainview(){
        H1 titulo = new H1("Examen DIS 2021");
        addToNavbar(titulo);
    }

}
