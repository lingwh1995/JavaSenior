package com.dragonsoft.designpattern.action.command.command_1;

public interface ICommand {
	
	//执行操作
	void execute();
	//撤销操作
	void undo();
}
