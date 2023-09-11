package devandroid.tarsis.mylistapp.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.tarsis.mylistapp.model.Pessoa;
import devandroid.tarsis.mylistapp.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    public static final String NAME_PREFERENCES = "pref_lista";
    SharedPreferences.Editor pessoasLista;
    public PessoaController(MainActivity mainActivity){
        preferences = mainActivity.getSharedPreferences(NAME_PREFERENCES, 0);
        pessoasLista = preferences.edit();
    }

    public Pessoa buscar(Pessoa pessoa){
        pessoa.setPrimeiroNome(preferences.getString("primeiroNome", "na"));
        pessoa.setSobrenome(preferences.getString("sobrenome", "na"));
        pessoa.setNumeroTelefone(preferences.getString("numeroTelefone", "na"));
        pessoa.setEmail(preferences.getString("email", "na"));

        return pessoa;
    }

    public void limpar(){
        pessoasLista.clear();
        pessoasLista.apply();
    }
    public void salvar(@NonNull Pessoa pessoa){
        pessoasLista.putString("primeiroNome", pessoa.getPrimeiroNome());
        pessoasLista.putString("sobrenome", pessoa.getSobrenome());
        pessoasLista.putString("numeroTelefone", pessoa.getNumeroTelefone());
        pessoasLista.putString("email", pessoa.getEmail());

        pessoasLista.apply();
    }
}
