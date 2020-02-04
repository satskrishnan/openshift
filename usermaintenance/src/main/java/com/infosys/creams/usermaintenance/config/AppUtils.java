package com.infosys.creams.usermaintenance.config;

import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppUtils {

	private static final Logger logger = LoggerFactory.getLogger(AppUtils.class);

	private AppUtils() {
		throw new IllegalStateException("Utility class");
	}

	public static void printRequest(HttpServletRequest request) {
		String client = request.getRemoteAddr();
		logger.info("requested client: {} , Session ID : {} , URI :" + request.getMethod() + ":"
				+ request.getRequestURI() + "", client, request.getSession().getId());

		Map<String, String[]> params = request.getParameterMap();
		Iterator<String> i = params.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			String value = params.get(key)[0];
			logger.info("Request Param Name : {} , Value :  {} ", key, value);
		}

	}

}
