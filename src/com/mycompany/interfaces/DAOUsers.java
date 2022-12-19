

package com.mycompany.interfaces;

import com.mycompany.models.Users;
import java.util.List;


public interface DAOUsers {
    public void registrar(Users user) throws Exception;
    public void modificar(Users user) throws Exception;
    public void eliminar(int userid) throws Exception;
    public List<Users> listar(String busqueda) throws Exception;
    public Users getUserById(int userId) throws Exception;
        
    
}
