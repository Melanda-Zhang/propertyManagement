public class House extends Property{


    protected double floorspace;
    protected int bedrooms;
    protected int bathrooms;
    protected double width;
    protected double depth;

    public House(double listprice, double floorspace, int bedrooms, int bathrooms, double width, double depth)
    {
        super(listprice);
        setFloorspace(floorspace);
        setBedrooms(bedrooms);
        setBathrooms(bathrooms);
        setWidth(width);
        setDepth(depth);
    }


    public double calculateTax()
    {
        return 1000 + 50 * getBathrooms() + 10 * getFloorspace();
    }

    public double getFloorspace() {
        return floorspace;
    }

    public void setFloorspace(double floorspace) {
        this.floorspace = floorspace;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        if(bedrooms <= 0)
        {
            System.out.println("Illegal value. ");
        }
        else
        {
            this.bedrooms = bedrooms;
        }
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        if(bathrooms <= 0)
        {
            System.out.println("Illegal value. ");
        }
        else
        {
            this.bathrooms = bathrooms;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Price: " + getListprice() + "\n" +
                "Floor Space: " + getFloorspace() + "\n" +
                "Number of Bedrooms: " + getBedrooms() + "\n" +
                "Number of Bathrooms: " + getBathrooms() + "\n" +
                "Width: " + getWidth() + "\n" +
                "Depth: " + getDepth() + "\n" ;
    }
}
