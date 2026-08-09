package in.ineuron.decorator;

public class DecoratorDeepDive {


    // =========================================================
    // EXAMPLE 1
    // Basic Decorator
    // =========================================================

    interface Coffee {

        double cost();

        String description();
    }


    static class SimpleCoffee
            implements Coffee {

        @Override
        public double cost() {

            return 50;
        }


        @Override
        public String description() {

            return "Simple Coffee";
        }
    }


    // Base Decorator
    static abstract class CoffeeDecorator
            implements Coffee {

        protected final Coffee coffee;


        CoffeeDecorator(
                Coffee coffee
        ) {

            this.coffee = coffee;
        }
    }


    static class MilkDecorator
            extends CoffeeDecorator {

        MilkDecorator(
                Coffee coffee
        ) {

            super(coffee);
        }


        @Override
        public double cost() {

            return coffee.cost() + 20;
        }


        @Override
        public String description() {

            return coffee.description()
                    + " + Milk";
        }
    }


    static class SugarDecorator
            extends CoffeeDecorator {

        SugarDecorator(
                Coffee coffee
        ) {

            super(coffee);
        }


        @Override
        public double cost() {

            return coffee.cost() + 10;
        }


        @Override
        public String description() {

            return coffee.description()
                    + " + Sugar";
        }
    }


    static class ChocolateDecorator
            extends CoffeeDecorator {

        ChocolateDecorator(
                Coffee coffee
        ) {

            super(coffee);
        }


        @Override
        public double cost() {

            return coffee.cost() + 30;
        }


        @Override
        public String description() {

            return coffee.description()
                    + " + Chocolate";
        }
    }


    // =========================================================
    // EXAMPLE 2
    // Multiple decorators
    // =========================================================

    static void exampleMultipleDecorators() {

        Coffee coffee =
                new SimpleCoffee();


        coffee =
                new MilkDecorator(
                        coffee
                );


        coffee =
                new SugarDecorator(
                        coffee
                );


        coffee =
                new ChocolateDecorator(
                        coffee
                );


        System.out.println(
                coffee.description()
        );


        System.out.println(
                "Cost: "
                        + coffee.cost()
        );
    }


    // =========================================================
    // EXAMPLE 3
    // Logging Decorator
    // =========================================================

    interface PaymentService {

        void pay(double amount);
    }


    static class RealPaymentService
            implements PaymentService {

        @Override
        public void pay(
                double amount
        ) {

            System.out.println(
                    "Processing payment: "
                            + amount
            );
        }
    }


    static class LoggingPaymentDecorator
            implements PaymentService {

        private final PaymentService
                paymentService;


        LoggingPaymentDecorator(
                PaymentService paymentService
        ) {

            this.paymentService =
                    paymentService;
        }


        @Override
        public void pay(
                double amount
        ) {

            System.out.println(
                    "LOG: Payment started"
            );


            paymentService.pay(amount);


            System.out.println(
                    "LOG: Payment completed"
            );
        }
    }


    // =========================================================
    // EXAMPLE 4
    // Validation Decorator
    // =========================================================

    static class ValidationPaymentDecorator
            implements PaymentService {

        private final PaymentService
                paymentService;


        ValidationPaymentDecorator(
                PaymentService paymentService
        ) {

            this.paymentService =
                    paymentService;
        }


        @Override
        public void pay(
                double amount
        ) {

            if (amount <= 0) {

                throw new IllegalArgumentException(
                        "Amount must be positive"
                );
            }


            paymentService.pay(amount);
        }
    }


    // =========================================================
    // EXAMPLE 5
    // Multiple behavior decorators
    // =========================================================

    static void examplePaymentDecorators() {

        PaymentService payment =
                new RealPaymentService();


        payment =
                new ValidationPaymentDecorator(
                        payment
                );


        payment =
                new LoggingPaymentDecorator(
                        payment
                );


        payment.pay(1000);
    }


    // =========================================================
    // EXAMPLE 6
    // Notification Decorator
    // =========================================================

    interface NotificationService {

        void send(String message);
    }


