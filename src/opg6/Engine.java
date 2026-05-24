package opg6;

public class Engine {
    private boolean running;

    public void start(){
        running = true;
        System.out.println("Engine has started!");
    }

    public void stop(){
        running = false;
        System.out.println("Engine has stopped!");
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }



}
