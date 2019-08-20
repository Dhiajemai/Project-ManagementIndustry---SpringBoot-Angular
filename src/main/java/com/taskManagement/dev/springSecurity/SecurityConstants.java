package com.taskManagement.dev.springSecurity;

public class SecurityConstants {
public static final String SECRET ="ouss.amari.net";
public static final long EXPIRATION_TIME = 864_000_000;  //10 days
public static final long COMPTEUR_TIME = 86_400_000 * 365;
public static final String TOKEN_PREFIX ="Bearer ";
public static final String HEADER_STRING ="Authorization";
public static final String HEADER_STRINGUser ="Username";
}
