package in.ineuron.proxy;

public class ProxyDeepDive {
	
//	TYPES:
//
//		1. Virtual Proxy
//		   → lazy loading
//
//		2. Protection Proxy
//		   → access control
//
//		3. Remote Proxy
//		   → remote object
//
//		4. Caching Proxy
//		   → cache results


    // =========================================================
    // EXAMPLE 1
    // Virtual Proxy / Lazy Loading
    // =========================================================

    interface Image {

        void display();
    }


    static class RealImage
            implements Image {

        private final String fileName;


        RealImage(
                String fileName
        ) {

            this.fileName = fileName;

            loadFromDisk();
        }


        private void loadFromDisk() {

            System.out.println(
                    "Loading image from disk: "
                            + fileName
            );
        }


        @Override
        public void display() {

            System.out.println(
                    "Displaying: "
                            + fileName
            );
        }
    }


    static class ImageProxy
            implements Image {

        private final String fileName;

        private RealImage realImage;


        ImageProxy(
                String fileName
        ) {

            this.fileName = fileName;
        }


        @Override
        public void display() {

            if (realImage == null) {

                realImage =
                        new RealImage(
                                fileName
                        );
            }


            realImage.display();
        }
    }


    // =========================================================
    // EXAMPLE 2
    // Protection Proxy
    // =========================================================

    interface BankAccount {

        void withdraw(
                double amount
        );
    }


    static class RealBankAccount
            implements BankAccount {

        private double balance =
                10000;


        @Override
        public void withdraw(
                double amount
        ) {

            if (amount > balance) {

                System.out.println(
                        "Insufficient balance"
                );

                return;
            }


            balance -= amount;


            System.out.println(
                    "Withdrawn: "
                            + amount
            );


            System.out.println(
                    "Remaining balance: "
                            + balance
            );
        }
    }


    static class BankAccountProxy
            implements BankAccount {

        private final BankAccount
                realAccount;

        private final String role;


        BankAccountProxy(
                BankAccount realAccount,
                String role
        ) {

            this.realAccount =
                    realAccount;

            this.role = role;
        }


        @Override
        public void withdraw(
                double amount
        ) {

            if (!role.equals("ADMIN")) {

                System.out.println(
                        "Access denied"
                );

                return;
            }


            realAccount.withdraw(amount);
        }
    }


    // =========================================================
    // EXAMPLE 3
    // Logging Proxy
    // =========================================================

    interface OrderService {

        void createOrder(
                String orderId
        );
    }


    static class RealOrderService
            implements OrderService {

        @Override
        public void createOrder(
                String orderId
        ) {

            System.out.println(
                    "Creating order: "
                            + orderId
            );
        }
    }


    static class LoggingOrderProxy
            implements OrderService {

        private final OrderService
                realService;


        LoggingOrderProxy(
                OrderService realService
        ) {

            this.realService =
                    realService;
        }


        @Override
        public void createOrder(
                String orderId
        ) {

            System.out.println(
                    "LOG: createOrder started"
            );


            long start =
                    System.currentTimeMillis();


            realService.createOrder(
                    orderId
            );


            long end =
                    System.currentTimeMillis();


            System.out.println(
                    "LOG: execution time = "
                            + (end - start)
                            + " ms"
            );
        }
    }


    // =========================================================
    // EXAMPLE 4
    // Caching Proxy
    // =========================================================

    interface ProductService {

        String getProduct(
                int productId
        );
    }


    static class RealProductService
            implements ProductService {

        @Override
        public String getProduct(
                int productId
        ) {

            System.out.println(
                    "Calling database..."
            );


            return "Product-" + productId;
        }
    }


    static class CachingProductProxy
            implements ProductService {

        private final ProductService
                realService;


        private final java.util.Map<
                Integer,
                String
                > cache =
                new java.util.HashMap<>();


        CachingProductProxy(
                ProductService realService
        ) {

            this.realService =
                    realService;
        }


        @Override
        public String getProduct(
                int productId
        ) {

            if (cache.containsKey(
                    productId
            )) {

                System.out.println(
                        "Returning from cache..."
                );


                return cache.get(
                        productId
                );
            }


            String product =
                    realService.getProduct(
                            productId
                    );


            cache.put(
                    productId,
                    product
            );


            return product;
        }
    }


