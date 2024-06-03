
class distance_converter {
    //converts a foot to a meter
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    };
    //converts a meter to a foot
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    };

//Main houses the loops that generate the tables, and run the required functions
    public static void main(String[] args) {
        double footstarter = 1.0;
        double meterstarter = 20.0;
        System.out.println("Feet     Meters     |     Meters     Feet \n -----------------------------------------------------------------");
        for (int i = 0; i < 10; i++){
            double currentfoot = footToMeter(footstarter);
            double currentmeter = meterToFoot(meterstarter);
            System.out.println(footstarter + "     "+ currentfoot+ "     |      " + meterstarter + "     " + currentmeter);
            footstarter++;
            meterstarter += 5.0;
        }
    }



};