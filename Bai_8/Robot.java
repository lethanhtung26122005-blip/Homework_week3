package Homework.Homework_week3.Bai_8;

public abstract class Robot {
    private int id;
    private String modelName;
    private int batteryLevel;
    public Robot(int id, String modelName) {
        this.id = id;
        this.modelName = modelName;
    }
    public void chargeBattery() {
        batteryLevel = 100;
    }
    public final void showIdentity() {
        System.out.println(id + " " + modelName);
    }
    public abstract void performMainTask();
}

