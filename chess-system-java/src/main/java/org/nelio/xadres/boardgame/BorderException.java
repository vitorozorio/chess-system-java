package org.nelio.xadres.boardgame;
import java.io.Serial;

public class BorderException extends RuntimeException{

      @Serial
      private static final long serialVersionUID = 1L;

      public BorderException(String msg){
          super(msg);
      }
}
