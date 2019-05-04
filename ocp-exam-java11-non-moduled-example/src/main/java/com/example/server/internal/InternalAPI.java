package com.example.server.internal;

public class InternalAPI {
  public static String echo(String message) {
    return message + " via " + name();
  }
  public static String name() {
    return "InternalAPI";
  }
}
