public class Labirinto {
	 
	public static char[][] labvazio(){
		
		char[][] labv = {{'x','x','x','x','x','x','x','x','x','x'},
				{'x',' ',' ',' ',' ',' ',' ',' ',' ','x'},
				{'x',' ','x','x',' ','x',' ','x',' ','x'},
				{'x',' ','x','x',' ','x',' ','x',' ','x'},
				{'x',' ','x','x',' ','x',' ','x',' ','x'},
				{'x',' ',' ',' ',' ',' ',' ','x',' ','S'},
				{'x',' ','x','x',' ','x',' ','x',' ','x'},
				{'x',' ','x','x',' ','x',' ','x',' ','x'},
				{'x',' ','x','x',' ',' ',' ',' ',' ','x'},
				{'x','x','x','x','x','x','x','x','x','x',}};
		
		return labv;
	}
	
	public static void main(String[] args){
	
		char[][] lab;
		
		char mov;
		
		lab = Heroi.Hinicio();
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		mov = Scanner.next().charAt(0);
		
		Heroi.Hmove(lab, mov);
		while(mov != 'C'){
			
		
		for(int i = 0; i < 10; i++ ){
			
			for(int j =0; j<10; j++){
				 System.out.print(lab[i][j]);
				 System.out.print(' ');
			}
			System.out.println();
		}
		mov = Scanner.next().charAt(0);
		
		Heroi.Hmove(lab, mov);
		if(lab[9][9] == 'N'){
			System.out.println("Perdeu o Jogo!");
			break;
		}
		if(lab[9][9] == 'M'){
			System.out.println("Ganhou o Jogo!");
			break;
		}
		}
		
	 }
}

