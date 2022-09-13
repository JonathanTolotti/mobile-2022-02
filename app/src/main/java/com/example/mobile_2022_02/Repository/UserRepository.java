package com.example.mobile_2022_02.Repository;

import com.example.mobile_2022_02.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final List<User> users = new ArrayList<>();

    /**
     * @param user entidade usuário
     *
     * Cria um novo usuário no array
     */
    public void createUser(User user) {
        users.add(user);
    }


    /**
     * @return List<User> listagem de usuários
     */
    public static List<User> getUsers() {
        return users;
    }

    public User getUserInfo(int userPosition) {
        return users.get(userPosition);
    }

    /**
     * Cria usuários padrão.
     */
    public void UserSeeder() {
        createUser(new User(1, "Usuário 01", "5199999999", "1234"));
        createUser(new User(2, "Usuário 02", "51988888888", "1234"));
    }
}
