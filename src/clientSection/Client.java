package clientSection;

public class Client {
	private String clientName;
	private int clientPhoneNumber;
	private int clientProductOrdered;
	private String clientAddress;
	private String deliveryCarrier;
	private String clientStatus;
	private boolean clientCompleted;
	
	public String getClientStatus() {
		return clientStatus;
	}

	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}

	public boolean isClientCompleted() {
		return clientCompleted;
	}

	public void setClientCompleted(boolean clientCompleted) {
		this.clientCompleted = clientCompleted;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public String getClientAddress() {
		return clientAddress;
	}
	
	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}
	
	public String getDeliveryCarrier() {
		return deliveryCarrier;
	}

	public void setDeliveryCarrier(String deliveryCarrier) {
		this.deliveryCarrier = deliveryCarrier;
	}

	public int getClientPhoneNumber() {
		return clientPhoneNumber;
	}
	
	public void setClientPhoneNumber(int clientPhoneNumber) {
		this.clientPhoneNumber = clientPhoneNumber;
	}
	
	public int getClientProductOrdered() {
		return clientProductOrdered;
	}
	
	public void setClientProductOrdered(int clientProductOrdered) {
		this.clientProductOrdered = clientProductOrdered;
	}	
}
