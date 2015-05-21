package com.chuidiang.ejemplos.ws;

import javax.xml.ws.Endpoint;

public class Main {
   /**
    * @param args
    */
   public static void main(String[] args) {
      Endpoint
            .publish("https://intense-shore-2560.herokuapp.com/UnWebService", new UnWebService());
   }
}