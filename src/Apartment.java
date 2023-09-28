public class Apartment extends MultiUnitBuilding {



    protected int numberOfTenants;

    public Apartment(double listprice, int unitBuilding, boolean hasElavator, double floorspace, int numberOfTenants) {
        super(listprice, unitBuilding, hasElavator, floorspace);

        setNumberOfTenants(numberOfTenants);
    }



    public int getNumberOfTenants() {
        return numberOfTenants;
    }

    public void setNumberOfTenants(int numberOfTenants) {
        this.numberOfTenants = numberOfTenants;
    }


    @Override
    public double calculateTax(){
        return 35 * getFloorspace() * 3.5;
    }

    @Override
    public String toString() {
        return "Apartment: " + "\n" +
                "Number of tenants are: " + getNumberOfTenants() + "\n" +
                "Contains elevator: " + isHasElavator();
    }



}
