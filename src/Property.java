public abstract class Property {
    protected double listprice;

    public Property(double listprice)
    {
        setListprice(listprice);
    }

    public double getListprice() {
        return listprice;
    }

    public void setListprice(double listprice) {
        this.listprice = listprice;
    }

    public abstract double calculateTax();















}
