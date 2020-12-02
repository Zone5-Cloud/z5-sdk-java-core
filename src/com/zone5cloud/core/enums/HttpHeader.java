package com.zone5cloud.core.enums;

/** Http header strings which are added in the OkHttp Interceptors */
public enum HttpHeader {
	AUTHORIZATION("Authorization"),
	USER_AGENT("User-Agent"),
	TP_NO_DECORATE("tp-nodecorate"),
	API_KEY("Api-Key"),
	API_KEY_SECRET("Api-Key-Secret");
	
	private final String header;
	
	private HttpHeader(String header) {
		this.header = header;
	}
	
	@Override
	public String toString() {
		return header;
	}
}
