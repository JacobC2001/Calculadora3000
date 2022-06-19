package idat.dam.calculadora3000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* prueba de lectura del textview
        tvResultado = findViewById(R.id.tvResultado);
        tvResultado.setText("Hola mundo");*/

    }


    public void EscribirUno(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("1");
        } else {
            tvResultado.setText(tvResultado.getText() + "1");
        }

    }

    public void EscribirDos(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("2");
        } else {
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void EscribirTres(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("3");
        } else {
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void EscribirCuatro(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("4");
        } else {
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void EscribirCinco(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("5");
        } else {
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void EscribirSeis(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("6");
        } else {
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void EscribirSiete(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("6");
        } else {
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void EscribirOcho(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("8");
        } else {
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }

    public void EscribirNueve(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("9");
        } else {
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void EscribirCero(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        if (numero1 == 0.0f) {
            tvResultado.setText("0");
        } else {
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }


    public void Reiniciar(View view) {
        tvResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";

    }

    public void OperacionSuma(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "+";
        tvResultado.setText("0");
    }

    public void OperacionResta(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "-";
        tvResultado.setText("0");
    }

    public void OperacionMultiplicacion(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "*";
        tvResultado.setText("0");
    }

    public void OperacionDivision(View view) {
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        operacion = "/";
        tvResultado.setText("0");


    }

    public void Total(View view) {
        numero2 = Float.parseFloat(tvResultado.getText().toString());
        if (operacion.equals("/")) {
            if (numero2 == 0.0f) {
                tvResultado.setText("0");
                Toast.makeText(this, "LA OPERACION ES INVALIDA", Toast.LENGTH_LONG).show();
            } else {
                float result = numero1 / numero2;
                tvResultado.setText(result + "");
            }

        }
        if (operacion.equals("*")) {
            float result = numero1 * numero2;
            tvResultado.setText(result + "");
        }
        if (operacion.equals("+")) {
            float result = numero1 + numero2;
            tvResultado.setText(result + "");
        }
        if (operacion.equals("-")) {
            float result = numero1 - numero2;
            tvResultado.setText(result + "");

        }
    }

}