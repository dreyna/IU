package pe.edu.upeu.interfaces;

/**
 * Created by DReyna on 11/4/2018.
 */

public interface RaizInterface {
    interface View{
        void mostrarResultado(String r);
    }
    interface Presenter{
        void mostrarResultado(String r);
        void raizCuadrada(String n);
    }
    interface Model{
        void raizCuadrado(String n);
    }
}
