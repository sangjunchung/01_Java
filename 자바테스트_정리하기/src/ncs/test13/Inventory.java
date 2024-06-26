package ncs.test13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Inventory {
	private String productName;
	private Date putDate;
	private Date getDate;
	private int putAmount;
	private int getAmount;
	private int inventoryAmount = putAmount - getAmount;

	public String getProductName() {
		return productName;
	}

	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}

	public void setGetAmount(int getAmount) throws AmountNotEnough {
		this.inventoryAmount = putAmount - getAmount;
		if (inventoryAmount < 0) {
			throw new AmountNotEnough("현재 재고가 부족합니다. 재고수량 확인하시기 바랍니다.");
		}
		this.getAmount = getAmount;
	}

	public Inventory() {

	}

	public Inventory(String productName, Date putDate, int putAmount) {
		this.productName = productName;
		this.putDate = putDate;
		this.putAmount = putAmount;
	}

	@Override
	public String toString() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일");
		inventoryAmount = putAmount - getAmount;

		return productName + "   \t" + sd.format(putDate.getTime()) + " " + putAmount + "개 입고, "
				+ ((getDate == null) ? "null" : sd.format(getDate.getTime())) + " " + getAmount + "개 출고, 재고 "
				+ inventoryAmount + "개";
	}
}
