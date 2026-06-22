public class Lasagna {
    public int expectedTime = 40;
    public int totalTime;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return this.expectedTime;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualTime){
        return this.expectedTime -  actualTime;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numOfLayers){
        expectedTime = numOfLayers * 2;
        return this.expectedTime;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numOfLayers, int cookingTime){
        this.totalTime = preparationTimeInMinutes(numOfLayers) + cookingTime;
        return this.totalTime;
    }
}
