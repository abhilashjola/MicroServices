package com.example.dakr;

import java.util.Set;
import java.util.List;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class Filter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		
		ServerHttpRequest request=exchange.getRequest();
		HttpHeaders headers =request.getHeaders();
		Set<String> keyset= headers.keySet();
		for (String key:keyset)
		{
			List<String> values=headers.get(key);
			System.out.println(values+".........."+key);
		}
		
		return chain.filter(exchange);
	}

	
	
	
}



