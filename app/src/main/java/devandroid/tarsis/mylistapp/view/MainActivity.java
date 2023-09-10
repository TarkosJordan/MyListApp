package devandroid.tarsis.mylistapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        Pessoa pessoaDoCadastro = new Pessoa();

        editNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editTelefone = findViewById(R.id.editTelefone);
        editEmail = findViewById(R.id.editEmail);

        buttonLimpar = findViewById(R.id.buttonLimpar);
        buttonFinalizar = findViewById(R.id.buttonFinalizar);
        buttonSalvar = findViewById(R.id.buttonSalvar);

        editNome.setText(pessoa.getPrimeiroNome());
        editSobrenome.setText(pessoa.getSobrenome());
        editTelefone.setText(pessoa.getNumeroTelefone());
        editEmail.setText(pessoa.getEmail());

        buttonLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editNome.setText("");
                editSobrenome.setText("");
                editEmail.setText("");
                editTelefone.setText("");
            }
        });

        buttonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Aplicativo Encerrado", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoaDoCadastro.setPrimeiroNome(editNome.getText().toString());
                pessoaDoCadastro.setSobrenome(editSobrenome.getText().toString());
                pessoaDoCadastro.setNumeroTelefone(editTelefone.getText().toString());
                pessoaDoCadastro.setEmail(editEmail.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo "+pessoaDoCadastro.toString(), Toast.LENGTH_LONG).show();
            }
        });

        Log.i("POOAndroid", pessoa.toString());
    }
}