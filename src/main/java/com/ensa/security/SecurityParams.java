package com.ensa.security;

public interface SecurityParams {
	
	public static final String JWT_HEADER_NAME="Authorization";
	public static final String SECRET="yassine@hoummani.net";
	public static final long EXPIRATION=10*24*3600;
	public static final String HEADER_PREFIX="Bearer ";

}