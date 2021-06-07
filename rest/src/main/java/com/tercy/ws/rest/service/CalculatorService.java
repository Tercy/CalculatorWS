package com.tercy.ws.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.xml.ws.Response;


@Path("calculator")
public class CalculatorService implements ICalculator {

    @GET
    @Path("/{add}")
    public Response add(int a, int b) {

        String output = "Sum   : " + a+b;

        return Response.status(200).entity(output).build();

    }

    @GET
    @Path("/{minus}")
    public Response add(int a, int b) {

        return Response.status(200).entity(a-b).build();

    }

    @GET
    @Path("/{divide}")
    public Response add(int a, int b) {

        return Response.status(200).entity(a/b).build();

    }
    @GET
    @Path("/{multiply}")
    public Response add(int a, int b) {

        return Response.status(200).entity(a*b).build();

    }


}
