package uz.pdp.spring2lesson2task2andlesson3task1.constants;

public enum OrderStatus {

    Cancelled("Buyurtma bekor qilindi"),
    Delivered("Buyurtma yetkazib berildi"),
    Problem("Buyurtmada muammo"),
    Processing("Buyurtmani qadoqlash"),
    Returned("Buyurtma qaytarildi");

    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
