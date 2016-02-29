public class Dragao {
	
	
	
	public static char[][] Dmove(char[][] l){
		java.util.Random rand = new java.util.Random();
		char[][] labD;
		labD = l;
		int Dmove = rand.nextInt(4) + 1;
 		int Dvivo = 0;
		int posid =0;
		int posjd =0;
		int espada =0;
		for(int i =0; i< 10; i++){
			for(int j =0; j< 10; j++){
				if(labD[i][j] == 'D' ){
					posid = i;
					posjd = j;
					Dvivo=1;
				}
				if(labD[i][j] == 'F' ){
					posid = i;
					posjd = j;
					Dvivo=1;
					espada =1;
				}
				
			}
		}
		
		if(Dvivo ==1){
			
				if(Dmove ==1){
					if(labD[posid][posjd-1] == 'E'){
						labD[posid][posjd] = ' ';
						labD[posid][posjd-1] = 'F';
					}
					else if(labD[posid][posjd-1] == 'H'){
						labD[posid][posjd] = ' ';
						labD[9][9] = 'N';
					}
					else if(labD[posid][posjd-1] == 'A'){
						labD[posid][posjd] = ' ';
					}
					else if(labD[posid][posjd-1] != 'x' && labD[posid][posjd-1] != 'S'){
						labD[posid][posjd] = ' ';
						labD[posid][posjd-1] = 'D';
				}
			}
				if(Dmove ==2){
					if(labD[posid][posjd+1] == 'E'){
						labD[posid][posjd] = ' ';
						labD[posid][posjd+1] = 'F';
					}
					else if(labD[posid][posjd+1] == 'H'){
						labD[posid][posjd] = ' ';
						labD[9][9] = 'N';
					}
					else if(labD[posid][posjd+1] == 'A'){
						labD[posid][posjd] = ' ';
					}
					else
					if(labD[posid][posjd+1] != 'x' && labD[posid][posjd+1] != 'S'){
						labD[posid][posjd] = ' ';
						labD[posid][posjd+1] = 'D';
				}
			}
				if(Dmove ==3){
					if(labD[posid-1][posjd] == 'E'){
						labD[posid][posjd] = ' ';
						labD[posid-1][posjd] = 'F';
				}
				else if(labD[posid-1][posjd] == 'H'){
					labD[posid][posjd] = ' ';
					labD[9][9] = 'N';
				}
				else if(labD[posid-1][posjd] == 'A'){
					labD[posid][posjd] = ' ';
				}
				else
					if(labD[posid-1][posjd] != 'x' && labD[posid-1][posjd] != 'S'){
						labD[posid][posjd] = ' ';
						labD[posid-1][posjd] = 'D';
				}
			}	
				if(Dmove ==4){
					if(labD[posid+1][posjd] == 'E'){
						labD[posid][posjd] = ' ';
						labD[posid+1][posjd] = 'F';
				}
				else if(labD[posid+1][posjd] == 'H'){
					labD[posid][posjd] = ' ';
					labD[9][9] = 'N';
				}
				else if(labD[posid+1][posjd] == 'A'){
					labD[posid][posjd] = ' ';
				}
				else
						if(labD[posid+1][posjd] != 'x' && labD[posid+1][posjd] != 'S'){
							labD[posid][posjd] = ' ';
							labD[posid+1][posjd] = 'D';
					}
			}
			
		}
			
		
		
		return l;
	}
	
	public static char[][] Dmovdorm(char[][] l){
		java.util.Random rand = new java.util.Random();
		char[][] labD;
		labD = l;
		int Dmove = rand.nextInt(5) + 1;
		int Dvivo = 0;
		int posid =0;
		int posjd =0;
		int espada =0;
		int dorme =0;
		for(int i =0; i< 10; i++){
			for(int j =0; j< 10; j++){
				if (labD[i][j] == 'd'){
					posid = i;
					posjd = j;
					Dvivo=1;
					dorme =1;
				}
				if(labD[i][j] == 'D' ){
					posid = i;
					posjd = j;
					Dvivo=1;
				}
				if(labD[i][j] == 'F' ){
					posid = i;
					posjd = j;
					Dvivo=1;
					espada =1;
				}
				
			}
		}
		
		if(Dvivo ==1){
			
				if(Dmove ==1){
					if(labD[posid][posjd-1] == 'E'){
						labD[posid][posjd] = ' ';
						labD[posid][posjd-1] = 'F';
					}
					else if(labD[posid][posjd-1] == 'H'){
						labD[posid][posjd] = ' ';
						labD[9][9] = 'N';
					}
					else if(labD[posid][posjd-1] == 'A'){
						labD[posid][posjd] = ' ';
					}
					else if(labD[posid][posjd-1] != 'x' && labD[posid][posjd-1] != 'S'){
						labD[posid][posjd] = ' ';
						labD[posid][posjd-1] = 'D';
				}
			}
				if(Dmove ==2){
					if(labD[posid][posjd+1] == 'E'){
						labD[posid][posjd] = ' ';
						labD[posid][posjd+1] = 'F';
					}
					else if(labD[posid][posjd+1] == 'H'){
						labD[posid][posjd] = ' ';
						labD[9][9] = 'N';
					}
					else if(labD[posid][posjd+1] == 'A'){
						labD[posid][posjd] = ' ';
					}
					else
					if(labD[posid][posjd+1] != 'x' && labD[posid][posjd+1] != 'S'){
						labD[posid][posjd] = ' ';
						labD[posid][posjd+1] = 'D';
				}
			}
				if(Dmove ==3){
					if(labD[posid-1][posjd] == 'E'){
						labD[posid][posjd] = ' ';
						labD[posid-1][posjd] = 'F';
				}
				else if(labD[posid-1][posjd] == 'H'){
					labD[posid][posjd] = ' ';
					labD[9][9] = 'N';
				}
				else if(labD[posid-1][posjd] == 'A'){
					labD[posid][posjd] = ' ';
				}
				else
					if(labD[posid-1][posjd] != 'x' && labD[posid-1][posjd] != 'S'){
						labD[posid][posjd] = ' ';
						labD[posid-1][posjd] = 'D';
				}
			}	
				if(Dmove ==4){
					if(labD[posid+1][posjd] == 'E'){
						labD[posid][posjd] = ' ';
						labD[posid+1][posjd] = 'F';
				}
				else if(labD[posid+1][posjd] == 'H'){
					labD[posid][posjd] = ' ';
					labD[9][9] = 'N';
				}
				else if(labD[posid+1][posjd] == 'A'){
					labD[posid][posjd] = ' ';
				}
				else
						if(labD[posid+1][posjd] != 'x' && labD[posid+1][posjd] != 'S'){
							labD[posid][posjd] = ' ';
							labD[posid+1][posjd] = 'D';
					}
			}
				if(Dmove ==5){
					labD[posid][posjd] = 'd';
				}
			
		}
		
			
		
		
		return l;
	}
	
}
