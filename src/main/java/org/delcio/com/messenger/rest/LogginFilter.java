package org.delcio.com.messenger.rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class LogginFilter implements ContainerRequestFilter, ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
		System.out.println("Request filter");
		System.out.println("Headers: " + requestContext.getHeaders());
	}

	@Override
	public void filter(ContainerRequestContext responseContext) throws IOException {
		System.out.println("Response filter");
		System.out.println("Headers: " + responseContext.getHeaders());
	}

}
