public class Office extends MultiUnitBuilding {

    private OfficeTypes classification;


    protected enum OfficeTypes{
        SERVICE, SALES, INDUSTRIAL
    }
    public Office(double listprice, int unitBuilding, boolean hasElavator, double floorspace, OfficeTypes classification) {
        super(listprice, unitBuilding, hasElavator, floorspace);
        setClassification(classification);
    }

    private OfficeTypes getClassification(){
        return classification;
    }

    private void setClassification(OfficeTypes classification){
        this.classification = classification;
    }

    @Override
    public double calculateTax() {
        if(getClassification() == OfficeTypes.INDUSTRIAL){
            return (100 * getListprice()) * 0.85;
        }
        else if(getClassification() == OfficeTypes.SALES){
            return (100 * getListprice()) * 0.90;
        }
        else if(getClassification() == OfficeTypes.SERVICE){
            return (100 * getListprice()) * 0.95;
        }
        else{
            return (100 * getListprice()) * 1.85;
        }
    }

    @Override
    public String toString() {
        return "Office{" +
                super.toString() +
                ", Contains Elevator= " + isHasElavator() +
                ", The classification of this building is a " + getClassification() + " building." +
                '}';
    }
}
