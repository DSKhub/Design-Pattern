package com.java.design.pattern.singleton;

public class DoubleCheckingsynchronizedTest {
	public static void main(String[] args) {
		
		/*
		 * double checked locking so that the synchronization happens
		 *  only during the first call and we limit this expensive 
		 *  operation to happen only once.
		 *  only used for mutithreaded environment..
		 */
		
		Hotel h1=Hotel.getInstance();
		Hotel h2=Hotel.getInstance();
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1==h2);
	}

}

class Hotel{
	private int hotelId;
	private String hotelName;
	private String hotelAddress;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress + "]";
	}
	private Hotel(int hotelId, String hotelName, String hotelAddress) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
	}
	private Hotel() {
		
	}
	
	private static Hotel currentInstance;
	
	public static Hotel getInstance(){
		if (currentInstance==null) {
			synchronized(Hotel.class){
				if(currentInstance==null){
					currentInstance=new Hotel(111, "Taj", "Mumbai");
				}
			}
			
		}
		
		return currentInstance;
	}
	
	
}
