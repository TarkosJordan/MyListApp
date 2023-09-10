package devandroid.tarsis.mylistapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import devandroid.tarsis.mylistapp.R;

import devandroid.tarsis.mylistapp.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    EditText editNome;
    EditText editSobrenome;
    EditText editTelefone;
    EditText editEmail;

    Button buttonLimpar;
    Button buttonSalvar;
    Button buttonFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Tarkos");
        pessoa.setSobrenome("Jordan");
        pessoa.setEmail("tarkos.jordan@gmail.com");
        pessoa.setNumeroTelefone("55-54-91321020");

        editNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editTelefone = findViewById(R.id.editTelefone);
        editEmail = findViewById(R.id.editEmail);

        editNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobrenome());
        editTelefone.setText(pessoa.getNumeroTelefone());
        editEmail.setText(pessoa.getEmail());

        Log.i("POOAndroid", pessoa.toString());
    }
}