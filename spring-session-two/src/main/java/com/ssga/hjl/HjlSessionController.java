package com.ssga.hjl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HjlSessionController {
	@GetMapping("/")
	public Map<String, Object> hello(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		request.getSession().setAttribute("Request URI", request.getRequestURL());
		map.put("Request URI2", request.getRequestURL());
		return map;
	}
	
	@GetMapping("/getsessions")
	public Object getSessions(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sessionId", request.getSession().getId());
		map.put("request URI2", request.getSession().getAttribute("Request URI"));
		return map;
	}
}
