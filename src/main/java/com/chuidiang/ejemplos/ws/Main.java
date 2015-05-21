package com.chuidiang.ejemplos.ws;

import javax.xml.ws.Endpoint;

public class Main {
   /**
    * @param args
    */
   public static void main(String[] args) {
      Endpoint
            .publish("/UnWebService", new UnWebService());
   }
}