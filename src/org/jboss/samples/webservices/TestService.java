package org.jboss.samples.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class TestService {

	@WebMethod()
	public String sayHello(@WebParam(name="nombre") String nombre, @WebParam(name="apellido") String apellido) {
	    System.out.println("Hola: " + nombre);
	    return "Hola " + nombre + " " + apellido + "!";
	}
}
