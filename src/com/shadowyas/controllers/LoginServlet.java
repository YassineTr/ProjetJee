package com.shadowyas.controllers;

import com.shadowyas.dao.UtilisateurDao;
import com.shadowyas.model.Utilisateur;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = (String) request.getParameter("login");
        String passowrd = (String) request.getParameter("password");
        boolean exist = false ;
        UtilisateurDao connectUser = new UtilisateurDao();


        if( login != null && passowrd != null){
            exist = connectUser.isExist(login, passowrd);
            System.out.println(exist);

        }
        if(exist == true){
            Utilisateur user = new Utilisateur();
            user=connectUser.getUser(login,passowrd);
            request.setAttribute("user",user);

            RequestDispatcher view = request.getRequestDispatcher("home.jsp");
            view.forward(request, response);
        }else{
            RequestDispatcher view = request.getRequestDispatcher("/");
            view.forward(request, response);
        }
    }

    }

