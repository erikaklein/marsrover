package com.erika.marsrover;

enum Direction {N, S, E, W}

public class MarsRover {
	Integer x = 0;
	Integer y = 0;
	Direction direction = Direction.N;	

public void setarPosicao(Integer x, Integer y, Direction direction) {
	this.x = x;
	this.y = y;
	this.direction = direction;
	}

public void imprimirPosicao(){
	System.out.println(this.x + " " + this.y + "  " + this.direction);  
}

public void virarEsquerda(){
	  switch (this.direction){
	  			case N:
	                this.direction = Direction.W;
	                break;
	  			case E:
	                this.direction = Direction.N;
	                break;
	  			case S:
	                this.direction = Direction.E;
	                break;
	  			case W:
	                this.direction = Direction.S;
	                break;
	  			}
		}
	        	
public void virarDireita(){
	  switch (this.direction){
	  			case N:
	                this.direction = Direction.E;
	                break;
	  			case E:
	                this.direction = Direction.S;
	                break;
	  			case S:
	                this.direction = Direction.W;
	                break;
	  			case W:
	                this.direction = Direction.N;
	                break;
	  			
	  			
	        	}
		}


public void mover(){
	  switch (this.direction){
	  			case N:
	                this.y++ ;
	                break;
	  			case W:
	                this.x--;
	                break;
	  			case S:
	                this.y--;
	                break;
	  			case E:
	                this.x++;
	                break;
	        	}
		}

public void processar(String comando) {
	for (int idx = 0; idx < comando.length(); idx++) 
	{
	processar(comando.charAt(idx));
	}				
}			

public void processar(Character comando){
		if(comando.equals('L'))
		{
			virarEsquerda();
		} 
		else if(comando.equals('R'))
		{
			virarDireita();
		} 
		else if(comando.equals('M')){
			mover();
		}

		else {
			throw new IllegalArgumentException(
					"Fale na linguagem de Marte, por favor!");
		}
}
}


