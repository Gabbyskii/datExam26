package opg6;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model) {
        this.model = model;
        this.engine = new Engine();
    }

    public void start(){
        if (engine.isRunning()){
            throw new IllegalStateException("Error: "+ this.model +" is already running!!" );
        } else {
            engine.start();
            System.out.println("Car: " + this.model + " has started!");
        }
    }

    public void stop(){
        if (!engine.isRunning()){
           throw new IllegalStateException("Error: "+ this.model +" has already stopped!!" );
        } else {
            engine.stop();
            System.out.println("Car: "+ this.model +" has stopped!" );
        }
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return  model;
    }

}
