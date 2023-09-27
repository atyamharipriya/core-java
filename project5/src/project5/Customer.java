package project5;

public class Customer {
	    private String customerName;
	    private int customerId;
	    private String customerCity;
	    //default constructor
	    public Customer() {
	    	System.out.println("default");
	    }
	    //parameterised constructor
	    public Customer(String customerNaame,int customerId,String customerCity) {
	    	this.customerName=customerName;
	    	this.customerId=customerId;
	    	this.customerCity=customerCity;
	    	 }
	    //getters and setters
	    public String getCustomerName() {
	    	return customerName;
	    }
	    public void setCustomerName(String customerName) {
	    	this.customerName=customerName;
	    }
	    public int getCustomerId() {
	    	return customerId;
	    }
	    public void setCustomerId(int customerId) {
	    	this.customerId=customerId;
	    }
	    public String getCustomerCity() {
	    	return customerCity;
	    }
	    public void setCutomerCity(String customerCity) {
	    	this.customerCity=customerCity;
	    }
		@Override
		public String toString() {
			return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
					+ customerCity + "]";
		}
	   
}