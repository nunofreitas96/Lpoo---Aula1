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
	
	public static void JDmove(){
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
		Dragao.Dmove(lab);
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
	
	public static void JDnmove(){
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
	
	public static void JDmovedorme(){
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
		Dragao.Dmovdorm(lab);
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
	
	public static void main(String[] args){
	
		java.util.Scanner Scanner = new java.util.Scanner(System.in);
		int jogo;
		jogo = 0;
		System.out.println("Jogue o jogo escolhendo a direccção cardinal do movimento do herói (N/S/E/W)!");
		System.out.println("Escolha o modo de jogo, 1 para o dragão não se mexer, 2 para se mexer, 3 para poder adormecer.");
		while(jogo < 1 || jogo >3){
		jogo = Scanner.nextInt();
		}
		if (jogo == 1){
			System.out.println("O jogo começa!");
			JDnmove();
		}
		if (jogo ==2){
			System.out.println("O jogo começa!");
			JDmove();
		}
		if (jogo ==3){
			System.out.println("O jogo começa!");
			JDmovedorme();
		}
	 }
}

