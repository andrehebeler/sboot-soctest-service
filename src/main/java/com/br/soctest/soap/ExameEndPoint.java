package com.br.soctest.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.br.soctest.repository.ExameRepository;

import io.spring.guides.gs_producing_web_service.GetExamesRequest;
import io.spring.guides.gs_producing_web_service.GetExamesResponse;

@Endpoint
public class ExameEndPoint {

	private static final String NAMESPACE_URI = "http://localhost:8001/ws";

	@Autowired
	private ExameRepository exameRepository;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getExamesRequest")
	@ResponsePayload
	public GetExamesResponse getExames(@RequestPayload GetExamesRequest request) {
		GetExamesResponse response = new GetExamesResponse();
		response.setExames(exameRepository.getExames(request.getExame()));

		return response;
	}

}
