package com.example.mobile_2022_02;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobile_2022_02.Model.User;
import com.example.mobile_2022_02.Repository.UserRepository;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Recupera dados vindos do login
        int userPosition = getIntent().getIntExtra("userPosition", -1);

        // Busca os dados do usuário logado
        User user = new UserRepository().getUserInfo(userPosition);

        // Preenche os dados na view.
        TextView textView = findViewById(R.id.textView2);
        textView.setText(user.getName());

    }
}