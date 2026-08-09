package in.ineuron.templatemethod;

public class TemplateMethodDeepDive {


    // =========================================================
    // EXAMPLE 1
    // Basic Template Method
    // =========================================================

    static abstract class Beverage {

        // Template Method
        public final void prepareBeverage() {

            boilWater();

            prepareMainIngredient();

            pourIntoCup();

            addCondiments();
        }


        private void boilWater() {

            System.out.println(
                    "Boiling water"
            );
        }


        protected abstract void
        prepareMainIngredient();


        private void pourIntoCup() {

            System.out.println(
                    "Pouring into cup"
            );
        }


        protected abstract void
        addCondiments();
    }


    static class Tea
            extends Beverage {

        @Override
        protected void
        prepareMainIngredient() {

            System.out.println(
                    "Adding tea leaves"
            );
        }


        @Override
        protected void
        addCondiments() {

            System.out.println(
                    "Adding lemon"
            );
        }
    }


    static class Coffee
            extends Beverage {

        @Override
        protected void
        prepareMainIngredient() {

            System.out.println(
                    "Adding coffee powder"
            );
        }


        @Override
        protected void
        addCondiments() {

            System.out.println(
                    "Adding milk and sugar"
            );
        }
    }


    // =========================================================
    // EXAMPLE 2
    // Data Processing
    // =========================================================

    static abstract class DataProcessor {

        public final void process() {

            readData();

            processData();

            saveData();
        }


        protected abstract void readData();


        protected abstract void processData();


        private void saveData() {

            System.out.println(
                    "Saving processed data"
            );
        }
    }


    static class CsvProcessor
            extends DataProcessor {

        @Override
        protected void readData() {

            System.out.println(
                    "Reading CSV file"
            );
        }


        @Override
        protected void processData() {

            System.out.println(
                    "Processing CSV data"
            );
        }
    }


    static class JsonProcessor
            extends DataProcessor {

        @Override
        protected void readData() {

            System.out.println(
                    "Reading JSON file"
            );
        }


        @Override
        protected void processData() {

            System.out.println(
                    "Processing JSON data"
            );
        }
    }


    // =========================================================
    // EXAMPLE 3
    // Login Process
    // =========================================================

    static abstract class LoginTemplate {

        public final void login() {

            validateUser();

            authenticate();

            loadUserData();

            showDashboard();
        }


        protected abstract void validateUser();


        protected abstract void authenticate();


        protected void loadUserData() {

            System.out.println(
                    "Loading user data"
            );
        }


        protected void showDashboard() {

            System.out.println(
                    "Showing dashboard"
            );
        }
    }


    static class AdminLogin
            extends LoginTemplate {

        @Override
        protected void validateUser() {

            System.out.println(
                    "Validating admin"
            );
        }


        @Override
        protected void authenticate() {

            System.out.println(
                    "Authenticating admin"
            );
        }
    }


    static class CustomerLogin
            extends LoginTemplate {

        @Override
        protected void validateUser() {

            System.out.println(
                    "Validating customer"
            );
        }


        @Override
        protected void authenticate() {

            System.out.println(
                    "Authenticating customer"
            );
        }
    }


    // =========================================================
    // EXAMPLE 4
    // Hook Method
    // =========================================================

    static abstract class ReportGenerator {

        public final void generateReport() {

            fetchData();

            formatData();

            if (shouldExport()) {

                export();
            }

            finish();
        }


        protected abstract void fetchData();


        protected abstract void formatData();


        // Hook
        protected boolean shouldExport() {

            return true;
        }


        protected void export() {

            System.out.println(
                    "Exporting report"
            );
        }


        protected void finish() {

            System.out.println(
                    "Report completed"
            );
        }
    }


    static class PreviewReport
            extends ReportGenerator {

        @Override
        protected void fetchData() {

            System.out.println(
                    "Fetching preview data"
            );
        }


        @Override
        protected void formatData() {

            System.out.println(
                    "Formatting preview"
            );
        }


        @Override
        protected boolean shouldExport() {

            return false;
        }
    }


    static class FinalReport
            extends ReportGenerator {

        @Override
        protected void fetchData() {

            System.out.println(
                    "Fetching final data"
            );
        }


        @Override
        protected void formatData() {

            System.out.println(
                    "Formatting final report"
            );
        }
    }


    // =========================================================
    // EXAMPLE 5
    // Order Processing
    // =========================================================

    static abstract class OrderProcessor {

        public final void processOrder() {

            validateOrder();

            calculatePrice();

            makePayment();

            shipOrder();

            sendConfirmation();
        }


        protected abstract void validateOrder();


        protected abstract void calculatePrice();


        protected abstract void makePayment();


        protected abstract void shipOrder();


        protected void sendConfirmation() {

            System.out.println(
                    "Sending confirmation"
            );
        }
    }


    static class OnlineOrder
            extends OrderProcessor {

        @Override
        protected void validateOrder() {

            System.out.println(
                    "Validating online order"
            );
        }


        @Override
        protected void calculatePrice() {

            System.out.println(
                    "Calculating online price"
            );
        }


        @Override
        protected void makePayment() {

            System.out.println(
                    "Processing online payment"
            );
        }


        @Override
        protected void shipOrder() {

            System.out.println(
                    "Shipping online order"
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
                "\n--- Tea ---"
        );


        Beverage tea =
                new Tea();


        tea.prepareBeverage();


        System.out.println(
                "\n--- Coffee ---"
        );


        Beverage coffee =
                new Coffee();


        coffee.prepareBeverage();


        // =====================================================
        // Example 2
        // =====================================================

        System.out.println(
                "\n--- CSV ---"
        );


        DataProcessor csv =
                new CsvProcessor();


        csv.process();


        System.out.println(
                "\n--- JSON ---"
        );


        DataProcessor json =
                new JsonProcessor();


        json.process();


        // =====================================================
        // Example 3
        // =====================================================

        System.out.println(
                "\n--- Admin Login ---"
        );


        LoginTemplate admin =
                new AdminLogin();


        admin.login();


        System.out.println(
                "\n--- Customer Login ---"
        );


        LoginTemplate customer =
                new CustomerLogin();


        customer.login();


        // =====================================================
        // Example 4
        // =====================================================

        System.out.println(
                "\n--- Preview Report ---"
        );


        ReportGenerator preview =
                new PreviewReport();


        preview.generateReport();


        System.out.println(
                "\n--- Final Report ---"
        );


        ReportGenerator report =
                new FinalReport();


        report.generateReport();


        // =====================================================
        // Example 5
        // =====================================================

        System.out.println(
                "\n--- Online Order ---"
        );


        OrderProcessor order =
                new OnlineOrder();


        order.processOrder();
    }
}