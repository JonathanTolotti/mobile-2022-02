package com.example.mobile_2022_02;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mobile_2022_02.model.User;
import com.example.mobile_2022_02.Repository.UserRepository;
import com.example.mobile_2022_02.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDashboardBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_dashboard);
        // Recupera dados vindos do login
        int userPosition = getIntent().getIntExtra("userPosition", -1);

        // Busca os dados do usuário logado
        User user = new UserRepository().getUserInfo(userPosition);
        binding.setUser(user);
    }
}