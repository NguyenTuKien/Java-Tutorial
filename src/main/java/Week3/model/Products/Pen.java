package Week3.model.Products;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pen {
    private String name;
    private int price;
    private String brand;
    private String color;
    private String material;
    private String ink;
    private String smoothness;

    public Pen() {}

    public Pen(String name, int price, String brand, String color, String material, String ink, String smoothness) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.ink = ink;
        this.smoothness = smoothness;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pen) {
            Pen pen = (Pen) obj;
            return name.equals(pen.name) 
                && price == pen.price 
                && brand.equals(pen.brand)
                && color.equals(pen.color) 
                && material.equals(pen.material) 
                && ink.equals(pen.ink) 
                && smoothness.equals(pen.smoothness);
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
            + ink.hashCode() 
            + smoothness.hashCode();
    }

    @Override
    public String toString() {
        return String.format("%-15s | %-15s | %-15s | %-15s | %-15s | %-15s | %-15s", name, price, brand, color, material, ink, smoothness);
    }
}
