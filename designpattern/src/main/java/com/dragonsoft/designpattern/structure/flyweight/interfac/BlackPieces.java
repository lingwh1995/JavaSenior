package com.dragonsoft.designpattern.structure.flyweight.interfac;


/**
 * 具体的享元角色 白棋
 *
 */
public class BlackPieces implements ChessPieces{

	/**
	 * 内部状态
	 */
	protected String chess = "♞";
	
	/**
	 * 方法参数就是外部状态
	 */
	@Override
	public void setChessLocation(String[][] chessBoard,int x,int y) {
		chessBoard[x][y] = chess;
	}

}
