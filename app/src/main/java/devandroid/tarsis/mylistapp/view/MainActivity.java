package devandroid.tarsis.mylistapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import devandroid.tarsis.mylistapp.R;

import devandroid.tarsis.mylistapp.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Tarkos");
        pessoa.setSobreNome("Jordan");
        pessoa.setEmail("tarkos.jordan@gmail.com");
        pessoa.setNumeroTelefone("55-54-91321020");

        Log.i("POOAndroid", pessoa.toString());
    }
}