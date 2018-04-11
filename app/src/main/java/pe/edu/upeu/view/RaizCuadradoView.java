package pe.edu.upeu.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import pe.edu.upeu.interfaces.RaizInterface;
import pe.edu.upeu.iu.R;
import pe.edu.upeu.presentator.RaizPresentator;

public class RaizCuadradoView extends AppCompatActivity implements RaizInterface.View{
    private TextView tvr;
    private EditText edt1;
    private Button btnc;
    private RaizInterface.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvr = (TextView) findViewById(R.id.tvr);
        edt1 =(EditText) findViewById(R.id.txtn);

        presenter = new RaizPresentator(this);
    }
    public void calcular(View view){
        presenter.raizCuadrada(edt1.getText().toString());
    }

    @Override
    public void mostrarResultado(String r) {
        tvr.setText(r);
    }
}
