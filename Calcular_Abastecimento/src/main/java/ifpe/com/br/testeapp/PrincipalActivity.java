package ifpe.com.br.testeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static ifpe.com.br.testeapp.R.id.BTNOK;

public class PrincipalActivity extends AppCompatActivity {


    EditText editTextGas ;
    EditText editTextAlco;
    TextView  textResult;
    Button BTNOK;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

      editTextGas = (EditText) findViewById(R.id.editTextGas);
      editTextAlco = (EditText) findViewById(R.id.editTextAlco);
      textResult  = (TextView) findViewById(R.id.textResult);


      BTNOK = (Button) findViewById(R.id.BTNOK);


      BTNOK.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              double gasolina = Double.parseDouble(editTextGas.getText().toString());
              double alcool = Double.parseDouble(editTextAlco.getText().toString());

              String Resultado ;

              if((gasolina * 0.7)> alcool){
                  Resultado = "Àlcool";

              }else{
                  Resultado = "Gasolina";

              }
              textResult.setText(Resultado);
          }
      });



    }
}
