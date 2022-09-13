package com.example.mobile_2022_02.Service;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.mobile_2022_02.DashboardActivity;
import com.example.mobile_2022_02.model.User;
import com.example.mobile_2022_02.Repository.UserRepository;

import java.util.List;

public class LoginService {

    public boolean login(Context context, String userPhone, String userPass) {
        Log.i("userDataLogin", userPhone);
        Log.i("userDataLogin", userPass);

        List<User> users = UserRepository.getUsers();

        int userPosition = -1;

        // Percorre o array de usuários, buscando pelos dados informados.
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserPhone().equals(userPhone) && users.get(i).getPassword().equals(userPass)) {
                userPosition = i;
            }
        }

        // Se conseguir encontrar um usuário no array
        if (userPosition > -1) {
            Intent intent = new Intent(context, DashboardActivity.class);

            // Adiciona dado para ser enviado a activity
            intent.putExtra("userPosition", userPosition);

            context.startActivity(intent);
            return true;
        }

        Toast.makeText(context, "Usuário e/ou senha inválidos", Toast.LENGTH_SHORT).show();
        return false;
    }
}
