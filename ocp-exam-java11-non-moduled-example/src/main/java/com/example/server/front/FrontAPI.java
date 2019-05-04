package com.example.server.front;

import com.example.server.internal.InternalAPI;

public class FrontAPI {
  public static String echo(String message) {
    return InternalAPI.echo(message) + " from " + name();
  }
  public static String name() {
    return "FrontAPI";
  }
}
