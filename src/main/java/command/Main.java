package command;

public class Main {
    public static void main(String[] args) {
        Room myRoom = new LivingRoom();

        myRoom.setCommand(new LightsOnCommand(new Light()));
        myRoom.executeCommand();

        myRoom.setCommand(()-> System.out.println("lowering curtains..."));
        myRoom.executeCommand();
    }
}
