package command;

public class LowerCurtainsCommand implements Command {
    private Curtains curtains;
    public LowerCurtainsCommand(Curtains curtains){
        this.curtains = curtains;

    }

    @Override
    public void execute(){
        curtains.lowerCurtains();
    }
}
