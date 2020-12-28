package data;

public class ProductID {
    private final String ProductID;
    public ProductID(String code) {
        this.ProductID = code; }
    public String getPersonalID() {
        return ProductID; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductID pID = (ProductID) o;
        return ProductID.equals(pID.ProductID);
    }
    @Override
    public int hashCode() { return ProductID.hashCode(); }
    @Override
    public String toString() {
        return "ProductID{" + "product code='" + ProductID + '\'' + '}';
    }

}
