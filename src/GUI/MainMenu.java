package GUI;

public class MainMenu {
	private String clientName;
	private int clientPhoneNumber;
	private int clientProductOrdered;
	private String clientAddress;
	
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
