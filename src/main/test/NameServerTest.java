package test;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class NameServerTest {
	public static void main(String[] args) throws NamingException {
		final String fileName = "wp-connect.zip";
		final String dirName = "website";
		final String zipName=  "html_zh_CN.zip";
		
		Hashtable env = new Hashtable();
		
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
		env.put(Context.PROVIDER_URL, "file:/D:/tmp");
		Context ctx = new InitialContext(env);
		System.out.println(ctx.getNameInNamespace());
		Object file = ctx.lookup(fileName);
		System.out.println("fileName："+" 名称被绑定到："+file);
		System.out.println("file的类型是："+file .getClass());
		
		//根据名字查找对象
		Object dir = ctx.lookup(dirName);
		System.out.println(dirName + " 名称被绑定到："+ dir); 
		 
		
		System.out.println("dir的类型是："+dir.getClass());
		
		
		//根据名字查找对象
				Object zip = ctx.lookup(zipName);
				System.out.println(dirName + " 名称被绑定到："+ zip); 
				 
				
				System.out.println("dir的类型是："+zip.getClass());
		ctx.close();
		
	}
}
