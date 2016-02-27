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
			if(espada ==1){
				
			}else {
				if(Dmove ==1){
					if(labD[posid][posjd-1] != 'x'){
						labD[posid][posjd] = ' ';
						labD[posid][posjd-1] = 'D';
				}
			}
			
		}
			}
		
		
		return l;
	}
	
}
