package com.erika.marsrover;



public class App 
{
    public static void main( String[] args )
    {
      MarsRover rover= new MarsRover();
      			rover.setarPosicao(1, 2, Direction.N);	  
      			rover.processar("LMLMLMLMM");
      			rover.imprimirPosicao(); // prints 1 3 N
      			rover.setarPosicao(3, 3, Direction.E);
      			rover.processar("MMRMMRMRRM");
      			rover.imprimirPosicao(); // prints 5 1 E
    }
}
