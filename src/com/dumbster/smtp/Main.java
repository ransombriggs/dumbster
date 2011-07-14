package com.dumbster.smtp;

public class Main {

  public static void main(String args[]) {
    if (args.length != 1) {
      System.out.println("usage: Main <port number>");
    } else {
      SimpleSmtpServer.start(Integer.parseInt(args[0]));
    }
  }
}

