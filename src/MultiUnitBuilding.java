//Multiunitbuilding is going to inherit from the property class
public abstract class  MultiUnitBuilding extends Property {


    /***
     * Attributes
     *
     * number of units in the building
     * has an elavator
     * floorspace (16.7)
     * listingprice <-
     */

    protected int unitBuilding;
    protected boolean hasElavator;
    protected double floorspace;


    public MultiUnitBuilding(double listprice, int unitBuilding, boolean hasElavator, double floorspace) {
        super(listprice);
        setHaveElavator(hasElavator);
        setFloorspace(floorspace);
        setUnitBuilding(unitBuilding);
    }



    public int getUnitBuilding() {
        return unitBuilding;
    }


    public void setUnitBuilding(int unitBuilding) {
        if(unitBuilding <= 0)
        {
            System.out.println("Illegal value.");
        }
        else
        {
            this.unitBuilding = unitBuilding;
        }
    }

    public boolean isHasElavator() {
        return hasElavator;
    }

    public void setHaveElavator(boolean hasElavator) {
        this.hasElavator = hasElavator;
    }

    public double getFloorspace() {
        return floorspace;
    }

    public void setFloorspace(double floorspace) {
        this.floorspace = floorspace;
    }


    @Override
    public String toString() {
        return "Asking Price = $ " + listprice + "," + 
                "\n" + "Floor space = " + floorspace + "square mater Building," +
                "\n" + "The number of Unites are/is " + unitBuilding;
    }
}
