package com.restexample.couserservie.dto;

import org.springframework.http.HttpStatus;

public class ServiceResponse<T> {
	private HttpStatus status;
	private T response;
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
	public ServiceResponse(HttpStatus status, T response) {
		super();
		this.status = status;
		this.response = response;
	}
	public ServiceResponse() {
		super();
	}
	@Override
	public String toString() {
		return "ServiceResponse [status=" + status + ", response=" + response + "]";
	}
	

}
