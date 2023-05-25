package br.edu.ifsuldeminas.fuel;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText textEtanol;
    private TextInputEditText textGasolina;
    private Button calcular;
    private ImageView imageFuel;
    private TextView fuelMessage;
    private ImageView share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textGasolina.findViewById(R.id.textInputEditTextGas);
        textEtanol.findViewById(R.id.textInputEditTextEtanol);
        calcular.findViewById(R.id.buttonCalcular);
        imageFuel.findViewById(R.id.imageViewFuel);
        fuelMessage.findViewById(R.id.textViewMessage);
        share.findViewById(R.id.imageViewShare);
    }
}