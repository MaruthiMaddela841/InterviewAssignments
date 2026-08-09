package in.ineuron.command;

import java.util.List;

public class Remote {

	private final int noOfButtons=4;
	private Command[] buttons=new Command[noOfButtons];
	private boolean[] buttonPressed=new boolean[noOfButtons];
	
	void setCommand(int index, Command cmd) {
		if(index>=0 && index<noOfButtons) {
			if(buttons[index]!=null) {
				buttons[index]=null;
			}
			buttons[index]=cmd;
			buttonPressed[index]=false;
		}
	}
	
	void pressButton(int index) {
		if(index>=0 && index<noOfButtons && buttons[index]!=null) {
			if(buttonPressed[index]) {
				buttons[index].undo();
				buttonPressed[index]=false;
			}else {
				buttons[index].execute();;
				buttonPressed[index]=true;
			}
		}else {
			System.out.println("Invalid Button");
		}
	}
	
}
