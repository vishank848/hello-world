package com.example.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.CurrencyConversionBean;
import com.example.feign.proxy.CurrencyExchangeServiceProxy;

@RestController
public class CurrencyConversionController {

	@Autowired
	private CurrencyExchangeServiceProxy proxy;

	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		// Map<String, String> uriVariables = new HashMap<>();
		// uriVariables.put("from", from);
		// uriVariables.put("to", to);
		// ResponseEntity<CurrencyConversionBean> responseEntity = new
		// RestTemplate().getForEntity(
		// "http://localhost:8090/currency-exchange/from/{from}/to/{to}",
		// CurrencyConversionBean.class,
		// uriVariables);
		// CurrencyConversionBean response = responseEntity.getBody();
		CurrencyConversionBean response = this.proxy.retrieveExchangeValue(from, to);
		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), response.getPort());
	}
}
