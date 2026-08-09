package in.ineuron.adapter;

public class AdapterDeepDive {


    // =========================================================
    // EXAMPLE 1
    // Target interface
    // =========================================================

    interface Printer {

        void print(String text);
    }


    // Existing / legacy class
    static class LegacyPrinter {

        void printText(String text) {

            System.out.println(
                    "Legacy Printer: " + text
            );
        }
    }


    // Adapter
    static class PrinterAdapter
            implements Printer {

        private final LegacyPrinter
                legacyPrinter;


        PrinterAdapter(
                LegacyPrinter legacyPrinter
        ) {

            this.legacyPrinter =
                    legacyPrinter;
        }


        @Override
        public void print(
                String text
        ) {

            legacyPrinter.printText(text);
        }
    }


    // =========================================================
    // EXAMPLE 2
    // Different method names
    // =========================================================

    interface PaymentService {

        void pay(double amount);
    }


    static class OldPaymentGateway {

        void makePayment(
                double amount
        ) {

            System.out.println(
                    "Old Gateway: "
                            + amount
            );
        }
    }


    static class PaymentAdapter
            implements PaymentService {

        private final OldPaymentGateway
                gateway;


        PaymentAdapter(
                OldPaymentGateway gateway
        ) {

            this.gateway = gateway;
        }


        @Override
        public void pay(
                double amount
        ) {

            gateway.makePayment(amount);
        }
    }


    // =========================================================
    // EXAMPLE 3
    // Data conversion
    // =========================================================

    interface CelsiusSensor {

        double getTemperatureCelsius();
    }


    static class FahrenheitSensor {

        double getTemperatureFahrenheit() {

            return 98.6;
        }
    }


    static class TemperatureAdapter
            implements CelsiusSensor {

        private final FahrenheitSensor
                sensor;


        TemperatureAdapter(
                FahrenheitSensor sensor
        ) {

            this.sensor = sensor;
        }


        @Override
        public double getTemperatureCelsius() {

            double fahrenheit =
                    sensor.getTemperatureFahrenheit();


            return (fahrenheit - 32)
                    * 5 / 9;
        }
    }


    // =========================================================
    // EXAMPLE 4
    // Real-world notification example
    // =========================================================

    interface NotificationService {

        void send(
                String user,
                String message
        );
    }


    static class LegacySmsService {

        void sendSms(
                String phoneNumber,
                String text
        ) {

            System.out.println(
                    "SMS sent to "
                            + phoneNumber
                            + ": "
                            + text
            );
        }
    }


    static class SmsAdapter
            implements NotificationService {

        private final LegacySmsService
                smsService;


        SmsAdapter(
                LegacySmsService smsService
        ) {

            this.smsService =
                    smsService;
        }


        @Override
        public void send(
                String user,
                String message
        ) {

            String phoneNumber =
                    findPhoneNumber(user);

            smsService.sendSms(
                    phoneNumber,
                    message
            );
        }


        private String findPhoneNumber(
                String user
        ) {

            return "9999999999";
        }
    }


    // =========================================================
    // EXAMPLE 5
    // Multiple adapters
    // =========================================================

    interface PaymentProcessor {

        void pay(double amount);
    }


    static class PayPal {

        void sendPayment(
                double amount
        ) {

            System.out.println(
                    "PayPal: " + amount
            );
        }
    }


    static class Stripe {

        void charge(
                double amount
        ) {

            System.out.println(
                    "Stripe: " + amount
            );
        }
    }


    static class PayPalAdapter
            implements PaymentProcessor {

        private final PayPal paypal;


        PayPalAdapter(
                PayPal paypal
        ) {

            this.paypal = paypal;
        }


        @Override
        public void pay(
                double amount
        ) {

            paypal.sendPayment(amount);
        }
    }


    static class StripeAdapter
            implements PaymentProcessor {

        private final Stripe stripe;


        StripeAdapter(
                Stripe stripe
        ) {

            this.stripe = stripe;
        }


        @Override
        public void pay(
                double amount
        ) {

            stripe.charge(amount);
        }
    }


    // =========================================================
    // EXAMPLE 6
    // Adapter hiding a third-party library
    // =========================================================

    interface EmailService {

        void send(
                String to,
                String message
        );
    }


    static class ThirdPartyEmailLibrary {

        void sendEmail(
                String recipient,
                String body
        ) {

            System.out.println(
                    "Third-party email sent"
            );
        }
    }


    static class EmailAdapter
            implements EmailService {

        private final
        ThirdPartyEmailLibrary library;


        EmailAdapter(
                ThirdPartyEmailLibrary library
        ) {

            this.library = library;
        }


        @Override
        public void send(
                String to,
                String message
        ) {

            library.sendEmail(
                    to,
                    message
            );
        }
    }


    // =========================================================
    // EXAMPLE 7
    // Adapter + application
    // =========================================================

    static class OrderService {

        private final PaymentProcessor
                paymentProcessor;


        OrderService(
                PaymentProcessor paymentProcessor
        ) {

            this.paymentProcessor =
                    paymentProcessor;
        }


        void placeOrder(
                double amount
        ) {

            System.out.println(
                    "Creating order..."
            );

            paymentProcessor.pay(amount);

            System.out.println(
                    "Order completed"
            );
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


        LegacyPrinter legacyPrinter =
                new LegacyPrinter();


        Printer printer =
                new PrinterAdapter(
                        legacyPrinter
                );


        printer.print("Hello");


        // =====================================================
        // Example 2
        // =====================================================

        System.out.println(
                "\n--- Example 2 ---"
        );


        OldPaymentGateway gateway =
                new OldPaymentGateway();


        PaymentService paymentService =
                new PaymentAdapter(gateway);


        paymentService.pay(1000);


        // =====================================================
        // Example 3
        // =====================================================

        System.out.println(
                "\n--- Example 3 ---"
        );


        FahrenheitSensor sensor =
                new FahrenheitSensor();


        CelsiusSensor celsiusSensor =
                new TemperatureAdapter(
                        sensor
                );


        System.out.println(
                "Celsius: "
                        + celsiusSensor
                        .getTemperatureCelsius()
        );


        // =====================================================
        // Example 4
        // =====================================================

        System.out.println(
                "\n--- Example 4 ---"
        );


        NotificationService notification =
                new SmsAdapter(
                        new LegacySmsService()
                );


        notification.send(
                "John",
                "Your order is ready"
        );


        // =====================================================
        // Example 5
        // =====================================================

        System.out.println(
                "\n--- Example 5 ---"
        );


        PaymentProcessor paypal =
                new PayPalAdapter(
                        new PayPal()
                );


        PaymentProcessor stripe =
                new StripeAdapter(
                        new Stripe()
                );


        paypal.pay(500);

        stripe.pay(1000);


        // =====================================================
        // Example 6
        // =====================================================

        System.out.println(
                "\n--- Example 6 ---"
        );


        EmailService emailService =
                new EmailAdapter(
                        new ThirdPartyEmailLibrary()
                );


        emailService.send(
                "john@gmail.com",
                "Hello"
        );


        // =====================================================
        // Example 7
        // =====================================================

        System.out.println(
                "\n--- Example 7 ---"
        );


        OrderService orderService =
                new OrderService(
                        stripe
                );


        orderService.placeOrder(
                5000
        );
    }
}
