package in.ineuron.factory;

import java.util.*;

public class FactoryDeepDive {
	
//Responsibilities become more separated.

//Factory is a creational design pattern used to encapsulate object creation. 
//Instead of the client directly creating concrete classes, it requests an object 
//through a factory. The factory decides which concrete implementation to instantiate 
//and usually returns it through an abstraction such as an interface. This reduces 
//coupling between the client and concrete implementations.
	
//Simple Factory centralizes creation in one method, Factory Method delegates creation
//to subclasses, and Abstract Factory creates families of related objects.
	
//Simple Factory
//    ↓
//One place decides which object to create
//
//
//Factory Method
//    ↓
//Subclass decides which object to create
//
//
//Abstract Factory
//    ↓
//Creates a family of related objects
	
//	    Simple Factory:
//		"Give me a Car."
//
//
//		Factory Method:
//		"Which subclass of Creator
//		should create the product?"
//
//
//		Abstract Factory:
//		"Give me the complete Windows UI family."

    // =========================================================
    // EXAMPLE 1
    // Without Factory
    // =========================================================

    interface Vehicle {

        void drive();
    }


    static class Car implements Vehicle {

        @Override
        public void drive() {

            System.out.println(
                    "Driving a car"
            );
        }
    }


    static class Bike implements Vehicle {

        @Override
        public void drive() {

            System.out.println(
                    "Riding a bike"
            );
        }
    }


    static class Truck implements Vehicle {

        @Override
        public void drive() {

            System.out.println(
                    "Driving a truck"
            );
        }
    }


    // =========================================================
    // EXAMPLE 2
    // Simple Factory
    // =========================================================

    static class VehicleFactory {

        static Vehicle createVehicle(String type) {

            if (type == null) {

                throw new IllegalArgumentException(
                        "Type cannot be null"
                );
            }


            switch (type.toUpperCase()) {

                case "CAR":

                    return new Car();


                case "BIKE":

                    return new Bike();


                case "TRUCK":

                    return new Truck();


                default:

                    throw new IllegalArgumentException(
                            "Unknown vehicle: "
                                    + type
                    );
            }
        }
    }


    // =========================================================
    // EXAMPLE 3
    // Factory returning interface
    // =========================================================

    static class VehicleService {

        void start(
                String type
        ) {

            Vehicle vehicle =
                    VehicleFactory
                            .createVehicle(type);

            vehicle.drive();
        }
    }


    // =========================================================
    // EXAMPLE 4
    // Factory Method
    // =========================================================
    
//NotificationCreator
//      ↑
//┌─────┼──────────┐
//↓     ↓          ↓
//Email  SMS       Push
//Creator Creator  Creator

    interface Notification {

        void send(String message);
    }


    static class EmailNotification
            implements Notification {

        @Override
        public void send(
                String message
        ) {

            System.out.println(
                    "Email: " + message
            );
        }
    }


    static class SmsNotification
            implements Notification {

        @Override
        public void send(
                String message
        ) {

            System.out.println(
                    "SMS: " + message
            );
        }
    }


    static class PushNotification
            implements Notification {

        @Override
        public void send(
                String message
        ) {

            System.out.println(
                    "Push: " + message
            );
        }
    }


    // Creator

    static abstract class NotificationCreator {

        abstract Notification createNotification();


        void notifyUser(
                String message
        ) {

            Notification notification =
                    createNotification();

            notification.send(message);
        }
    }


    // Concrete creators

    static class EmailNotificationCreator
            extends NotificationCreator {

        @Override
        Notification createNotification() {

            return new EmailNotification();
        }
    }


    static class SmsNotificationCreator
            extends NotificationCreator {

        @Override
        Notification createNotification() {

            return new SmsNotification();
        }
    }


    static class PushNotificationCreator
            extends NotificationCreator {

        @Override
        Notification createNotification() {

            return new PushNotification();
        }
    }


    // =========================================================
    // EXAMPLE 5
    // Abstract Factory
    // =========================================================
    
//    GUIFactory
//          |
//┌─────────┴─────────┐
//↓                   ↓
//WindowsFactory      MacFactory
//     |                   |
//┌────┴────┐         ┌────┴────┐
//↓         ↓         ↓         ↓
//Button   Checkbox    Button   Checkbox

    interface Button {

        void render();
    }


    interface Checkbox {

        void render();
    }


    // Windows family

    static class WindowsButton
            implements Button {

        @Override
        public void render() {

            System.out.println(
                    "Windows Button"
            );
        }
    }


    static class WindowsCheckbox
            implements Checkbox {

        @Override
        public void render() {

            System.out.println(
                    "Windows Checkbox"
            );
        }
    }


    // Mac family

    static class MacButton
            implements Button {

        @Override
        public void render() {

            System.out.println(
                    "Mac Button"
            );
        }
    }


    static class MacCheckbox
            implements Checkbox {

        @Override
        public void render() {

            System.out.println(
                    "Mac Checkbox"
            );
        }
    }


    interface GUIFactory {

        Button createButton();

        Checkbox createCheckbox();
    }


    static class WindowsFactory
            implements GUIFactory {

        @Override
        public Button createButton() {

            return new WindowsButton();
        }


        @Override
        public Checkbox createCheckbox() {

            return new WindowsCheckbox();
        }
    }


    static class MacFactory
            implements GUIFactory {

        @Override
        public Button createButton() {

            return new MacButton();
        }


        @Override
        public Checkbox createCheckbox() {

            return new MacCheckbox();
        }
    }


    // =========================================================
    // EXAMPLE 6
    // Real-world Payment Factory
    // =========================================================

