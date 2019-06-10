package com.example.roberthsantos.homecutadmin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roberthsantos.homecutadmin.models.Produto;
import com.example.roberthsantos.homecutadmin.models.Servico;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class AddServiceActivity extends AppCompatActivity {

    EditText nome;
    EditText valor;

    DatabaseReference databaseServicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_service);

        databaseServicos = FirebaseDatabase.getInstance().getReference("servico");

        nome = (EditText) findViewById(R.id.et_add_nome);
        valor = (EditText) findViewById(R.id.et_add_valor);
    }

    public void adicionarServico(View view) {

        String servicoNome = nome.getText().toString().trim();
        Double servicoValor = Double.valueOf(valor.getText().toString());
        String id = databaseServicos.push().getKey();

        Servico servico = new Servico(id,servicoNome,servicoValor);
        Produto produto = new Produto();
        produto.setNome("Shampoo");
        produto.setValor(15.00);

        Servico servico2 = new Servico();
        servico2.setIdServico(id);
        servico2.setNome(servicoNome);
        servico2.setValor(servicoValor);
        servico2.setProduto(produto);

        databaseServicos.child(id).setValue(produto);


        Toast.makeText(this, "Serviço adicionado", Toast.LENGTH_SHORT).show();
        //finish();


    }
}
