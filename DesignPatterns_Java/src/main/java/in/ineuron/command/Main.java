package in.ineuron.command;

public class Main {

	public static void main(String[] args) {
		
		//Command = turn an action/request into an object.
		Light livingRoomLight= new Light();
		Fan ceilingFan=new Fan();
		Heater heater=new Heater();
		
		Remote remote=new Remote();
		remote.setCommand(0, new LightCommand(livingRoomLight));
		remote.setCommand(1, new FanCommand(ceilingFan));
		remote.setCommand(2, new HeaterCommand(heater));
		
		remote.pressButton(0);
		remote.pressButton(0);
		System.out.println();
		remote.pressButton(1);
		remote.pressButton(2);
		System.out.println();
		remote.pressButton(1);
		remote.pressButton(2);
	}

}
