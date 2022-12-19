

package com.login;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOUsers;
import com.mycompany.models.Users;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class DAOUsersIMPL extends Database implements DAOUsers{

    @Override
    public void registrar(Users user) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO users(cedula, days, type,Day_of_arrival) VALUES(?,?,?,?);");
            
            st.setInt(1, user.getCedula());
            st.setInt(2, user.getDays());
            st.setString(3, user.getType());
            st.setTimestamp(4, user.getDay_of_arrival());        
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Users user) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE users SET Cedula = ?, Days = ?, Type = ?, Day_of_arrival = ? WHERE id = ?");
            
            st.setInt(1, user.getCedula());
            st.setInt(2, user.getDays());
            st.setString(3, user.getType());
            st.setTimestamp(4, user.getDay_of_arrival()); 
            st.setInt(5, user.getId_user());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int userid) throws Exception {
       try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM users WHERE id = ?;");
            st.setInt(1, userid);
            st.executeUpdate();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
    }

    @Override
    public List<Users> listar(String busqueda) throws Exception {
        List<Users> lista = null;
        try {
            
            this.Conectar();
            
            String Query = busqueda.isEmpty() ? "SELECT * FROM users;" : "SELECT * FROM users WHERE Cedula LIKE '%" + Integer.valueOf(busqueda) + "%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Users user = new Users();
                user.setId_user(rs.getInt("id"));
                user.setCedula(rs.getInt("Cedula"));
                user.setDays(rs.getInt("Days"));
                user.setType(rs.getString("type"));
                user.setDay_of_arrival(rs.getTimestamp("day_of_arrival"));
                user.setRegistration_date(rs.getTimestamp("registration_date"));
                lista.add(user);
            }
            rs.close();
            st.close();
            
            
        } catch (Exception e) {
        }finally{
            this.Cerrar();
        }
        return lista;
    }


    @Override
    public Users getUserById(int userId) throws Exception {
       Users user = null;
        
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM users WHERE id = ? LIMIT 1;");
            st.setInt(1, userId);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                user = new Users();
                user.setId_user(rs.getInt("id"));
                user.setCedula(rs.getInt("Cedula"));
                user.setDays(rs.getInt("Days"));
                user.setType(rs.getString("type"));
                user.setDay_of_arrival(rs.getTimestamp("day_of_arrival"));
                user.setRegistration_date(rs.getTimestamp("registration_date"));
            }
            rs.close();
            st.close();
        } catch(Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return user;
    }
    
}
