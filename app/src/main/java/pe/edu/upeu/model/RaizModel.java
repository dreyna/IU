package pe.edu.upeu.model;

import pe.edu.upeu.interfaces.RaizInterface;

/**
 * Created by DReyna on 11/4/2018.
 */

public class RaizModel implements RaizInterface.Model{
    private RaizInterface.Presenter presenter;
    private double resultado;
  public RaizModel(RaizInterface.Presenter presenter){
      this.presenter = presenter;
  }
    @Override
    public void raizCuadrado(String n) {
        resultado = Math.sqrt(Double.valueOf(n));
        presenter.mostrarResultado(String.valueOf(resultado));
    }
}
