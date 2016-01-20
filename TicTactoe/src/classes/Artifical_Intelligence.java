package classes;


import java.util.Arrays;
import java.util.Random;
import jfame.PlayingPage;


/**
 * This class is an artificial intelligence class. According to level of difficulty,it calculates all possibilities
 * and selects the best move from calculations. It uses eight different methods {@code checkMyMoves(),checkEnemyMoves(),
 * cleverMoveOne(), defanseOne(),cleverMoveTwo(), defanseTwo(), cleverMoveThree(), defanseThree()} and five different 
 * calculation methods {@code calculateResultsMoveTwo(), calculateResultsMoveThree(), calculateResultDefanceOne(), 
 * calculateResultDefanceTwo(), calculateResultsForDefanceThree()}. 
 * @author Mert SOLAK
 * @author Onur ELGÜN
 * @see Collections
 * @see Arrays
 *
 */

public class Artifical_Intelligence extends Storage {
	private int[] vertical,horizontal,cross,result;
	private int firstMove,secondMove,thirdMove,fourthMove,fifthMove,sixthMove;
	private String hardness;
	/**
	 * This is a default constructor. It reserves places in memory for variables.
	 *
	 */
	
	public Artifical_Intelligence(){
		vertical = new int[3];
		horizontal = new int[3];
		cross = new int[2];
		result = new int[531441];
		
	}
	/**
	 * This is a parametric constructor. It reserves places in memory for variables and takes playing page object
	 * to check the level of difficulty and to control playing page JFrame.
	 * @param p and pObject are the playing page objects. 
	 *
	 */
	public Artifical_Intelligence(PlayingPage p){
		pObject = p;
		if(pObject.getSinglePlayerObject() != null ){
			if(pObject.getSinglePlayerObject().getRdbtnHard().isSelected())
				hardness = "Hard";
			if(pObject.getSinglePlayerObject().getRdbtnInsane().isSelected())
				hardness = "Insane";
			if(pObject.getSinglePlayerObject().getRdbtnMedium().isSelected())
				hardness = "Medium";
			if(pObject.getSinglePlayerObject().getRdbtnEasy().isSelected())
				hardness = "Easy";
		}
		result = new int[531441];
		vertical = new int[3];
		horizontal = new int[3];
		cross = new int[2];
	}
	public void setFirstMove(int i){
		firstMove = i;
	}
	public void setSecondMove(int i){
		secondMove = i;
	}
	public void setThirdMove(int i){
		thirdMove = i;
	}
	public void setFourthMove(int i){
		fourthMove = i;
	}
	public void setFifthMove(int i){
		fifthMove = i;
	}
	public void setSixthMove(int i){
		sixthMove = i;
	}
	public void setHardness(String s){
		hardness = s;
	}
	public int getFirstMove(){
		return firstMove;
	}
	public int getSecondMove(){
		return secondMove;
	}
	public int getThirdMove(){
		return thirdMove;
	}
	public int getFourthMove(){
		return fourthMove;
	}
	public int getFifthMove(){
		return fifthMove;
	}
	public int getSixthMove(){
		return sixthMove;
	}
	public String getHardness(){
		return hardness;
	}
	/**
	 * This method uses {@code setMethods()} in playing page class to set them empty.
	 *
	 */
	public void resetLine(int i){
		if(i == 1)
			pObject.setButton_1("");
		if(i == 2)
			pObject.setButton_2("");
		if(i == 3)
			pObject.setButton_3("");
		if(i == 4)
			pObject.setButton_4("");
		if(i == 5)
			pObject.setButton_5("");
		if(i == 6)
			pObject.setButton_6("");
		if(i == 7)
			pObject.setButton_7("");
		if(i == 8)
			pObject.setButton_8("");
		if(i == 9)
			pObject.setButton_9("");
	}
	/**
	 * This method assigns given integers to @param result[].
	 */
	public void fillResult(int i){
		for(int counter = 0;  counter < (result.length) ;counter++){
			if(result[counter] == 0){
				result[counter] = i;
				return;
			}
		}
	}
	/**
	 * This method selects the best move from data which came from {@code cleverMoveThree()} in @param result[]
	 * and decide to whether play or not.
	 */
	public boolean calculateResultsMoveThree(){
		int max = 0,min = 0;
		Random rand = new Random();
		int[] res = new int[9];
 		for(int i  = 0; i < result.length ; i++){
			if(result[i] == 0);
			if(result[i] == 1)
				res[0]++;
			if(result[i] == 2)
				res[1]++;
			if(result[i] == 3)
				res[2]++;
			if(result[i] == 4)
				res[3]++;
			if(result[i] == 5)
				res[4]++;
			if(result[i] == 6)
				res[5]++;
			if(result[i] == 7)
				res[6]++;
			if(result[i] == 8)
				res[7]++;
			if(result[i] == 9)
				res[8]++;
		}
 		for (int i = 0; i < res.length; i++) {
			  if (res[i] > max) {
					  max = res[i];
			  }
		}
 		min = max;
		for (int i = 0; i < res.length; i++) {
			if (res[i] < min && res[i] != 0) {
				min = res[i];
			}
		}
		if(result[0] > 0){
			System.out.println(Arrays.toString(res));
			for (int i = 0;; i++) {
			    int n = rand.nextInt(9);
			    if(res[n] != 0 && res[n] != min){
			    	put(n+1,n+1,1,pObject.getNextPlayer());
			    	break;
			    }
			}
			for(int i  = 0; i < result.length ; i++){
				result[i] = 0;
			}
			return true;
		}
		else{
			for(int i  = 0; i < result.length ; i++){
				result[i] = 0;
			}
			return false;
		}
	}
	/**
	 * This method selects the best move from data which came from {@code defanseTwo()} in @param result[]
	 * and decide to whether play or not.
	 */
	public boolean calculateResultDefanceTwo(){
		int[] res = new int[9];
		int[] maxIndexArr = new int[9];
		Random rand = new Random();
		int max = 0;
 		for(int i  = 0; i < result.length ; i++){
			if(result[i] == 0);
			if(result[i] == 1)
				res[0]++;
			if(result[i] == 2)
				res[1]++;
			if(result[i] == 3)
				res[2]++;
			if(result[i] == 4)
				res[3]++;
			if(result[i] == 5)
				res[4]++;
			if(result[i] == 6)
				res[5]++;
			if(result[i] == 7)
				res[6]++;
			if(result[i] == 8)
				res[7]++;
			if(result[i] == 9)
				res[8]++;
		}
		if(result[0] > 0){
			System.out.println(Arrays.toString(res));
			for (int i = 0; i < 9; i++) {
				if(res[i] == 0){
					for(int j = 0; j < 9; j++){
						firstMove = put(j+1,j+1,1,pObject.getNextPlayer());
						if(firstMove == -1)
							continue;
						checkMyMoves(false);
						if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 1){
							secondMove = checkMyForDefanse();
							if(secondMove == (i+1)){
								resetLine(secondMove);
								for(int k  = 0; k < result.length ; k++){
									result[k] = 0;
								}
								return true;
							}
							resetLine(secondMove);
						}
						resetLine(firstMove);
					}
				}
			}
			for (int i = 0; i < 9; i++) {
		    	if(res[i] > max){
		    		max = res[i];
		    	}
			}
			int c = 0;
			for (int i = 0; i < 9; i++) {
		    	if(res[i] == max){
		    		maxIndexArr[c] = i;
		    		c++;
		    	}
			}
		    int n = rand.nextInt(c);
			put(maxIndexArr[n]+1,maxIndexArr[n]+1,1,pObject.getNextPlayer());
			for(int i  = 0; i < result.length ; i++){
				result[i] = 0;
			}
			return true;
		}
		else{
			for(int i  = 0; i < result.length ; i++){
				result[i] = 0;
			}
			return false;
		}
	}
	/**
	 * This method selects the best move from data which came from {@code defanseOne()} in @param result[]
	 * and decide to whether play or not.
	 */
	public boolean calculateResultDefanceOne(){
		int[] res = new int[9];
		int[] maxIndexArr = new int[9];
		int[] resCopy = new int[9];
		Random rand = new Random();
		int max = 0, counter = 0, number = 0;
 		for(int i  = 0; i < result.length ; i++){
			if(result[i] == 0);
			if(result[i] == 1)
				res[0]++;
			if(result[i] == 2)
				res[1]++;
			if(result[i] == 3)
				res[2]++;
			if(result[i] == 4)
				res[3]++;
			if(result[i] == 5)
				res[4]++;
			if(result[i] == 6)
				res[5]++;
			if(result[i] == 7)
				res[6]++;
			if(result[i] == 8)
				res[7]++;
			if(result[i] == 9)
				res[8]++;
		}
		if(result[0] > 0){
			System.out.println(Arrays.toString(res));
			for (int i = 0; i < res.length; i++) {
				if(res[i] != 0)
		    	resCopy[i] = res[i];
			}
			Arrays.sort(resCopy);
			for (int i = 0; i < 9; i++) {
				if (res[i] > max) {
					max = res[i];
				}
			}
			for (int i = 8; i >= 0; i--) {
		    	if(resCopy[i] > 0){
		    		number = resCopy[i];
		    	}else
		    		continue;
		    	for(int t = 0; t < 9;t++){
				     if(res[t] == number){
				        counter++;
				     }
				}
		    	if(counter > 1){
		    		for (int m = 0; m < 9; m++) {
						if(res[m] == 0){
							for(int j = 0; j < 9; j++){
								firstMove = put(j+1,j+1,1,pObject.getNextPlayer());
								if(firstMove == -1)
									continue;
								checkMyMoves(false);
								if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 1){
									secondMove = checkMyForDefanse();
									if(secondMove == (m+1)){
										resetLine(secondMove);
										for(int k  = 0; k < result.length ; k++){
											result[k] = 0;
										}
										return true;
									}
									resetLine(secondMove);
								}
								resetLine(firstMove);
							}
						}
					}
		    		for(int z = 0; z < 9; z++){
		    			for (int m = 0; m < 9; m++) {
		    				if(res[m] == resCopy[z] && resCopy[z] != max){
		    					for(int n = 0; n < 9; n++){
		    						firstMove = put(n+1,n+1,1,pObject.getNextPlayer());
		    						if(firstMove == -1)
		    							continue;
		    						checkMyMoves(false);
		    						if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 1){
		    							secondMove = checkMyForDefanse();
		    							if(secondMove == (m+1)){
		    								resetLine(secondMove);
		    								for(int k  = 0; k < result.length ; k++){
		    									result[k] = 0;
		    								}
		    								return true;
		    							}
		    							resetLine(secondMove);
		    						}
		    						resetLine(firstMove);
		    					}
		    				}
		    			}
		    		}
		    	}else
		    		counter = 0;
			}
			int c = 0;
			for (int i = 0; i < 9; i++) {
		    	if(res[i] == max){
		    		maxIndexArr[c] = i;
		    		c++;
		    	}
			}
		    int n = rand.nextInt(c);
			put(maxIndexArr[n]+1,maxIndexArr[n]+1,1,pObject.getNextPlayer());
			for(int i  = 0; i < result.length ; i++){
				result[i] = 0;
			}
			return true;
		}
		else{
			for(int i  = 0; i < result.length ; i++){
				result[i] = 0;
			}
			return false;
		}
	}
	/**
	 * This method selects the best move from data which came from {@code cleverMoveTwo()} in @param result[]
	 * and decide to whether play or not.
	 */
	public boolean calculateResultsMoveTwo(){
		int[] res = new int[9];
		int[] maxIndexArr = new int[9];
		int[] resCopy = new int[9];
		Random rand = new Random();
		int max = 0;
   		for(int i  = 0; i < result.length ; i++){
			if(result[i] == 0);
			if(result[i] == 1)
				res[0]++;
			if(result[i] == 2)
				res[1]++;
			if(result[i] == 3)
				res[2]++;
			if(result[i] == 4)
				res[3]++;
			if(result[i] == 5)
				res[4]++;
			if(result[i] == 6)
				res[5]++;
			if(result[i] == 7)
				res[6]++;
			if(result[i] == 8)
				res[7]++;
			if(result[i] == 9)
				res[8]++;
		}
		if(result[0] > 0){
			System.out.println(Arrays.toString(res));
			for (int i = 0; i < res.length; i++) {
			    	resCopy[i] = res[i];
			}
			Arrays.sort(resCopy);
			for (int i = 8; i >= 0; i--) {
		    	for(int j = 0; j < 9; j++){
		    		if(resCopy[i] == res[j] && resCopy[i] != 0){
		    			firstMove = put(j+1,j+1,1,pObject.getNextPlayer());
		    			if(firstMove == -1)
		    				break;
		    			checkMyMoves(false);
		    			if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 0){
		    				for(int k  = 0; k < result.length ; k++){
		    					result[k] = 0;
		    				}
		    				return true;
		    			}else
		    				resetLine(firstMove);
		    		}
		    	}
		    }
			for (int i = 0; i < 9; i++) {
				    if(res[i] > max){
				   		max = res[i];
				   }
			}
			int c = 0;
			for (int i = 0; i < 9; i++) {
		    	if(res[i] == max){
		    		maxIndexArr[c] = i;
		    		c++;
		    	}
			}
		    int n = rand.nextInt(c);
			put(maxIndexArr[n]+1,maxIndexArr[n]+1,1,pObject.getNextPlayer());
			for(int k  = 0; k < result.length ; k++){
				result[k] = 0;
			}
			return true;
		}
		else{
			for(int i  = 0; i < result.length ; i++){
				result[i] = 0;
			}
			return false;
		}
	}
	/**
	 * This method selects the best move from data which came from {@code defanceThree()} in @param result[]
	 * and decide to whether play or not.
	 */
	public boolean calculateResultsDefanceThree(){
		  int[] res = new int[9];
		  int[] maxIndexArr = new int[9];
		  Random rand = new Random();
		  int max = 0;
		   for(int i  = 0; i < result.length ; i++){
		   if(result[i] == 0);
		   if(result[i] == 1)
		    res[0]++;
		   if(result[i] == 2)
		    res[1]++;
		   if(result[i] == 3)
		    res[2]++;
		   if(result[i] == 4)
		    res[3]++;
		   if(result[i] == 5)
		    res[4]++;
		   if(result[i] == 6)
		    res[5]++;
		   if(result[i] == 7)
		    res[6]++;
		   if(result[i] == 8)
		    res[7]++;
		   if(result[i] == 9)
		    res[8]++;
		  }
		  if(result[0] > 0){
			  for (int i = 0; i < res.length; i++) {
				  if (res[i] > max) {
						  max = res[i];
				  }
			  }
			  int c = 0;
			  for (int i = 0; i < 9; i++) {
				  if(res[i] == max){
					  maxIndexArr[c] = i;
					  c++;
				  }
			  }
			  int n = rand.nextInt(c);
			  put(maxIndexArr[n]+1,maxIndexArr[n]+1,1,pObject.getNextPlayer());
			  System.out.println(Arrays.toString(res));
			  for(int i  = 0; i < result.length ; i++){
				  result[i] = 0;
			  }
			 return true;
		  }
		  else{
			  for(int i  = 0; i < result.length ; i++){
				  result[i] = 0;
			  }
			  return false;
		  }
	}
	/**
	 * This method looks three moves forward to calculate possible pair dangers from computer and 
	 * assign them to @param result[].
	 */
	public boolean cleverMoveThree(){
		String reverseNextPlayer;
		if(pObject.getNextPlayer().equals("X"))
			reverseNextPlayer = "O";
		else
			reverseNextPlayer = "X";
		for(int i = 0; i < 9; i++){
			firstMove = put(i+1,i+1,1,pObject.getNextPlayer());
			if(firstMove == -1)
				continue;
				for(int j = 0; j < 9; j++){
					secondMove = put(j+1,j+1,1,reverseNextPlayer);
					if(secondMove == -1)
						continue;
					for(int k = 0; k < 9; k++){
						thirdMove = put(k+1,k+1,1,pObject.getNextPlayer());
						if(thirdMove == -1)
							continue;
							for(int m = 0; m < 9; m++){
								fourthMove = put(m+1,m+1,1,reverseNextPlayer);
								if(fourthMove == -1)
									continue;
								for(int n = 0; n < 9; n++){
									fifthMove = put(n+1,n+1,1,pObject.getNextPlayer());
									if(fifthMove == -1)
										continue;
									checkMyMoves(false);
									if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 2){
									fillResult(fifthMove);
									}
									resetLine(fifthMove);
								}
								resetLine(fourthMove);
							}
						resetLine(thirdMove);
					}
					resetLine(secondMove);
				}
			resetLine(firstMove);
		}
		return calculateResultsMoveThree();
	}
	/**
	 * This method looks three moves forward to calculate possible pair dangers from user and 
	 * assign them to @param result[].
	 */
	public boolean defanceThree(){
		String reverseNextPlayer;
		if(pObject.getNextPlayer().equals("X"))
			reverseNextPlayer = "O";
		else
			reverseNextPlayer = "X";
		for(int i = 0; i < 9; i++){
			firstMove = put(i+1,i+1,1,pObject.getNextPlayer());
			if(firstMove == -1)
				continue;
				for(int j = 0; j < 9; j++){
					secondMove = put(j+1,j+1,1,reverseNextPlayer);
					if(secondMove == -1)
						continue;
					for(int k = 0; k < 9; k++){
						thirdMove = put(k+1,k+1,1,pObject.getNextPlayer());
						if(thirdMove == -1)
							continue;
							for(int m = 0; m < 9; m++){
								fourthMove = put(m+1,m+1,1,reverseNextPlayer);
								if(fourthMove == -1)
									continue;
								for(int n = 0; n < 9; n++){
									fifthMove = put(n+1,n+1,1,pObject.getNextPlayer());
									if(fifthMove == -1)
										continue;
									for(int z = 0; z < 9; z++){
										sixthMove = put(z+1,z+1,1,reverseNextPlayer);
										if(sixthMove == -1)
											continue;
										checkEnemyMoves(false);
										if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 2){
										fillResult(sixthMove);
										}
										resetLine(sixthMove);
									}
									resetLine(fifthMove);
								}
								resetLine(fourthMove);
							}
						resetLine(thirdMove);
					}
					resetLine(secondMove);
				}
			resetLine(firstMove);
		}
		return calculateResultsDefanceThree();
	}
	/**
	 * This method looks one move forward to calculate possible pair dangers from computer and decides 
	 * to make a move or not.
	 */
	public boolean cleverMoveOne(){
		for(int i = 0; i < 9; i++){
			firstMove = put(i+1,i+1,1,pObject.getNextPlayer());
			if(firstMove == -1)
				continue;
			checkMyMoves(false);
			if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 2){
				return true;
			}
			resetLine(firstMove);
		}
		return false;
	}
	/**
	 * This method looks one move forward to calculate possible pair dangers from user and 
	 * assign them to @param result[].
	 */
	public boolean defanseOne(){
		String reverseNextPlayer;
		if(pObject.getNextPlayer().equals("X"))
			reverseNextPlayer = "O";
		else
			reverseNextPlayer = "X";
		for(int i = 0; i < 9; i++){
			firstMove = put(i+1,i+1,1,pObject.getNextPlayer());
			if(firstMove == -1)
				continue;
			for(int j = 0; j < 9; j++){
				secondMove = put(j+1,j+1,1,reverseNextPlayer);
				if(secondMove == -1)
					continue;
				checkEnemyMoves(false);
				if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 2){
					fillResult(secondMove);
				}
				resetLine(secondMove);
 			}
			resetLine(firstMove);
		}
		return calculateResultDefanceOne();
	}
	/**
	 * This method looks two moves forward to calculate possible pair dangers from computer and 
	 * assign them to @param result[].
	 */
	public boolean cleverMoveTwo(){
		String reverseNextPlayer;
		if(pObject.getNextPlayer().equals("X"))
			reverseNextPlayer = "O";
		else
			reverseNextPlayer = "X";
		for(int i = 0; i < 9; i++){
			firstMove = put(i+1,i+1,1,pObject.getNextPlayer());
			if(firstMove == -1)
				continue;
			for(int j = 0; j < 9; j++){
				secondMove = put(j+1,j+1,1,reverseNextPlayer);
				if(secondMove == -1)
					continue;
				for(int k = 0; k < 9; k++){
					thirdMove = put(k+1,k+1,1,pObject.getNextPlayer());
					if(thirdMove == -1)
						continue;
					checkMyMoves(false);
					if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 2){
						fillResult(thirdMove);
					}
					resetLine(thirdMove);
				}
				resetLine(secondMove);
 			}
			resetLine(firstMove);
		}
		return calculateResultsMoveTwo();
	}
	/**
	 * This method looks two moves forward to calculate possible pair dangers from user and 
	 * assign them to @param result[].
	 */
	public boolean defanseTwo(){
		String reverseNextPlayer;
		if(pObject.getNextPlayer().equals("X"))
			reverseNextPlayer = "O";
		else
			reverseNextPlayer = "X";
		for(int i = 0; i < 9; i++){
			firstMove = put(i+1,i+1,1,pObject.getNextPlayer());
			if(firstMove == -1)
				continue;
				for(int j = 0; j < 9; j++){
					secondMove = put(j+1,j+1,1,reverseNextPlayer);
					if(secondMove == -1)
						continue;
					for(int k = 0; k < 9; k++){
						thirdMove = put(k+1,k+1,1,pObject.getNextPlayer());
						if(thirdMove == -1)
							continue;
							for(int m = 0; m < 9; m++){
								fourthMove = put(m+1,m+1,1,reverseNextPlayer);
								if(fourthMove == -1)
									continue;
								checkEnemyMoves(false);
								if((vertical[0]+vertical[1]+vertical[2]+horizontal[0]+horizontal[1]+horizontal[2]+cross[0]+cross[1]) == 2){
								fillResult(fourthMove);
								}
								resetLine(fourthMove);
							}
						resetLine(thirdMove);
					}
					resetLine(secondMove);
				}
			resetLine(firstMove);
		}
		return calculateResultDefanceTwo();
	}
	/**
	 * This method makes a move according to given parameters.
	 */
	private int put(int firstButton , int secondButton , int increasingInt , String nextPlayer){
		for(; firstButton <= secondButton; firstButton += increasingInt){
			switch(firstButton){
			case 1:
				if(pObject.getButton_1().getText().isEmpty()){
					pObject.setButton_1(nextPlayer);
					return 1;
				}
				break;
			case 2:
				if(pObject.getButton_2().getText().isEmpty()){
					pObject.setButton_2(nextPlayer);
					return 2;
				}
				break;
			case 3:
				if(pObject.getButton_3().getText().isEmpty()){
					pObject.setButton_3(nextPlayer);
					return 3;
				}
				break;
			case 4:
				if(pObject.getButton_4().getText().isEmpty()){
					pObject.setButton_4(nextPlayer);
					return 4;
				}
				break;
			case 5:
				if(pObject.getButton_5().getText().isEmpty()){
					pObject.setButton_5(nextPlayer);
					return 5;
				}
				break;
			case 6:
				if(pObject.getButton_6().getText().isEmpty()){
					pObject.setButton_6(nextPlayer);
					return 6;
				}
				break;
			case 7:
				if(pObject.getButton_7().getText().isEmpty()){
					pObject.setButton_7(nextPlayer);
					return 7;
				}
				break;
			case 8:
				if(pObject.getButton_8().getText().isEmpty()){
					pObject.setButton_8(nextPlayer);
					return 8;
				}
				break;
			case 9:
				if(pObject.getButton_9().getText().isEmpty()){
					pObject.setButton_9(nextPlayer);
					return 9;
				}
				break;
			}
		}
		return -1;
	}
	/**
	 * This method calculates if there are two moves in same line or cross and if the flag is true, method makes a move
	 * if the flag is false, it assigns result to @param vertical[], horizontal[] and cross[] parameters for computer.
	 */
	public boolean checkMyMoves(boolean flag){
		if((pObject.getButton_1().getText().equals(pObject.getButton_2().getText()) && pObject.getButton_2().getText().equals(pObject.getNextPlayer()) && pObject.getButton_3().getText().isEmpty()) ||
			(pObject.getButton_2().getText().equals(pObject.getButton_3().getText()) && pObject.getButton_2().getText().equals(pObject.getNextPlayer()) && pObject.getButton_1().getText().isEmpty())||
			(pObject.getButton_1().getText().equals(pObject.getButton_3().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_2().getText().isEmpty()))
		{
			vertical[0] = 1;
			if(flag){
				put(1,3,1,pObject.getNextPlayer());
				return true;
			}
		}
		else
			vertical[0] = 0;
		
		if((pObject.getButton_4().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_4().getText().equals(pObject.getNextPlayer()) && pObject.getButton_6().getText().isEmpty()) ||
			(pObject.getButton_5().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_5().getText().equals(pObject.getNextPlayer()) && pObject.getButton_4().getText().isEmpty())||
			(pObject.getButton_4().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_4().getText().equals(pObject.getNextPlayer()) && pObject.getButton_5().getText().isEmpty()))
		{
			vertical[1] = 1;
			if(flag){
				put(4,6,1,pObject.getNextPlayer());
				return true;
			}
		}
		else
			vertical[1] = 0;
		
		if((pObject.getButton_7().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_7().getText().equals(pObject.getNextPlayer()) && pObject.getButton_9().getText().isEmpty()) ||
			(pObject.getButton_8().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_8().getText().equals(pObject.getNextPlayer()) && pObject.getButton_7().getText().isEmpty())||
			(pObject.getButton_7().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_7().getText().equals(pObject.getNextPlayer()) && pObject.getButton_8().getText().isEmpty()))
		{
			vertical[2] = 1;
			if(flag){
				put(7,9,1,pObject.getNextPlayer());
				return true;
			}
		}
		else
			vertical[2] = 0;
		
		if((pObject.getButton_1().getText().equals(pObject.getButton_4().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_7().getText().isEmpty()) ||
			(pObject.getButton_4().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_4().getText().equals(pObject.getNextPlayer()) && pObject.getButton_1().getText().isEmpty())||
			(pObject.getButton_1().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_4().getText().isEmpty()))
		{
			horizontal[0] = 1;
			if(flag){
				put(1,7,3,pObject.getNextPlayer());
				return true;
			}
		}
		else
			horizontal[0] = 0;
		
		if((pObject.getButton_2().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_2().getText().equals(pObject.getNextPlayer()) && pObject.getButton_8().getText().isEmpty()) ||
			(pObject.getButton_5().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_5().getText().equals(pObject.getNextPlayer()) && pObject.getButton_2().getText().isEmpty())||
			(pObject.getButton_2().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_2().getText().equals(pObject.getNextPlayer()) && pObject.getButton_5().getText().isEmpty()))
		{
			horizontal[1] = 1;
			if(flag){
				put(2,8,3,pObject.getNextPlayer());
				return true;
			}
		}
		else
			horizontal[1] = 0;
		
		if((pObject.getButton_3().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_3().getText().equals(pObject.getNextPlayer()) && pObject.getButton_9().getText().isEmpty()) ||
			(pObject.getButton_6().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_6().getText().equals(pObject.getNextPlayer()) && pObject.getButton_3().getText().isEmpty())||
			(pObject.getButton_3().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_3().getText().equals(pObject.getNextPlayer()) && pObject.getButton_6().getText().isEmpty()))
		{
			horizontal[2] = 1;
			if(flag){
				put(3,9,3,pObject.getNextPlayer());
				return true;
			}
		}
		else
			horizontal[2] = 0;
		
		if((pObject.getButton_1().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_9().getText().isEmpty()) ||
			(pObject.getButton_5().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_5().getText().equals(pObject.getNextPlayer()) && pObject.getButton_1().getText().isEmpty())||
			(pObject.getButton_1().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_5().getText().isEmpty()))
		{
			cross[0] = 1;
			if(flag){
				put(1,9,4,pObject.getNextPlayer());
				return true;
			}
		}
		else
			cross[0] = 0;
		
		if((pObject.getButton_3().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_3().getText().equals(pObject.getNextPlayer()) && pObject.getButton_7().getText().isEmpty()) ||
			(pObject.getButton_5().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_5().getText().equals(pObject.getNextPlayer()) && pObject.getButton_3().getText().isEmpty())||
			(pObject.getButton_3().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_3().getText().equals(pObject.getNextPlayer()) && pObject.getButton_5().getText().isEmpty()))
		{
			cross[1] = 1;
			if(flag){
				put(3,7,2,pObject.getNextPlayer());
				return true;
			}
		}
		else
			cross[1] = 0;
		return false;
	}
	/**
	 * This method calculates if there are two moves in same line or cross and if the flag is true, method makes a move
	 * if the flag is false, it assigns result to @param vertical[], horizontal[] and cross[] parameters for user.
	 */
	public boolean checkEnemyMoves(boolean flag){
		String reverseNextPlayer;
		if(pObject.getNextPlayer().equals("X"))
			reverseNextPlayer = "O";
		else
			reverseNextPlayer = "X";
		
		if((pObject.getButton_1().getText().equals(pObject.getButton_2().getText()) && pObject.getButton_2().getText().equals(reverseNextPlayer) && pObject.getButton_3().getText().isEmpty()) ||
				(pObject.getButton_2().getText().equals(pObject.getButton_3().getText()) && pObject.getButton_2().getText().equals(reverseNextPlayer) && pObject.getButton_1().getText().isEmpty())||
				(pObject.getButton_1().getText().equals(pObject.getButton_3().getText()) && pObject.getButton_1().getText().equals(reverseNextPlayer) && pObject.getButton_2().getText().isEmpty()))
			{
				vertical[0] = 1;
				if(flag){
					put(1,3,1,pObject.getNextPlayer());
					return true;
				}
			}
			else
				vertical[0] = 0;
			
			if((pObject.getButton_4().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_4().getText().equals(reverseNextPlayer) && pObject.getButton_6().getText().isEmpty()) ||
				(pObject.getButton_5().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_5().getText().equals(reverseNextPlayer) && pObject.getButton_4().getText().isEmpty())||
				(pObject.getButton_4().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_4().getText().equals(reverseNextPlayer) && pObject.getButton_5().getText().isEmpty()))
			{
				vertical[1] = 1;
				if(flag){
					put(4,6,1,pObject.getNextPlayer());
					return true;
				}
			}
			else
				vertical[1] = 0;
			
			if((pObject.getButton_7().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_7().getText().equals(reverseNextPlayer) && pObject.getButton_9().getText().isEmpty()) ||
				(pObject.getButton_8().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_8().getText().equals(reverseNextPlayer) && pObject.getButton_7().getText().isEmpty())||
				(pObject.getButton_7().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_7().getText().equals(reverseNextPlayer) && pObject.getButton_8().getText().isEmpty()))
			{
				vertical[2] = 1;
				if(flag){
					put(7,9,1,pObject.getNextPlayer());
					return true;
				}
			}
			else
				vertical[2] = 0;
			
			if((pObject.getButton_1().getText().equals(pObject.getButton_4().getText()) && pObject.getButton_1().getText().equals(reverseNextPlayer) && pObject.getButton_7().getText().isEmpty()) ||
				(pObject.getButton_4().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_4().getText().equals(reverseNextPlayer) && pObject.getButton_1().getText().isEmpty())||
				(pObject.getButton_1().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_1().getText().equals(reverseNextPlayer) && pObject.getButton_4().getText().isEmpty()))
			{
				horizontal[0] = 1;
				if(flag){
					put(1,7,3,pObject.getNextPlayer());
					return true;
				}
			}
			else
				horizontal[0] = 0;
			
			if((pObject.getButton_2().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_2().getText().equals(reverseNextPlayer) && pObject.getButton_8().getText().isEmpty()) ||
				(pObject.getButton_5().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_5().getText().equals(reverseNextPlayer) && pObject.getButton_2().getText().isEmpty())||
				(pObject.getButton_2().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_2().getText().equals(reverseNextPlayer) && pObject.getButton_5().getText().isEmpty()))
			{
				horizontal[1] = 1;
				if(flag){
					put(2,8,3,pObject.getNextPlayer());
					return true;
				}
			}
			else
				horizontal[1] = 0;
			
			if((pObject.getButton_3().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_3().getText().equals(reverseNextPlayer) && pObject.getButton_9().getText().isEmpty()) ||
				(pObject.getButton_6().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_6().getText().equals(reverseNextPlayer) && pObject.getButton_3().getText().isEmpty())||
				(pObject.getButton_3().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_3().getText().equals(reverseNextPlayer) && pObject.getButton_6().getText().isEmpty()))
			{
				horizontal[2] = 1;
				if(flag){
					put(3,9,3,pObject.getNextPlayer());
					return true;
				}
			}
			else
				horizontal[2] = 0;
			
			if((pObject.getButton_1().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_1().getText().equals(reverseNextPlayer) && pObject.getButton_9().getText().isEmpty()) ||
				(pObject.getButton_5().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_5().getText().equals(reverseNextPlayer) && pObject.getButton_1().getText().isEmpty())||
				(pObject.getButton_1().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_1().getText().equals(reverseNextPlayer) && pObject.getButton_5().getText().isEmpty()))
			{
				cross[0] = 1;
				if(flag){
					put(1,9,4,pObject.getNextPlayer());
					return true;
				}
			}
			else
				cross[0] = 0;
			
			if((pObject.getButton_3().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_3().getText().equals(reverseNextPlayer) && pObject.getButton_7().getText().isEmpty()) ||
				(pObject.getButton_5().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_5().getText().equals(reverseNextPlayer) && pObject.getButton_3().getText().isEmpty())||
				(pObject.getButton_3().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_3().getText().equals(reverseNextPlayer) && pObject.getButton_5().getText().isEmpty()))
			{
				cross[1] = 1;
				if(flag){
					put(3,7,2,pObject.getNextPlayer());
					return true;
				}
			}
			else
				cross[1] = 0;
			return false;
	}
	/**
	 * This method calculates if there are two moves in same line or cross and if the flag is true, method makes a move
	 * and returns place which is made move by {@code put()}.
	 */
	public int checkMyForDefanse(){
		if((pObject.getButton_1().getText().equals(pObject.getButton_2().getText()) && pObject.getButton_2().getText().equals(pObject.getNextPlayer()) && pObject.getButton_3().getText().isEmpty()) ||
				(pObject.getButton_2().getText().equals(pObject.getButton_3().getText()) && pObject.getButton_2().getText().equals(pObject.getNextPlayer()) && pObject.getButton_1().getText().isEmpty())||
				(pObject.getButton_1().getText().equals(pObject.getButton_3().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_2().getText().isEmpty()))
			{
				return put(1,3,1,pObject.getNextPlayer());
			}
			if((pObject.getButton_4().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_4().getText().equals(pObject.getNextPlayer()) && pObject.getButton_6().getText().isEmpty()) ||
				(pObject.getButton_5().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_5().getText().equals(pObject.getNextPlayer()) && pObject.getButton_4().getText().isEmpty())||
				(pObject.getButton_4().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_4().getText().equals(pObject.getNextPlayer()) && pObject.getButton_5().getText().isEmpty()))
			{
				return put(4,6,1,pObject.getNextPlayer());
			}
			if((pObject.getButton_7().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_7().getText().equals(pObject.getNextPlayer()) && pObject.getButton_9().getText().isEmpty()) ||
				(pObject.getButton_8().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_8().getText().equals(pObject.getNextPlayer()) && pObject.getButton_7().getText().isEmpty())||
				(pObject.getButton_7().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_7().getText().equals(pObject.getNextPlayer()) && pObject.getButton_8().getText().isEmpty()))
			{
				return put(7,9,1,pObject.getNextPlayer());
			}
			if((pObject.getButton_1().getText().equals(pObject.getButton_4().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_7().getText().isEmpty()) ||
				(pObject.getButton_4().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_4().getText().equals(pObject.getNextPlayer()) && pObject.getButton_1().getText().isEmpty())||
				(pObject.getButton_1().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_4().getText().isEmpty()))
			{
				return put(1,7,3,pObject.getNextPlayer());
			}
			if((pObject.getButton_2().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_2().getText().equals(pObject.getNextPlayer()) && pObject.getButton_8().getText().isEmpty()) ||
				(pObject.getButton_5().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_5().getText().equals(pObject.getNextPlayer()) && pObject.getButton_2().getText().isEmpty())||
				(pObject.getButton_2().getText().equals(pObject.getButton_8().getText()) && pObject.getButton_2().getText().equals(pObject.getNextPlayer()) && pObject.getButton_5().getText().isEmpty()))
			{
				return put(2,8,3,pObject.getNextPlayer());
			}
			if((pObject.getButton_3().getText().equals(pObject.getButton_6().getText()) && pObject.getButton_3().getText().equals(pObject.getNextPlayer()) && pObject.getButton_9().getText().isEmpty()) ||
				(pObject.getButton_6().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_6().getText().equals(pObject.getNextPlayer()) && pObject.getButton_3().getText().isEmpty())||
				(pObject.getButton_3().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_3().getText().equals(pObject.getNextPlayer()) && pObject.getButton_6().getText().isEmpty()))
			{
				return put(3,9,3,pObject.getNextPlayer());
			}
			if((pObject.getButton_1().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_9().getText().isEmpty()) ||
				(pObject.getButton_5().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_5().getText().equals(pObject.getNextPlayer()) && pObject.getButton_1().getText().isEmpty())||
				(pObject.getButton_1().getText().equals(pObject.getButton_9().getText()) && pObject.getButton_1().getText().equals(pObject.getNextPlayer()) && pObject.getButton_5().getText().isEmpty()))
			{
				return put(1,9,4,pObject.getNextPlayer());
			}
			if((pObject.getButton_3().getText().equals(pObject.getButton_5().getText()) && pObject.getButton_3().getText().equals(pObject.getNextPlayer()) && pObject.getButton_7().getText().isEmpty()) ||
				(pObject.getButton_5().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_5().getText().equals(pObject.getNextPlayer()) && pObject.getButton_3().getText().isEmpty())||
				(pObject.getButton_3().getText().equals(pObject.getButton_7().getText()) && pObject.getButton_3().getText().equals(pObject.getNextPlayer()) && pObject.getButton_5().getText().isEmpty()))
			{
				return put(3,7,2,pObject.getNextPlayer());
			}
			return -1;
	}
	/**
	 * This method arranges methods {@code checkMyMoves(), checkEnemyMoves(), cleverMoveOne(), defanseOne(), 
	 * cleverMoveTwo(), defanseTwo(), cleverMoveThree(), defanceThree()} to create optimal move according to
	 * level of difficulty.
	 */
	public void play(){
		if(hardness.equals("Easy")){
			if(checkMyMoves(true))
				System.out.println("checkmymoves");
			else if(checkEnemyMoves(true))
				System.out.println("checkenemymoves");
			else
				put(1,9,1,pObject.getNextPlayer());
		}else if(hardness.equals("Medium")){
			if(checkMyMoves(true))
				System.out.println("checkmymoves");
			else if(checkEnemyMoves(true))
				System.out.println("checkenemymoves");
			else if(cleverMoveOne())
				System.out.println("cleverone");
			else if(defanseOne()){
				System.out.println("defanseone");
			}
			else
				put(1,9,1,pObject.getNextPlayer());
		}else if(hardness.equals("Hard")){
			if(checkMyMoves(true))
				System.out.println("checkmymoves");
			else if(checkEnemyMoves(true))
				System.out.println("checkenemymoves");
			else if(cleverMoveOne())
				System.out.println("cleverone");
			else if(defanseOne()){
				System.out.println("defanseone");
			}
			else if(cleverMoveTwo())
				System.out.println("clevertwo");
			else if(defanseTwo())
				System.out.println("defansetwo");
			else
				put(1,9,1,pObject.getNextPlayer());
		}else if(hardness.equals("Insane")){
			if(checkMyMoves(true))
				System.out.println("checkmymoves");
			else if(checkEnemyMoves(true))
				System.out.println("checkenemymoves");
			else if(cleverMoveOne())
				System.out.println("cleverone");
			else if(defanseOne()){
				System.out.println("defanseone");
			}
			else if(cleverMoveTwo())
				System.out.println("clevertwo");
			else if(defanseTwo())
				System.out.println("defansetwo");
			else if(cleverMoveThree()){
				System.out.println("cleverthree");
			}
			else if(defanceThree()){
				System.out.println("defansethree");
			}
			else
				put(1,9,1,pObject.getNextPlayer());
		}
	}
}
