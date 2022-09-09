package com.example.mobile_2022_02;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobile_2022_02.Repository.UserRepository;
import com.example.mobile_2022_02.Service.LoginService;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Gera alguns usuários
        new UserRepository().UserSeeder();

        // Busca dos dados digitados nos campos
        EditText userPhone = findViewById(R.id.LoginUserPhone);
        EditText userPass = findViewById(R.id.LoginUserPass);

        // Listener do botão de login
        View.OnClickListener onClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // Envia para o service de login tratar os dados
                boolean login = new LoginService().login(
                        view.getContext(),
                        userPhone.getText().toString(),
                        userPass.getText().toString()
                );

                // Se retornar sucesso, finaliza a activity
                if (login) {
                    finish();
                }
            }
        };

        findViewById(R.id.LoginButton).setOnClickListener(onClickListener);
    }

    @Override
    public void onClick(View view) {

    }
}