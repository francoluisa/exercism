public class Lasagna {
    
       public static int expectedMinutesInOven(){
        return 40;
    }

    public static int remainingMinutesInOven(int timeInOven){
        int expectedMinutesInOven = expectedMinutesInOven();
        int remainingMinutesInOven = (expectedMinutesInOven %  timeInOven);
        return remainingMinutesInOven;
    }

    public static int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers * 2;
    }

    public static int totalTimeInMinutes(int numberOfLayers, int timeInOven){
        return preparationTimeInMinutes(numberOfLayers) + timeInOven;
        
        }
}
