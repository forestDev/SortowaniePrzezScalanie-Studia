
package forestDevPackage;



public class Car {
    public double year;
    public double modelIndex;
    public double colorIndex;

    public Car(double year, double modelIndex, double colorIndex) {
        this.year = year;
        this.modelIndex = modelIndex;
        this.colorIndex = colorIndex;
    }

    public double getYear(){
        return year;
    }

    public double getModelIndex(){
        return modelIndex;
    }

    public double getColorIndex(){
        return colorIndex;
    }    
}
