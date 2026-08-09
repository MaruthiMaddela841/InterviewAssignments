package in.ineuron.strategy;

public class StrategyDeepDive {


    // =========================================================
    // EXAMPLE 1
    // Basic Strategy
    // =========================================================

    interface PaymentStrategy {

        void pay(double amount);
    }


    static class CreditCardStrategy
            implements PaymentStrategy {

        @Override
        public void pay(double amount) {

            System.out.println(
                    "Paid ₹"
                            + amount
                            + " using Credit Card"
            );
        }
    }


    static class PayPalStrategy
            implements PaymentStrategy {

        @Override
        public void pay(double amount) {

            System.out.println(
                    "Paid ₹"
                            + amount
                            + " using PayPal"
            );
        }
    }


    static class UpiStrategy
            implements PaymentStrategy {

        @Override
        public void pay(double amount) {

            System.out.println(
                    "Paid ₹"
                            + amount
                            + " using UPI"
            );
        }
    }


    // Context
    static class PaymentContext {

        private PaymentStrategy strategy;


        PaymentContext(
                PaymentStrategy strategy
        ) {

            this.strategy = strategy;
        }


        void setStrategy(
                PaymentStrategy strategy
        ) {

            this.strategy = strategy;
        }


        void pay(double amount) {

            strategy.pay(amount);
        }
    }


    // =========================================================
    // EXAMPLE 2
    // Sorting Strategy
    // =========================================================

    interface SortStrategy {

        void sort(int[] numbers);
    }


    static class BubbleSortStrategy
            implements SortStrategy {

        @Override
        public void sort(
                int[] numbers
        ) {

            System.out.println(
                    "Sorting using Bubble Sort"
            );

            // Simplified example
        }
    }


    static class MergeSortStrategy
            implements SortStrategy {

        @Override
        public void sort(
                int[] numbers
        ) {

            System.out.println(
                    "Sorting using Merge Sort"
            );

            // Simplified example
        }
    }


    static class QuickSortStrategy
            implements SortStrategy {

        @Override
        public void sort(
                int[] numbers
        ) {

            System.out.println(
                    "Sorting using Quick Sort"
            );

            // Simplified example
        }
    }


    // =========================================================
    // EXAMPLE 3
    // Discount Strategy
    // =========================================================

    interface DiscountStrategy {

        double calculateDiscount(
                double amount
        );
    }


    static class NoDiscountStrategy
            implements DiscountStrategy {

        @Override
        public double calculateDiscount(
                double amount
        ) {

            return 0;
        }
    }


    static class FestivalDiscountStrategy
            implements DiscountStrategy {

        @Override
        public double calculateDiscount(
                double amount
        ) {

            return amount * 0.20;
        }
    }


    static class PremiumDiscountStrategy
            implements DiscountStrategy {

        @Override
        public double calculateDiscount(
                double amount
        ) {

            return amount * 0.30;
        }
    }


    static class ShoppingCart {

        private DiscountStrategy
                discountStrategy;


        ShoppingCart(
                DiscountStrategy discountStrategy
        ) {

            this.discountStrategy =
                    discountStrategy;
        }


        void setDiscountStrategy(
                DiscountStrategy discountStrategy
        ) {

            this.discountStrategy =
                    discountStrategy;
        }


        double calculateFinalPrice(
                double amount
        ) {

            double discount =
                    discountStrategy
                            .calculateDiscount(
                                    amount
                            );


            return amount - discount;
        }
    }


    // =========================================================
    // EXAMPLE 4
    // Compression Strategy
    // =========================================================

    interface CompressionStrategy {

        void compress(
                String file
        );
    }


    static class ZipCompression
            implements CompressionStrategy {

        @Override
        public void compress(
                String file
        ) {

            System.out.println(
                    "Compressing "
                            + file
                            + " using ZIP"
            );
        }
    }


    static class RarCompression
            implements CompressionStrategy {

        @Override
        public void compress(
                String file
        ) {

            System.out.println(
                    "Compressing "
                            + file
                            + " using RAR"
            );
        }
    }


    static class GzipCompression
            implements CompressionStrategy {

        @Override
        public void compress(
                String file
        ) {

            System.out.println(
                    "Compressing "
                            + file
                            + " using GZIP"
            );
        }
    }


    static class CompressionContext {

        private CompressionStrategy
                strategy;


        CompressionContext(
                CompressionStrategy strategy
        ) {

            this.strategy = strategy;
        }


        void compress(
                String file
        ) {

            strategy.compress(file);
        }
    }


    // =========================================================
    // EXAMPLE 5
    // Navigation Strategy
    // =========================================================

