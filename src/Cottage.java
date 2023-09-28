public class Cottage extends House{
    protected double lakeArea;

    public double getLakeArea() {
        return lakeArea;
    }

    public void setLakeArea(double lakeArea) {
        if (lakeArea <= 0)
        {
            System.out.println("Illegal value. ");
        }
        else
        {
            this.lakeArea = lakeArea;
        }
    }

    public Cottage(double listprice, double floorspace, int bedrooms, int bathrooms, double width, double depth, double lakeArea) {
        super(listprice, floorspace, bedrooms, bathrooms, width, depth);
        setLakeArea(lakeArea);
    }

    @Override
    public double calculateTax()
    {
        return 2000 + 2 * getLakeArea();
    }

    @Override
    public String toString() {
        return "Cottage: " + "\n" +
                super.toString() +
                "lake Area: " + getLakeArea() ;
    }
}
