package org.nelio.xadres.boardgame;
import java.io.Serial;

public class BorderExeption extends RuntimeException{

      @Serial
      private static final long serialVersionUID = 1L;

      public BorderExeption(String msg){
          super(msg);
      }
}
