package com.ridesharing;

public class Client {
	 public static void main(String[] args) {
	        // Authenticate user using Singleton
	        UserAuthentication userAuth = UserAuthentication.getInstance();
	        userAuth.authenticateUser("Sahi");

	        // Create vehicles using a simple factory method
	        Vehicle car = Vehicle.createVehicle("Car");
	        car.ride();

	        Vehicle bike = Vehicle.createVehicle("Scooty");
	        bike.ride();

	        // Create payment methods using a simple factory method
	        PaymentMethod creditCard = PaymentMethod.createPaymentMethod("Credit Card");
	        creditCard.pay(200);

	        PaymentMethod payTM = PaymentMethod.createPaymentMethod("PayTM");
	        payTM.pay(150);
	    }

}
