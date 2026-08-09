package in.ineuron.builder;

public class BuilderDeepDive {

//	The Builder can remain mutable while collecting configuration, and the
//	final object's fields can be final and initialized only during build().
//	This allows us to construct a fully initialized immutable object 
//	without exposing setters.

    // =========================================================
    // EXAMPLE 1
    // Normal object
    // =========================================================

    static class User {

        private String name;
        private String email;
        private int age;


        User(
                String name,
                String email,
                int age
        ) {

            this.name = name;
            this.email = email;
            this.age = age;
        }


        @Override
        public String toString() {

            return "User{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


    // =========================================================
    // EXAMPLE 2
    // Telescoping Constructor
    // =========================================================

    static class Employee {

        private String name;
        private String email;
        private int age;
        private String department;


        Employee(String name) {

            this(
                    name,
                    null,
                    0,
                    null
            );
        }


        Employee(
                String name,
                String email
        ) {

            this(
                    name,
                    email,
                    0,
                    null
            );
        }


        Employee(
                String name,
                String email,
                int age
        ) {

            this(
                    name,
                    email,
                    age,
                    null
            );
        }


        Employee(
                String name,
                String email,
                int age,
                String department
        ) {

            this.name = name;
            this.email = email;
            this.age = age;
            this.department = department;
        }
    }


    // =========================================================
    // EXAMPLE 3
    // Basic Builder
    // =========================================================

    static class Product {

        private String name;
        private double price;
        private String category;


        private Product(
                Builder builder
        ) {

            this.name =
                    builder.name;

            this.price =
                    builder.price;

            this.category =
                    builder.category;
        }


        static class Builder {

            private String name;
            private double price;
            private String category;


            Builder name(
                    String name
            ) {

                this.name = name;

                return this;
            }


            Builder price(
                    double price
            ) {

                this.price = price;

                return this;
            }


            Builder category(
                    String category
            ) {

                this.category = category;

                return this;
            }


            Product build() {

                return new Product(this);
            }
        }


        @Override
        public String toString() {

            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    ", category='" +
                    category + '\'' +
                    '}';
        }
    }


    // =========================================================
    // EXAMPLE 4
    // Immutable Builder
    // =========================================================

    static final class Customer {

        private final String name;
        private final String email;
        private final int age;
        private final String city;


        private Customer(
                Builder builder
        ) {

            this.name =
                    builder.name;

            this.email =
                    builder.email;

            this.age =
                    builder.age;

            this.city =
                    builder.city;
        }


        static class Builder {

            private String name;
            private String email;
            private int age;
            private String city;


            Builder name(
                    String name
            ) {

                this.name = name;

                return this;
            }


            Builder email(
                    String email
            ) {

                this.email = email;

                return this;
            }


            Builder age(
                    int age
            ) {

                this.age = age;

                return this;
            }


            Builder city(
                    String city
            ) {

                this.city = city;

                return this;
            }


            Customer build() {

                return new Customer(this);
            }
        }


        @Override
        public String toString() {

            return "Customer{" +
                    "name='" + name + '\'' +
                    ", email='" +
                    email + '\'' +
                    ", age=" + age +
                    ", city='" +
                    city + '\'' +
                    '}';
        }
    }


    // =========================================================
    // EXAMPLE 5
    // Builder with required field
    // =========================================================

    static class Order {

        private final String orderId;
        private final String customerName;
        private final double amount;
        private final String address;


        private Order(
                Builder builder
        ) {

            this.orderId =
                    builder.orderId;

            this.customerName =
                    builder.customerName;

            this.amount =
                    builder.amount;

            this.address =
                    builder.address;
        }


        static class Builder {

            private final String orderId;
            private final String customerName;

            private double amount;
            private String address;


            Builder(
                    String orderId,
                    String customerName
            ) {

                this.orderId =
                        orderId;

                this.customerName =
                        customerName;
            }


            Builder amount(
                    double amount
            ) {

                this.amount = amount;

                return this;
            }


            Builder address(
                    String address
            ) {

                this.address = address;

                return this;
            }


            Order build() {

                return new Order(this);
            }
        }
    }


    // =========================================================
    // EXAMPLE 6
    // Builder with validation
    // =========================================================

    static class Account {

        private final String username;
        private final String email;
        private final int age;


        private Account(
                Builder builder
        ) {

            this.username =
                    builder.username;

            this.email =
                    builder.email;

            this.age =
                    builder.age;
        }


        static class Builder {

            private String username;
            private String email;
            private int age;


            Builder username(
                    String username
            ) {

                this.username =
                        username;

                return this;
            }


            Builder email(
                    String email
            ) {

                this.email =
                        email;

                return this;
            }


            Builder age(
                    int age
            ) {

                this.age = age;

                return this;
            }


            Account build() {

                if (username == null ||
                        username.isBlank()) {

                    throw new IllegalArgumentException(
                            "Username is required"
                    );
                }


                if (email == null ||
                        !email.contains("@")) {

                    throw new IllegalArgumentException(
                            "Invalid email"
                    );
                }


                if (age < 18) {

                    throw new IllegalArgumentException(
                            "Age must be >= 18"
                    );
                }


                return new Account(this);
            }
        }
    }


    // =========================================================
    // EXAMPLE 7
    // Builder with optional fields
    // =========================================================

    static class Computer {

        private final String processor;
        private final int ram;
        private final int storage;
        private final boolean graphicsCard;
        private final boolean wifi;
        private final boolean bluetooth;


        private Computer(
                Builder builder
        ) {

            this.processor =
                    builder.processor;

            this.ram =
                    builder.ram;

            this.storage =
                    builder.storage;

            this.graphicsCard =
                    builder.graphicsCard;

            this.wifi =
                    builder.wifi;

            this.bluetooth =
                    builder.bluetooth;
        }


        static class Builder {

            private final String processor;
            private final int ram;
            private final int storage;

            private boolean graphicsCard;
            private boolean wifi;
            private boolean bluetooth;


            Builder(
                    String processor,
                    int ram,
                    int storage
            ) {

                this.processor =
                        processor;

                this.ram = ram;

                this.storage =
                        storage;
            }


            Builder graphicsCard(
                    boolean value
            ) {

                this.graphicsCard =
                        value;

                return this;
            }


            Builder wifi(
                    boolean value
            ) {

                this.wifi = value;

                return this;
            }


            Builder bluetooth(
                    boolean value
            ) {

                this.bluetooth =
                        value;

                return this;
            }


            Computer build() {

                return new Computer(this);
            }
        }
    }


    // =========================================================
    // EXAMPLE 8
    // Builder with List
    // =========================================================

    static class Team {

        private final String name;
        private final java.util.List<String>
                members;


        private Team(
                Builder builder
        ) {

            this.name =
                    builder.name;

            this.members =
                    java.util.List.copyOf(
                            builder.members
                    );
        }


        static class Builder {

            private String name;

            private final java.util.List<String>
                    members =
                    new java.util.ArrayList<>();


            Builder name(
                    String name
            ) {

                this.name = name;

                return this;
            }


            Builder addMember(
                    String member
            ) {

                this.members.add(member);

                return this;
            }


            Team build() {

                return new Team(this);
            }
        }


        @Override
        public String toString() {

            return "Team{" +
                    "name='" + name + '\'' +
                    ", members=" +
                    members +
                    '}';
        }
    }


    // =========================================================
    // EXAMPLE 9
    // Builder inheritance-style example
    // =========================================================

    static class Vehicle {

        protected String brand;
        protected String color;


        Vehicle(
                Builder<?> builder
        ) {

            this.brand =
                    builder.brand;

            this.color =
                    builder.color;
        }


        static abstract class Builder<
                T extends Builder<T>
                > {

            private String brand;
            private String color;


            T brand(
                    String brand
            ) {

                this.brand = brand;

                return self();
            }


            T color(
                    String color
            ) {

                this.color = color;

                return self();
            }


            abstract T self();
        }
    }


    static class Car
            extends Vehicle {

        private int doors;


        private Car(
                Builder builder
        ) {

            super(builder);

            this.doors =
                    builder.doors;
        }


        static class Builder
                extends Vehicle.Builder<Builder> {

            private int doors;


            Builder doors(
                    int doors
            ) {

                this.doors = doors;

                return this;
            }


            @Override
            Builder self() {

                return this;
            }


            Car build() {

                return new Car(this);
            }
        }


        @Override
        public String toString() {

            return "Car{" +
                    "brand='" +
                    brand + '\'' +
                    ", color='" +
                    color + '\'' +
                    ", doors=" +
                    doors +
                    '}';
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


        User user =
                new User(
                        "John",
                        "john@gmail.com",
                        25
                );


        System.out.println(user);


        // =====================================================
        // Example 2
        // =====================================================

        System.out.println(
                "\n--- Example 2 ---"
        );


        Employee employee =
                new Employee(
                        "Alice",
                        "alice@gmail.com",
                        30,
                        "IT"
                );


        System.out.println(
                employee
        );


        // =====================================================
        // Example 3
        // =====================================================

        System.out.println(
                "\n--- Example 3 ---"
        );


        Product product =
                new Product.Builder()

                        .name("Laptop")

                        .price(75000)

                        .category("Electronics")

                        .build();


        System.out.println(product);


        // =====================================================
        // Example 4
        // =====================================================

        System.out.println(
                "\n--- Example 4 ---"
        );


        Customer customer =
                new Customer.Builder()

                        .name("Bob")

                        .email("bob@gmail.com")

                        .age(28)

                        .city("Hyderabad")

                        .build();


        System.out.println(customer);


        // =====================================================
        // Example 5
        // =====================================================

        System.out.println(
                "\n--- Example 5 ---"
        );


        Order order =
                new Order.Builder(
                        "ORD-1001",
                        "John"
                )

                        .amount(5000)

                        .address("Hyderabad")

                        .build();


        System.out.println(
                "Order created"
        );


        // =====================================================
        // Example 6
        // =====================================================

        System.out.println(
                "\n--- Example 6 ---"
        );


        Account account =
                new Account.Builder()

                        .username("john123")

                        .email("john@gmail.com")

                        .age(25)

                        .build();


        System.out.println(
                "Account created"
        );


        // =====================================================
        // Example 7
        // =====================================================

        System.out.println(
                "\n--- Example 7 ---"
        );


        Computer computer =
                new Computer.Builder(
                        "Intel i7",
                        16,
                        512
                )

                        .graphicsCard(true)

                        .wifi(true)

                        .bluetooth(true)

                        .build();


        System.out.println(
                "Computer created"
        );


        // =====================================================
        // Example 8
        // =====================================================

        System.out.println(
                "\n--- Example 8 ---"
        );


        Team team =
                new Team.Builder()

                        .name("Backend Team")

                        .addMember("John")

                        .addMember("Alice")

                        .addMember("Bob")

                        .build();


        System.out.println(team);


        // =====================================================
        // Example 9
        // =====================================================

        System.out.println(
                "\n--- Example 9 ---"
        );


        Car car =
                new Car.Builder()

                        .brand("Toyota")

                        .color("Blue")

                        .doors(4)

                        .build();


        System.out.println(car);
    }
}
