public class Land extends Property{
    protected double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if(area <= 0)
        {
            System.out.println("Illegal value. ");
        }
        else
        {
            this.area = area;
        }
    }
    public Land(double listprice, double area) {
        super(listprice);
        setArea(area);
    }


    @Override
    public double calculateTax() {
        return 100 * getArea();
    }

    @Override
    public String toString() {
        return "Land: " + "\n" +
                "Price: $ " + getListprice() + "\n" +
                "Area: " + getArea() + "cm";
    }
}
