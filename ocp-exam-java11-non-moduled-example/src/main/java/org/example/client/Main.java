package org.example.client;

import com.example.server.open.OpenAPI;

public class Main {
  public static void main(String[] args) {
    if (args.length == 1) {
      System.out.format("Hello %s!%n", OpenAPI.echo(args[0]));
    } else {
      System.out.format("Hello %s!%n", OpenAPI.echo("world"));
    }
  }
}