    // =========================================================
    // EXAMPLE 5
    // Remote Proxy concept
    // =========================================================

    interface PaymentService {

        void pay(
                double amount
        );
    }


    static class RemotePaymentService
            implements PaymentService {

        @Override
        public void pay(
                double amount
        ) {

            System.out.println(
                    "Calling remote payment server..."
            );


            System.out.println(
                    "Payment processed: "
                            + amount
            );
        }
    }


    static class PaymentProxy
            implements PaymentService {

        private final PaymentService
                remoteService;


        PaymentProxy(
                PaymentService remoteService
        ) {

            this.remoteService =
                    remoteService;
        }


        @Override
        public void pay(
                double amount
        ) {

            System.out.println(
                    "Preparing remote request..."
            );


            remoteService.pay(amount);


            System.out.println(
                    "Remote response received"
            );
        }
    }


    // =========================================================
    // EXAMPLE 6
    // Multiple Proxy responsibilities
    // =========================================================

    interface ReportService {

        String generateReport();
    }


    static class RealReportService
            implements ReportService {

        @Override
        public String generateReport() {

            System.out.println(
                    "Generating expensive report..."
            );


            return "Report Data";
        }
    }


    static class ReportProxy
            implements ReportService {

        private final ReportService
                realService;


        private String cachedReport;


        ReportProxy(
                ReportService realService
        ) {

            this.realService =
                    realService;
        }


        @Override
        public String generateReport() {

            if (cachedReport != null) {

                System.out.println(
                        "Returning cached report"
                );


                return cachedReport;
            }


            System.out.println(
                    "Generating report for first time"
            );


            cachedReport =
                    realService.generateReport();


            return cachedReport;
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
        // Virtual Proxy
        // =====================================================

        System.out.println(
                "\n--- Example 1 ---"
        );


        Image image =
                new ImageProxy(
                        "large-image.jpg"
                );


        System.out.println(
                "Proxy created"
        );


        System.out.println(
                "Real image has NOT loaded yet"
        );


        image.display();


        image.display();


        // =====================================================
        // Example 2
        // Protection Proxy
        // =====================================================

        System.out.println(
                "\n--- Example 2 ---"
        );


        BankAccount realAccount =
                new RealBankAccount();


        BankAccount userAccount =
                new BankAccountProxy(
                        realAccount,
                        "USER"
                );


        userAccount.withdraw(1000);


        BankAccount adminAccount =
                new BankAccountProxy(
                        realAccount,
                        "ADMIN"
                );


        adminAccount.withdraw(1000);


        // =====================================================
        // Example 3
        // Logging Proxy
        // =====================================================

        System.out.println(
                "\n--- Example 3 ---"
        );


        OrderService orderService =
                new LoggingOrderProxy(
                        new RealOrderService()
                );


        orderService.createOrder(
                "ORD-1001"
        );


        // =====================================================
        // Example 4
        // Caching Proxy
        // =====================================================

        System.out.println(
                "\n--- Example 4 ---"
        );


        ProductService productService =
                new CachingProductProxy(
                        new RealProductService()
                );


        System.out.println(
                productService.getProduct(10)
        );


        System.out.println(
                productService.getProduct(10)
        );


        // =====================================================
        // Example 5
        // Remote Proxy
        // =====================================================

        System.out.println(
                "\n--- Example 5 ---"
        );


        PaymentService payment =
                new PaymentProxy(
                        new RemotePaymentService()
                );


        payment.pay(5000);


        // =====================================================
        // Example 6
        // Cached Report
        // =====================================================

        System.out.println(
                "\n--- Example 6 ---"
        );


        ReportService report =
                new ReportProxy(
                        new RealReportService()
                );


        report.generateReport();

        report.generateReport();
    }
}
