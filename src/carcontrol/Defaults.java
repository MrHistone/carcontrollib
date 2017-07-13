package carcontrol;

import java.awt.Color;
import java.io.Serializable;

public class Defaults {

    public static final Color MAINBACKGROUNDCOLOR = new Color(0, 100, 100);
    public static final Color FIELDBACKGROUNDCOLOR = new Color(102, 153, 255);
    public static final Color BUTTONBACKGROUNDCOLOR = new Color(102, 153, 255);
    public static final String TITLE = "Remote Controlled Car";

    public enum Momentum {
        FORWARD, BACKWARD, RIGHT, LEFT, STOP
    }

    public enum CarAction {
        FORWARD, BACKWARD, RIGHT, LEFT, STOP, HORN
    }

    /**
     * Class used to send coordinates to the connected car.
     */
    public static class Coordinates implements Serializable {

        private int xCoordinate = 0;
        private int yCoordinate = 0;
        private double maxMovement = 0;
        private double xPercentage = 0;
        private double yPercentage = 0;
        private String message;
        private String xCoordinateString;
        private String yCoordinateString;

        /**
         * Constructor used to create a new instance with all necessary instance
         * variables.
         *
         * @param xCoordinate int X Coordinate
         * @param yCoordinate int Y Coordinate
         * @param maxMovement double Maximum movement
         * @param message String Message
         */
        public Coordinates(int xCoordinate, int yCoordinate, double maxMovement, String message) {
            this.xCoordinate = xCoordinate;
            this.yCoordinate = yCoordinate;
            this.maxMovement = maxMovement;
            this.message = message;
        }

        /**
         * Default constructor.
         */
        public Coordinates() {

        }

        public int getXCoordinate() {
            return xCoordinate;
        }

        public int getYCoordinate() {
            return yCoordinate;
        }

        public double getMaxMovement() {
            return maxMovement;
        }

        public double getXPercentage() {
            if (maxMovement > 0) {
                xPercentage = xCoordinate / (maxMovement / 100);
            } else {
                xPercentage = 0;
            }
            return xPercentage;
        }

        public double getYPercentage() {
            if (maxMovement > 0) {
                yPercentage = yCoordinate / (maxMovement / 100);
            } else {
                yPercentage = 0;
            }
            return yPercentage;
        }

        public void setXCoordinate(int xCoordinate) {
            this.xCoordinate = xCoordinate;
        }

        public void setYCoordinate(int yCoordinate) {
            this.yCoordinate = yCoordinate;
        }

        public void setMaxMovement(int maxMovement) {
            this.maxMovement = maxMovement;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getxCoordinateString() {
            return xCoordinateString;
        }

        public void setxCoordinateString(String xCoordinateString) {
            this.xCoordinateString = xCoordinateString;
        }

        public String getyCoordinateString() {
            return yCoordinateString;
        }

        public void setyCoordinateString(String yCoordinateString) {
            this.yCoordinateString = yCoordinateString;
        }

    }

    public static class CarMotion implements Serializable {

        /**
         *
         * @param angle
         * @param verticalMovement
         * @param soundHorn
         * @param lights
         */
        public CarMotion(int angle, int verticalMovement, boolean soundHorn, boolean lights) {
            this.angle = angle;
            this.lights = lights;
            this.soundHorn = soundHorn;
            this.verticalMovement = verticalMovement;
        }

        private int angle;
        private int verticalMovement;
        // For the future perhaps
        private boolean soundHorn;
        private boolean lights;

        public int getAngle() {
            return angle;
        }

        public void setAngle(int angle) {
            this.angle = angle;
        }

        public int getVerticalMovement() {
            return verticalMovement;
        }

        public void setVerticalMovement(int verticalMovement) {
            this.verticalMovement = verticalMovement;
        }

        public boolean isSoundHorn() {
            return soundHorn;
        }

        public void setSoundHorn(boolean soundHorn) {
            this.soundHorn = soundHorn;
        }

        public boolean isLights() {
            return lights;
        }

        public void setLights(boolean lights) {
            this.lights = lights;
        }

    }

    public static class CarStatus implements Serializable {

        private boolean forward = false;
        private boolean backward = false;
        private boolean left = false;
        private boolean right = false;
        private boolean lights = false;
        private boolean horn = false;

        public boolean isForward() {
            return forward;
        }

        public void setForward(boolean forward) {
            this.forward = forward;
        }

        public boolean isBackward() {
            return backward;
        }

        public void setBackward(boolean backward) {
            this.backward = backward;
        }

        public boolean isLeft() {
            return left;
        }

        public void setLeft(boolean left) {
            this.left = left;
        }

        public boolean isRight() {
            return right;
        }

        public void setRight(boolean right) {
            this.right = right;
        }

        public boolean isLights() {
            return lights;
        }

        public void setLights(boolean lights) {
            this.lights = lights;
        }

        public boolean isHorn() {
            return horn;
        }

        public void setHorn(boolean horn) {
            this.horn = horn;
        }

        
        
        
    }

}
