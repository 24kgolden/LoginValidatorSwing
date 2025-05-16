package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraJPA {

    ControladoraPersistencia controlPersis;

    public ControladoraJPA() {

        controlPersis = new ControladoraPersistencia();
    }

    public String validarUser(String user, String password) {
        
        String mesanje = "";
        List<User> listUser = controlPersis.traerUser();
        
        for (User user1 : listUser) {

            if (user1.getNameUser().equals(user)) {

                if (user1.getPassword().equals(password)) {

                    mesanje = "Usuario y contraseña correctos. Bienvenido/a!";
                    return mesanje;
                    
                } else {

                    mesanje = "Contraseña incorrecta";
                    return mesanje;
                }
            } else {

                mesanje = "Usuario no encontrado";
                //return mesanje;
            }
        }

        return mesanje;
    }
}
