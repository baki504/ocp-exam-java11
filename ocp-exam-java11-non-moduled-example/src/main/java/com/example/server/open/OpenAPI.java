package com.example.server.open;

import com.example.server.internal.InternalAPI;

public class OpenAPI {
  public static String echo(String message) {
    return InternalAPI.echo(message) + " from " + name();
  }
  public static String name() {
    return "OpenAPI";
  }
}
