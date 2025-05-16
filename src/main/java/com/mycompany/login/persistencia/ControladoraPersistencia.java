package com.mycompany.login.persistencia;

import com.mycompany.login.logica.User;
import java.util.List;

public class ControladoraPersistencia {
    UserJpaController userJPA = new UserJpaController();

    public List<User> traerUser() {
        List<User> listaUser = userJPA.findUserEntities();
        return listaUser;
    }
}