    static class EmailNotification
            implements NotificationService {

        @Override
        public void send(
                String message
        ) {

            System.out.println(
                    "Email sent: "
                            + message
            );
        }
    }


    static class SmsNotificationDecorator
            implements NotificationService {

        private final NotificationService
                notificationService;


        SmsNotificationDecorator(
                NotificationService notificationService
        ) {

            this.notificationService =
                    notificationService;
        }


        @Override
        public void send(
                String message
        ) {

            notificationService.send(
                    message
            );


            System.out.println(
                    "SMS sent: "
                            + message
            );
        }
    }


    static class PushNotificationDecorator
            implements NotificationService {

        private final NotificationService
                notificationService;


        PushNotificationDecorator(
                NotificationService notificationService
        ) {

            this.notificationService =
                    notificationService;
        }


        @Override
        public void send(
                String message
        ) {

            notificationService.send(
                    message
            );


            System.out.println(
                    "Push notification sent: "
                            + message
            );
        }
    }


    // =========================================================
    // EXAMPLE 7
    // Decorator chain
    // =========================================================

    static void exampleNotificationChain() {

        NotificationService service =
                new EmailNotification();


        service =
                new SmsNotificationDecorator(
                        service
                );


        service =
                new PushNotificationDecorator(
                        service
                );


        service.send(
                "Order shipped"
        );
    }


    // =========================================================
    // EXAMPLE 8
    // Compression + Encryption
    // =========================================================

    interface DataSource {

        void write(String data);

        String read();
    }


    static class FileDataSource
            implements DataSource {

        private String data;


        @Override
        public void write(
                String data
        ) {

            this.data = data;

            System.out.println(
                    "Writing to file: "
                            + data
            );
        }


        @Override
        public String read() {

            return data;
        }
    }


    static class CompressionDecorator
            implements DataSource {

        private final DataSource
                dataSource;


        CompressionDecorator(
                DataSource dataSource
        ) {

            this.dataSource =
                    dataSource;
        }


        @Override
        public void write(
                String data
        ) {

            String compressed =
                    "[COMPRESSED]"
                            + data;

            dataSource.write(
                    compressed
            );
        }


        @Override
        public String read() {

            String data =
                    dataSource.read();

            return data.replace(
                    "[COMPRESSED]",
                    ""
            );
        }
    }


    static class EncryptionDecorator
            implements DataSource {

        private final DataSource
                dataSource;


        EncryptionDecorator(
                DataSource dataSource
        ) {

            this.dataSource =
                    dataSource;
        }


        @Override
        public void write(
                String data
        ) {

            String encrypted =
                    "[ENCRYPTED]"
                            + data;

            dataSource.write(
                    encrypted
            );
        }


        @Override
        public String read() {

            String data =
                    dataSource.read();

            return data.replace(
                    "[ENCRYPTED]",
                    ""
            );
        }
    }


    // =========================================================
    // EXAMPLE 9
    // Decorator vs inheritance
    // =========================================================

    static class BasicLogger {

        void log(String message) {

            System.out.println(
                    "LOG: " + message
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


        Coffee coffee =
                new SimpleCoffee();


        System.out.println(
                coffee.description()
        );


        System.out.println(
                coffee.cost()
        );


        // =====================================================
        // Example 2
        // =====================================================

        System.out.println(
                "\n--- Example 2 ---"
        );


        exampleMultipleDecorators();


        // =====================================================
        // Example 3 + 4
        // =====================================================

        System.out.println(
                "\n--- Example 3/4 ---"
        );


        examplePaymentDecorators();


        // =====================================================
        // Example 6
        // =====================================================

        System.out.println(
                "\n--- Example 6 ---"
        );


        exampleNotificationChain();


        // =====================================================
        // Example 8
        // =====================================================

        System.out.println(
                "\n--- Example 8 ---"
        );


        DataSource source =
                new FileDataSource();


        source =
                new CompressionDecorator(
                        source
                );


        source =
                new EncryptionDecorator(
                        source
                );


        source.write(
                "Hello World"
        );


        System.out.println(
                "Read: "
                        + source.read()
        );
    }
}
