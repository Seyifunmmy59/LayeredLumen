package dto;

public class OrderDetailDto {
    private String orderId;
    private String itemCode;
    private int orderQty;
    private double discount;
    private double total;

    public OrderDetailDto() {
    }

    public OrderDetailDto(String orderId, String itemCode, int orderQty, double discount, double total) {
        this.setOrderId(orderId);
        this.setItemCode(itemCode);
        this.setOrderQty(orderQty);
        this.setDiscount(discount);
        this.setTotal(total);
    }

    public OrderDetailDto(String orderId, String itemCode, int orderQty) {
        this.orderId = orderId;
        this.itemCode = itemCode;
        this.orderQty = orderQty;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" +
                "orderId='" + orderId + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", orderQty=" + orderQty +
                ", discount=" + discount +
                ", total=" + total +
                '}';
    }

}
