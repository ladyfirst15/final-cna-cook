
package myProject_LSP;

public class CookQtyChecked extends AbstractEvent {

    private Long id;
    private Integer customerId;
    private String status;
    private Long orderId;

    private int qty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public int getQty() {
        return qty;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


}
