package sale_backend.sale_backend.domain;

import sale_backend.sale_backend.AbstractInfo;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "t_merchedise")
public class MerchandiseSale extends AbstractInfo {
    private BigDecimal price;
    @ManyToOne
    private MerchadiseGroup merchadiseGroup;
    @ManyToOne
    private MerchadiseTip merchadiseTip;
    private int maxSize;
    private int minSize;
    private int hasExpired;
    private Date insertTime;
    private String barcode;

    public BigDecimal getPrice() {
        if (price == null) {
            price = BigDecimal.ZERO;
        }
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public MerchadiseGroup getMerchadiseGroup() {
        return merchadiseGroup;
    }

    public void setMerchadiseGroup(MerchadiseGroup merchadiseGroup) {
        this.merchadiseGroup = merchadiseGroup;
    }

    public MerchadiseTip getMerchadiseTip() {
        return merchadiseTip;
    }

    public void setMerchadiseTip(MerchadiseTip merchadiseTip) {
        this.merchadiseTip = merchadiseTip;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getHasExpired() {
        return hasExpired;
    }

    public void setHasExpired(int hasExpired) {
        this.hasExpired = hasExpired;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
}
