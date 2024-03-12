package com.ejb;

import java.sql.SQLException;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;

import com.model.MovieUsers;
import com.model.Status;

import dao.MovieUserDAO;
import dao.MovieUsersDAO;
/**
 * Session Bean implementation class UserEJB
 */
@Stateless
@LocalBean
public class UserEJB {

    /**
     * Default constructor. 
     */
    public UserEJB() {
        // TODO Auto-generated constructor stub
    }
    
    @Inject
    private MovieUsersDAO movieusersdao;
    
    public Status signUp(MovieUsers movieusers)throws SQLException, Exception{
    	System.out.println("This is Signup ejb");
    	return movieusersdao.signUp(movieusers);
    }
   
    
    public MovieUsers signIn(MovieUsers movieusers)throws SQLException {
    	System.out.println("This is SignIn ejb");
    	return movieusersdao.signIn(movieusers);
    }
    
    
}
