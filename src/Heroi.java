
public class Heroi {

	public static char[][] Hinicio(){
		char[][] labH;
		
		labH = Labirinto.labvazio();
		
		labH[1][1] = 'H';
		labH[8][1] = 'E';
		labH[3][1] = 'D';
		return labH;
	}
	
	public static char[][] Hmove(char[][] l, char move){
		char[][] labH;
		
		labH = l;
		int armado = 0;
		int dragaovivo = 0;
		int posi = 0;
		int posj = 0;
		int posid;
		int posjd = 0;
		
		for(int i =0; i< 10; i++){
			for(int j =0; j< 10; j++){
				if(labH[i][j] == 'H'){
					posi = i;
					posj = j;
				}
				if(labH[i][j] == 'A'){
					posi = i;
					posj = j;
					armado = 1;
				}
				if(labH[i][j] == 'D' || labH[i][j] == 'D'){
					posid = i;
					posjd = j;
					dragaovivo=1;
				}
				
			}
		}
		if(armado == 0){
		if(move == 'W'){
			if(labH[posi][posj-1] == 'E'){
				labH[posi][posj] = ' ';
				labH[posi][posj-1] = 'A';
			}else if(labH[posi][posj-1] == 'D' || labH[posi][posj-1] == 'F' ){
				labH[posi][posj] = ' ';
				labH[9][9] = 'N';
			}else if(labH[posi][posj-1] != 'x' && labH[posi][posj-1] !='S' && labH[posi][posj-1] != 'd'){ //mudar em todos
				labH[posi][posj] = ' ';
				labH[posi][posj-1] = 'H';
		}}
		if(move == 'E'){
			if(labH[posi][posj+1] == 'E'){
				labH[posi][posj] = ' ';
				labH[posi][posj+1] = 'A';
			
			}else if(labH[posi][posj+1] == 'D' || labH[posi][posj+1] == 'F'){
				labH[posi][posj] = ' ';
				labH[9][9] = 'N';
			}
		else if(labH[posi][posj+1] != 'x' && labH[posi][posj+1] !='S' && labH[posi][posj+1] != 'd'){
			labH[posi][posj] = ' ';
			labH[posi][posj+1] = 'H';}
		}
		if(move == 'S'){
			if(labH[posi+1][posj] == 'E'){
				labH[posi][posj] = ' ';
				labH[posi+1][posj] = 'A';
			}
			else if(labH[posi+1][posj] == 'D' || labH[posi+1][posj] == 'F'){
				labH[posi][posj] = ' ';
				labH[9][9] = 'N';
			}else if(labH[posi+1][posj] != 'x' && labH[posi+1][posj] !='S'&& labH[posi+1][posj] != 'd'){
				labH[posi][posj] = ' ';
				labH[posi+1][posj] = 'H';
			}
		}
		if(move == 'N'){
			if(labH[posi-1][posj] == 'E'){
				labH[posi][posj] = ' ';
				labH[posi-1][posj] = 'A';
			}
			else if(labH[posi-1][posj] == 'D' || labH[posi-1][posj] == 'F'){
				labH[posi][posj] = ' ';
				labH[9][9] = 'N';
			}else if(labH[posi-1][posj] != 'x' && labH[posi-1][posj] !='S' && labH[posi-1][posj] != 'd'){
				labH[posi][posj] = ' ';
				labH[posi-1][posj] = 'H';
			}
		}
		}
		if(armado == 1){
			if(move == 'W'){
				if(labH[posi][posj-1] == 'S' && dragaovivo == 0){
					labH[9][9] = 'M';
				}
				else if(labH[posi][posj-1] != 'x' && labH[posi][posj-1] != 'S'){
					labH[posi][posj] = ' ';
					labH[posi][posj-1] = 'A';
				}
			}
			if(move == 'E'){
				if(labH[posi][posj+1] == 'S' && dragaovivo == 0){
					labH[9][9] = 'M';
				}
				if(labH[posi][posj+1] != 'x' && labH[posi][posj+1] != 'S'){
					labH[posi][posj] = ' ';
					labH[posi][posj+1] = 'A';
				}
			}
			if(move == 'S'){
				if(labH[posi+1][posj] == 'S' && dragaovivo == 0){
					labH[9][9] = 'M';
				}
				if(labH[posi+1][posj] != 'x' && labH[posi+1][posj] != 'S'){
					labH[posi][posj] = ' ';
					labH[posi+1][posj] = 'A';
				}
			}
			if(move == 'N'){
				if(labH[posi-1][posj] == 'S'&& dragaovivo == 0){
					labH[9][9] = 'M';
				}
				if(labH[posi-1][posj] != 'x' && labH[posi-1][posj] != 'S'){
					labH[posi][posj] = ' ';
					labH[posi-1][posj] = 'A';
				}
			}
			}
		
		return labH;
	}
}

