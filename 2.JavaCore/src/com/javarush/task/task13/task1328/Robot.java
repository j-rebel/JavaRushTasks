package com.javarush.task.task13.task1328;

public class Robot extends AbstractRobot {
   /* private static int hitCount;
    private String name;*/

    public Robot(String name) {
        super(name);
        //this.name = name;
    }

    public String getName() {
        return super.getName();
    }

    public BodyPart attack() {
        return super.attack();
    }

    public BodyPart defense() {
        return super.defense();
    }
}