    interface NavigationStrategy {

        void navigate(
                String source,
                String destination
        );
    }


    static class CarNavigation
            implements NavigationStrategy {

        @Override
        public void navigate(
                String source,
                String destination
        ) {

            System.out.println(
                    "Driving from "
                            + source
                            + " to "
                            + destination
            );
        }
    }


    static class WalkingNavigation
            implements NavigationStrategy {

        @Override
        public void navigate(
                String source,
                String destination
        ) {

            System.out.println(
                    "Walking from "
                            + source
                            + " to "
                            + destination
            );
        }
    }


    static class PublicTransportNavigation
            implements NavigationStrategy {

        @Override
        public void navigate(
                String source,
                String destination
        ) {

            System.out.println(
                    "Using public transport from "
                            + source
                            + " to "
                            + destination
            );
        }
    }


    static class NavigationContext {

        private NavigationStrategy
                strategy;


        NavigationContext(
                NavigationStrategy strategy
        ) {

            this.strategy = strategy;
        }


        void setStrategy(
                NavigationStrategy strategy
        ) {

            this.strategy = strategy;
        }


        void navigate(
                String source,
                String destination
        ) {

            strategy.navigate(
                    source,
                    destination
            );
        }
    }


    // =========================================================
    // EXAMPLE 6
    // Lambda-based Strategy
    // =========================================================

    interface Operation {

        int execute(
                int a,
                int b
        );
    }


    // =========================================================
    // MAIN
    // =========================================================

    public static void main(
            String[] args
    ) {


        // =====================================================
        // Example 1
        // Payment Strategy
        // =====================================================

        System.out.println(
                "\n--- Payment Strategy ---"
        );


        PaymentContext payment =
                new PaymentContext(
                        new CreditCardStrategy()
                );


        payment.pay(1000);


        payment.setStrategy(
                new UpiStrategy()
        );


        payment.pay(500);


        payment.setStrategy(
                new PayPalStrategy()
        );


        payment.pay(750);


        // =====================================================
        // Example 2
        // Sorting
        // =====================================================

        System.out.println(
                "\n--- Sorting Strategy ---"
        );


        int[] numbers =
                {5, 2, 8, 1};


        SortStrategy sort =
                new MergeSortStrategy();


        sort.sort(numbers);


        sort =
                new QuickSortStrategy();


        sort.sort(numbers);


        // =====================================================
        // Example 3
        // Discount
        // =====================================================

        System.out.println(
                "\n--- Discount Strategy ---"
        );


        ShoppingCart cart =
                new ShoppingCart(
                        new NoDiscountStrategy()
                );


        System.out.println(
                "Price: "
                        + cart.calculateFinalPrice(
                                1000
                        )
        );


        cart.setDiscountStrategy(
                new FestivalDiscountStrategy()
        );


        System.out.println(
                "Festival price: "
                        + cart.calculateFinalPrice(
                                1000
                        )
        );


        cart.setDiscountStrategy(
                new PremiumDiscountStrategy()
        );


        System.out.println(
                "Premium price: "
                        + cart.calculateFinalPrice(
                                1000
                        )
        );


        // =====================================================
        // Example 4
        // Compression
        // =====================================================

        System.out.println(
                "\n--- Compression Strategy ---"
        );


        CompressionContext compression =
                new CompressionContext(
                        new ZipCompression()
                );


        compression.compress(
                "data.txt"
        );


        compression =
                new CompressionContext(
                        new GzipCompression()
                );


        compression.compress(
                "data.txt"
        );


        // =====================================================
        // Example 5
        // Navigation
        // =====================================================

        System.out.println(
                "\n--- Navigation Strategy ---"
        );


        NavigationContext navigation =
                new NavigationContext(
                        new CarNavigation()
                );


        navigation.navigate(
                "Hyderabad",
                "Bangalore"
        );


        navigation.setStrategy(
                new WalkingNavigation()
        );


        navigation.navigate(
                "Home",
                "Park"
        );


        navigation.setStrategy(
                new PublicTransportNavigation()
        );


        navigation.navigate(
                "Hyderabad",
                "Secunderabad"
        );


        // =====================================================
        // Example 6
        // Lambda Strategy
        // =====================================================

        System.out.println(
                "\n--- Lambda Strategy ---"
        );


        Operation addition =
                (a, b) -> a + b;


        Operation multiplication =
                (a, b) -> a * b;


        Operation subtraction =
                (a, b) -> a - b;


        System.out.println(
                addition.execute(10, 5)
        );


        System.out.println(
                multiplication.execute(10, 5)
        );


        System.out.println(
                subtraction.execute(10, 5)
        );
    }
}
