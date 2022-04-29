package com.dragonsoft.designpattern.action.command.command_2;

import org.junit.Test;

public class Client {

	@Test
	public void fun() {
		//创建命令的真正执行者
		LightCommandReceiver lightCommandReceiver = new LightCommandReceiver();
		//创建 开 命令
		ICommand lightOnCommand = new LightOnCommand(lightCommandReceiver);
		//创建 关 命令
		ICommand lightOffCommand = new LightOffCommand(lightCommandReceiver);
		//创建遥控器
		RemoteController remoteController = new RemoteController();
		//设置 灯 相关的命令
		remoteController.setCommand(0, lightOnCommand, lightOffCommand);
		//开灯
		remoteController.onCommandButtonWasPushed(0);
		//撤销开灯操作
		remoteController.undoCommandWasPushed();
		//关灯 
		remoteController.offCommandButtonWasPushed(0);
		//撤销关灯操作
		remoteController.undoCommandWasPushed();
		
		System.out.println("--------------------------------");
		TVCommandReceiver tvCommandReceiver = new TVCommandReceiver();
		ICommand tvOnCommand = new TVOnCommand(tvCommandReceiver);
		ICommand tvOffCommand = new TVOffCommand(tvCommandReceiver);
		//设置 TV 相关的命令
		remoteController.setCommand(1, tvOnCommand, tvOffCommand);
		//开TV
		remoteController.onCommandButtonWasPushed(1);
		//撤销开TV操作
		remoteController.undoCommandWasPushed();
		//关TV
		remoteController.offCommandButtonWasPushed(1);
		//撤销关TV操作
		remoteController.undoCommandWasPushed();
	}
}

