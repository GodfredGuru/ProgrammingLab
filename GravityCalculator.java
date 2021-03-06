class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
//        System.out.println("The object's position after " + fallingTime +
//                " seconds is " + finalPosition + " m.");

        /** BELOW IS THE OUTPUT OF THE UNMODIFIED CODE.
         * The object's position after 10.0 seconds is 0.0 m.
         */

        /**
         * BELOW IS THE MODIFIED PROGRAM
         */
        double Xt = (gravity*Math.pow(fallingTime,2)/2)+initialVelocity*fallingTime+finalPosition;
        System.out.println(Xt+"m");

    }
}

