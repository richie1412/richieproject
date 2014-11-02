package com.richie.app.my_app;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NamingException
    {
        System.out.println( "Hello World!" );
//        Properties props = System.getProperties();
//        
//        for (String name : props.stringPropertyNames()) {
//        	System.out.println(name + " --> "+props.getProperty(name) );
//			
//		}
        
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
        env.put(Context.PROVIDER_URL, "file:/D:/tmp") ;
        Context ctx = new InitialContext(env);
        
        
//        ServiceBean service = (ServiceBean) ctx.lookup("service");
        
        }
}
