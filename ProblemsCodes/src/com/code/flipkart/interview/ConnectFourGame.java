package com.code.flipkart.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ConnectFourGame {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ConnectFourGame fourGame = new ConnectFourGame();
		Scanner inp = new Scanner(System.in);
		int blockSize = 5;
		int numberBlockCells = inp.nextInt();
		List<BlockedCells> blockedCells = new ArrayList<BlockedCells>();
		for(int i=1;i<=numberBlockCells;i++) {
			BlockedCells cell = new BlockedCells();
			cell.row = inp.nextInt();
			cell.column = inp.nextInt();
			blockedCells.add(cell);
		}
		
		List<InputsA> inputsA = new ArrayList<InputsA>();
		int numberOfInputs = inp.nextInt();
		for(int i=0;i<numberOfInputs;i++) {
			InputsA input = new InputsA();
			input.player = inp.next().charAt(0);
			input.column = inp.nextInt();
		}
		getInput(inputsA);
		OutPut output = fourGame.run(blockSize, "HUMAN-COMPUTER",blockedCells, inputsA);
		if(output.result) {
			for(int i =1;i<=blockSize;i++) {
				for(int j = 1;j<=blockSize;j++) {
					System.out.print(output.block[i][j].playerType+" ");
				}
				System.out.println();
			}
			
			for(int i=0;i<output.winningLine.size();i++) {
				System.out.println(output.winningLine.get(i).row+" "+output.winningLine.get(i).column);
			}
			System.out.println();
			System.out.println(output.winnerPlayer);
		} else {
			System.out.println("Sorry No Output");
		}
		
		inp.close();
	}

	private static void getInput(List<InputsA> inputsA) {
		
		InputsA inp1 = new InputsA();
		inp1.player = 'A';
		inp1.column = 5;
		inputsA.add(inp1);
		
		InputsA inp2 = new InputsA();
		inp2.player = 'A';
		inp2.column = 3;
		inputsA.add(inp2);
		
		InputsA inp11 = new InputsA();
		inp11.player = 'A';
		inp11.column = 2;
		inputsA.add(inp11);
		
		InputsA inp21 = new InputsA();
		inp21.player = 'B';
		inp21.column = 4;
		//inputsA.add(inp21);
		
		InputsA inp12 = new InputsA();
		inp12.player = 'A';
		inp12.column = 2;
		inputsA.add(inp12);
		
		InputsA inp22 = new InputsA();
		inp22.player = 'B';
		inp22.column = 4;
		//inputsA.add(inp22);
		
		InputsA inp13 = new InputsA();
		inp13.player = 'A';
		inp13.column = 2;
		inputsA.add(inp13);
		
		InputsA inp23 = new InputsA();
		inp23.player = 'A';
		inp23.column = 2;
		inputsA.add(inp23);
	}
	
	public OutPut run(int blockSize,String gameType, List<BlockedCells> blockedCells, 
			List<InputsA> inputsA) {
		if(gameType.equals("HUMAN-HUMAN")) {
			return humanHumanGame(blockSize, blockedCells, inputsA);
		} else if(gameType.equals("HUMAN-COMPUTER")) {
			return humanComputerGame(blockSize, blockedCells, inputsA);
		} else {
			System.out.println("Please Enter correct game type...:p");
			return null;
		}
	}
	public OutPut humanHumanGame(int blockSize, List<BlockedCells> blockedCells, 
			List<InputsA> inputsA) {
		OutPut output = new OutPut(null);
		output.result = false;
		Block[][] block = new Block[blockSize+1][blockSize+1];
		processBlocked(blockSize, blockedCells, block);
		for(int i=0;i<inputsA.size();i++) {
			int insertRow = insertInput(blockSize,block,inputsA.get(i).column,inputsA.get(i).player);
			if(insertRow>0) {
				output = checkPlayerWon(blockSize,block,insertRow,
						inputsA.get(i).column,inputsA.get(i).player);
				if(output.result) {
					 // print output
					return output;
				}
			} else {
				System.out.println("Sorry column is full...:p");
				return output;
			}
		}
		return output;
		
		
	}

	private OutPut checkPlayerWon(int blockSize, Block[][] block, int row,
			int column,char player) {
		OutPut output = new OutPut(block);
		
		// column wise check
		output = checkColumnWise(output, blockSize, row, column, block, player);
		if(output.result) {
			return output;
		}
		
		// row check
		output = checkRowWise(output, blockSize, row, column, block, player);
		if(output.result) {
			return output;
		}
		
		// diagonal check left
		output = checkDiagonalLeftWise(output, blockSize, row, column, block, player);		
		if(output.result) {
			return output;
		}
		// diagonal check right
		output = checkDiagonalRightWise(output, blockSize, row, column, block, player);		
		if(output.result) {
			return output;
		}
		return output;
	}

	private OutPut checkColumnWise(OutPut output, int blockSize, int row, int column,Block[][] block, char player) {
		int i = row;
		int j = column;
		int cnt = 0;
		while(i>=1 && block[i][j].playerType == player) {
			i--;
			cnt++;
		}
		if(cnt>=4) {
			output.result = true;
			output.block = block;
			output.winnerPlayer = player;
			List<BlockedCells> winningCells = new ArrayList<BlockedCells>();
			i = row;
			while(i>=1 && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				i--;
			}
			output.winningLine = winningCells;
			return output;
		}
		
		i = row+1;
		while(i<=blockSize && block[i][j].playerType == player) {
			i++;
			cnt++;
		}
		if(cnt>=4) {
			output.result = true;
			output.block = block;
			output.winnerPlayer = player;
			List<BlockedCells> winningCells = new ArrayList<BlockedCells>();
			i = row;
			while(i>=1 && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				i--;
			}
			i= row+1;
			while(i<=blockSize && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				i++;
			}
			output.winningLine = winningCells;
			return output;
		}
		return output;
	}
	
	
	
	private OutPut checkRowWise(OutPut output, int blockSize, int row, int column,Block[][] block, char player) {
		int i = row;
		int j = column;
		int cnt = 0;
		while(j>=1 && block[i][j].playerType == player) {
			j--;
			cnt++;
		}
		if(cnt>=4) {
			output.result = true;
			output.block = block;
			output.winnerPlayer = player;
			List<BlockedCells> winningCells = new ArrayList<BlockedCells>();
			j = column;
			while(j>=1 && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				j--;
			}
			output.winningLine = winningCells;
			return output;
		}
		
		j = column+1;
		while(j<=blockSize && block[i][j].playerType == player) {
			j++;
			cnt++;
		}
		if(cnt>=4) {
			output.result = true;
			output.block = block;
			output.winnerPlayer = player;
			List<BlockedCells> winningCells = new ArrayList<BlockedCells>();
			j = column;
			while(j>=1 && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				j--;
			}
			j= column+1;
			while(j<=blockSize && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				j++;
			}
			output.winningLine = winningCells;
			return output;
		}
		return output;
	}
	
	private OutPut checkDiagonalLeftWise(OutPut output, int blockSize, int row, int column,Block[][] block, char player) {
		int i = row;
		int j= column;
		int cnt = 0;
		while(j>=1 && i>=1 && block[i][j].playerType == player) {
			j--;
			i--;
			cnt++;
		}
		if(cnt>=4) {
			output.result = true;
			output.block = block;
			output.winnerPlayer = player;
			List<BlockedCells> winningCells = new ArrayList<BlockedCells>();
			j = column;
			i = row;
			while(j>=1 && i>=1 && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				j--;
				i--;
			}
			output.winningLine = winningCells;
			return output;
		}
		
		j = column+1;
		i = row + 1;
		while(i<=blockSize && j<=blockSize && block[i][j].playerType == player) {
			j++;
			i++;
			cnt++;
		}
		if(cnt>=4) {
			output.result = true;
			output.block = block;
			output.winnerPlayer = player;
			List<BlockedCells> winningCells = new ArrayList<BlockedCells>();
			j = column;
			i = row;
			while(j>=1 && i>=1 && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				j--;
				i--;
			}
			j = column+1;
			i = row + 1;
			while(i<=blockSize && j<=blockSize && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				j++;
				i++;
			}
			output.winningLine = winningCells;
			return output;
		}
		return output;
	}
	
	private OutPut checkDiagonalRightWise(OutPut output, int blockSize, int row, int column,Block[][] block, char player) {
		int i = row;
		int j= column;
		int cnt = 0;
		while(j>=1 && i<=blockSize && block[i][j].playerType == player) {
			j--;
			i++;
			cnt++;
		}
		if(cnt>=4) {
			output.result = true;
			output.block = block;
			output.winnerPlayer = player;
			List<BlockedCells> winningCells = new ArrayList<BlockedCells>();
			j = column;
			i = row;
			while(j>=1 && i<=blockSize && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				j--;
				i++;
			}
			output.winningLine = winningCells;
			return output;
		}
		
		j = column+1;
		i = row - 1;
		while(i>=1 && j<=blockSize && block[i][j].playerType == player) {
			j++;
			i--;
			cnt++;
		}
		if(cnt>=4) {
			output.result = true;
			output.block = block;
			output.winnerPlayer = player;
			List<BlockedCells> winningCells = new ArrayList<BlockedCells>();
			j = column;
			i = row;
			while(j>=1 && i<=blockSize && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				j--;
				i++;
			}
			j = column+1;
			i = row - 1;
			while(i>=1 && j<=blockSize && block[i][j].playerType == player) {
				BlockedCells blockedCells = new BlockedCells();
				blockedCells.column = j;
				blockedCells.row = i;
				winningCells.add(blockedCells);
				j++;
				i--;
			}
			output.winningLine = winningCells;
			return output;
		}
		return output;
	}
	
	
	private int insertInput(int blockSize,Block[][] block, int column, char player) {
		int insertRow = 0;
		for(int i=1;i<=blockSize;i++) {
			if(block[i][column].playerType=='N') {
				insertRow = i;
			} else {
				break;
			}
		}
		if(insertRow>0) {
			block[insertRow][column].playerType = player;
		}
		return insertRow;
	}

	private void processBlocked(int blockSize, List<BlockedCells> blockedCells,
			Block[][] block) {
		for(int i=1;i<=blockSize;i++) {
			for(int j = 1;j<=blockSize;j++) {
				Block block1 = new Block();
				block1.maxCount = 0;
				block1.playerType = 'N';
				block[i][j] = block1;
			}
		}
		for(int i=0;i<blockedCells.size();i++) {
			if(blockedCells.get(i).row>blockSize || blockedCells.get(i).column>blockSize
					|| blockedCells.get(i).row<1 || blockedCells.get(i).column<1) {
				System.out.println("Sorry please enter column or row in range of blocksize");
			} else {
				block[blockedCells.get(i).row][blockedCells.get(i).column].playerType = 'O';
			}
		}
	}
	public OutPut humanComputerGame(int blockSize, List<BlockedCells> blockedCells, List<InputsA> inputsA) {
		OutPut output = new OutPut(null);
		output.result = false;
		Block[][] block = new Block[blockSize+1][blockSize+1];
		processBlocked(blockSize, blockedCells, block);
		boolean bl = true;
		int i = 0;
		while(i<inputsA.size()) {
			if(bl) {
			int insertRow = insertInput(blockSize,block,inputsA.get(i).column,inputsA.get(i).player);
			if(insertRow>0) {
				output = checkPlayerWon(blockSize,block,insertRow,
						inputsA.get(i).column,inputsA.get(i).player);
				if(output.result) {
					 // print output
					return output;
				}
			} else {
				System.out.println("Sorry column is full...:p");
				return output;
			}
			bl = false;
			i++;
			} else {
				int getRadomColumn = 0;
				for(int ii=1;ii<=blockSize;ii++) {
					if(block[1][ii].playerType=='N') {
						getRadomColumn = ii;
						break;
					}
				}
				if(getRadomColumn<1) {
					System.out.println("Not any column is empty");
				}
				
				int insertRow = insertInput(blockSize,block,getRadomColumn,'C');
				if(insertRow>0) {
					output = checkPlayerWon(blockSize,block,insertRow,
							getRadomColumn,'C');
					if(output.result) {
						 // print output
						return output;
					}
				} else {
					System.out.println("Sorry column is full...:p");
					return output;
				}
				bl = true;
				
			}
		}
		return output;
	}
	
	
	

}
class BlockedCells {
	int row;
	int column;
}
class InputsA {
	char player;
	int column;
}
class Block{
	char playerType;
	int maxCount;
}
class OutPut {
	boolean result;
	List<BlockedCells> winningLine;
	Block[][] block;
	char winnerPlayer;
	public OutPut(Block[][] block) {
		this.result = false;
		this.winningLine = new ArrayList<BlockedCells>();
		this.block = block;
	}
	
}

