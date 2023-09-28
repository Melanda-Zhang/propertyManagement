public class Farm extends Land {


    protected String Crop;

    public String getCrop() {
        return Crop;
    }

    public void setCrop(String crop) {
        if(Crop.equals(""))
        {
            System.out.println("Illegal value. ");
        }
        else
        {
            Crop = crop;
        }
    }

    public Farm(double listprice, double area, String crop) {
        super(listprice, area);
        Crop = crop;
    }

    @Override
    public double calculateTax() {
        return 50 * getArea();
    }

    @Override
    public String toString() {
        return "Farm: " + "\n" +
                "Price: $ " + getListprice() + "\n" +
                "Area: " + getArea() + "cm" +
                "Type of Crop: " + getCrop();
    }

}