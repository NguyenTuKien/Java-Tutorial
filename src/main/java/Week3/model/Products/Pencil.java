package Week3.model.Products;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pencil {
    private String name;
    private int price;
    private String brand;
    private String color;
    private String material;
    private String hardness;

    public Pencil() {}

    public Pencil(String name, int price, String brand, String color, String material, String hardness) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.hardness = hardness;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pencil) {
            Pencil pencil = (Pencil) obj;
            return name.equals(pencil.name) 
                && price == pencil.price 
                && brand.equals(pencil.brand) 
                && color.equals(pencil.color) 
                && material.equals(pencil.material) 
                && hardness.equals(pencil.hardness);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() 
            + price 
            + brand.hashCode() 
            + color.hashCode() 
            + material.hashCode() 
            + hardness.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s", name, price, brand, color, material, hardness);
    }
}
