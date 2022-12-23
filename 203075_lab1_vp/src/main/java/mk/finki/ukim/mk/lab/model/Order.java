package mk.finki.ukim.mk.lab.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Order {
    public String balloonColor;
    public String balloonSize;
    // public String clientName;
    //public String clientAddress;

    @Id
    public Long orderId;

    public String getBalloonColor() {
        return balloonColor;
    }
    public String getBalloonSize() {
        return balloonSize;
    }


    public Long getOrderId() {return orderId;}

    public void setBalloonColor(String balloonColor) {this.balloonColor = balloonColor;}
    public void setBalloonSize(String balloonSize) {this.balloonSize = balloonSize;}
    public void setOrderId(Long orderId) {this.orderId = orderId;}
}