    interface PaymentProcessor {

        void pay(
                double amount
        );
    }


    static class StripeProcessor
            implements PaymentProcessor {

        @Override
        public void pay(
                double amount
        ) {

            System.out.println(
                    "Stripe payment: "
                            + amount
            );
        }
    }


    static class PayPalProcessor
            implements PaymentProcessor {

        @Override
        public void pay(
                double amount
        ) {

            System.out.println(
                    "PayPal payment: "
                            + amount
            );
        }
    }


    static class RazorpayProcessor
            implements PaymentProcessor {

        @Override
        public void pay(
                double amount
        ) {

            System.out.println(
                    "Razorpay payment: "
                            + amount
            );
        }
    }


    static class PaymentFactory {

        static PaymentProcessor create(String provider) {

            switch (provider.toUpperCase()) {

                case "STRIPE":
                    return new StripeProcessor();

                case "PAYPAL":
                    return new PayPalProcessor();

                case "RAZORPAY":
                    return new RazorpayProcessor();

                default:
                    throw new IllegalArgumentException(
                            "Unsupported payment provider"
                    );
            }
        }
    }


    // =========================================================
    // EXAMPLE 7
    // Factory + dependency injection concept
    // =========================================================

    static class OrderService {

        private final PaymentProcessor processor;


        OrderService(
                PaymentProcessor processor
        ) {

            this.processor =
                    processor;
        }


        void placeOrder(
                double amount
        ) {

            System.out.println(
                    "Creating order..."
            );

            processor.pay(amount);

            System.out.println(
                    "Order completed"
            );
        }
    }


    // =========================================================
    // EXAMPLE 8
    // Factory using Map
    // =========================================================

    static class MapBasedPaymentFactory {

        private final Map<
                String,
                PaymentProcessor
                > processors;


        MapBasedPaymentFactory() {

            processors =
                    new HashMap<>();


            processors.put(
                    "STRIPE",
                    new StripeProcessor()
            );

            processors.put(
                    "PAYPAL",
                    new PayPalProcessor()
            );

            processors.put(
                    "RAZORPAY",
                    new RazorpayProcessor()
            );
        }


        PaymentProcessor create(
                String provider
        ) {

            PaymentProcessor processor =
                    processors.get(
                            provider.toUpperCase()
                    );


            if (processor == null) {

                throw new IllegalArgumentException(
                        "Unknown provider"
                );
            }


            return processor;
        }
    }


    // =========================================================
    // MAIN
    // =========================================================

    public static void main(
            String[] args
    ) {


        // =====================================================
        // Example 1
        // =====================================================

        System.out.println(
                "\n--- Example 1 ---"
        );


        Vehicle vehicle =
                new Car();

        vehicle.drive();


        // =====================================================
        // Example 2
        // =====================================================

        System.out.println(
                "\n--- Example 2 ---"
        );


        Vehicle car =
                VehicleFactory
                        .createVehicle("CAR");


        Vehicle bike =
                VehicleFactory
                        .createVehicle("BIKE");


        Vehicle truck =
                VehicleFactory
                        .createVehicle("TRUCK");


        car.drive();
        bike.drive();
        truck.drive();


        // =====================================================
        // Example 3
        // =====================================================

        System.out.println(
                "\n--- Example 3 ---"
        );


        VehicleService service =
                new VehicleService();


        service.start("CAR");
        service.start("BIKE");


        // =====================================================
        // Example 4
        // =====================================================

        System.out.println(
                "\n--- Example 4 ---"
        );


        NotificationCreator email =
                new EmailNotificationCreator();


        NotificationCreator sms =
                new SmsNotificationCreator();


        NotificationCreator push =
                new PushNotificationCreator();


        email.notifyUser(
                "Hello by Email"
        );

        sms.notifyUser(
                "Hello by SMS"
        );

        push.notifyUser(
                "Hello by Push"
        );


        // =====================================================
        // Example 5
        // =====================================================

        System.out.println(
                "\n--- Example 5 ---"
        );


        GUIFactory windowsFactory =
                new WindowsFactory();


        Button windowsButton =
                windowsFactory.createButton();


        Checkbox windowsCheckbox =
                windowsFactory.createCheckbox();


        windowsButton.render();

        windowsCheckbox.render();


        GUIFactory macFactory =
                new MacFactory();


        Button macButton =
                macFactory.createButton();


        Checkbox macCheckbox =
                macFactory.createCheckbox();


        macButton.render();

        macCheckbox.render();


        // =====================================================
        // Example 6
        // =====================================================

        System.out.println(
                "\n--- Example 6 ---"
        );


        PaymentProcessor stripe =
                PaymentFactory.create(
                        "STRIPE"
                );


        PaymentProcessor paypal =
                PaymentFactory.create(
                        "PAYPAL"
                );


        PaymentProcessor razorpay =
                PaymentFactory.create(
                        "RAZORPAY"
                );


        stripe.pay(1000);

        paypal.pay(2000);

        razorpay.pay(3000);


        // =====================================================
        // Example 7
        // =====================================================

        System.out.println(
                "\n--- Example 7 ---"
        );


        OrderService order =
                new OrderService(
                        stripe
                );


        order.placeOrder(
                5000
        );


        // =====================================================
        // Example 8
        // =====================================================

        System.out.println(
                "\n--- Example 8 ---"
        );


        MapBasedPaymentFactory factory =
                new MapBasedPaymentFactory();


        PaymentProcessor processor =
                factory.create(
                        "PAYPAL"
                );


        processor.pay(
                7500
        );
    }
}
