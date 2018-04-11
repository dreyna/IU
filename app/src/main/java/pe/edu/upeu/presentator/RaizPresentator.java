package pe.edu.upeu.presentator;

import pe.edu.upeu.interfaces.RaizInterface;
import pe.edu.upeu.model.RaizModel;
import pe.edu.upeu.view.RaizCuadradoView;

/**
 * Created by DReyna on 11/4/2018.
 */

public class RaizPresentator implements RaizInterface.Presenter{
    private RaizInterface.View view;
    private RaizInterface.Model model;

    public RaizPresentator(RaizCuadradoView view){
        this.view = view;
        model = new RaizModel(this);
    }
    @Override
    public void mostrarResultado(String r) {
        if(view!=null){
            view.mostrarResultado(r);
        }
    }

    @Override
    public void raizCuadrada(String n) {
        if(view!=null){
            model.raizCuadrado(n);
        }
    }
}
