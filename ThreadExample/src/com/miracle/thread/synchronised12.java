package com.miracle.thread;
 class TicktetBooking{
	 {
		 int total_seats=10;
		  void bookSeat(int seats) {
			  if(total_seats>seats) {
				  System.out.println("seats booked successully");
				  total_seats=total_seats-seats;
				  System.out.println("sift lefts ");
				  
			  }
			 
		 }
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
