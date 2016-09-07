package com.ibm.sih;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import com.ibm.personafusion.db.CloudantClient;

public class InitDB extends HttpServlet
{
 
    public void init() throws ServletException
    {
    	System.out.println("Initalizing DB");
        CloudantClient cc = new CloudantClient();
        System.out.println("DB has " + cc.getAllPeople().size() + " people in it");
    }
}