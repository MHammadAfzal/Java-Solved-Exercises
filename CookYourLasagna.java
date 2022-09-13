public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        // int minutes = 40;
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven(n)' method
    public int remainingMinutesInOven(int actualMin){
        int expectedMin = expectedMinutesInOven();
        return (expectedMin - actualMin);
    }
    // TODO: define the 'preparationTimeInMinutes(l)' method
    public int preparationTimeInMinutes(int layer){
        return (layer * 2);
    }
    // TODO: define the 'totalTimeInMinutes(l,n)' method
    public int totalTimeInMinutes(int layer, int actualTime){
        int layerTime = layer * 2;
        return (layerTime + actualTime);
    }
  public static void main(String[] a){
    Lasagna lasagna = new Lasagna();
    lasagna.expectedMinutesInOven(); // => 40
    lasagna.remainingMinutesInOven(30); // => 10
    lasagna.preparationTimeInMinutes(2); // => 4
    lasagna.totalTimeInMinutes(3, 20); // => 26
  }
}

/*
1. Define the expected oven time in minutes
2. Calculate the remaining oven time in minutes
3. Calculate the preparation time in minutes
4. Calculate the total working time in minutes
*/
