package in.ineuron.singleton;

public class SingletonDeepDive {
	
//	Singleton is a creational design pattern that restricts a class to a 
//	single instance and provides a global access point to that instance. 
//	Typically, this is achieved using a private constructor, a static 
//	instance, and an access method such as getInstance(). In Java, the 
//	implementation must also consider thread safety, lazy initialization, 
//	serialization, reflection, and cloning. In Spring, singleton scope is
//	managed by the IoC container rather than by manually implementing the 
//	GoF Singleton pattern.


    // =========================================================
    // EXAMPLE 1
    // Normal class - multiple objects
    // =========================================================

    static class NormalClass {

        NormalClass() {
        }
    }


    // =========================================================
    // EXAMPLE 2
    // Basic Lazy Singleton
    // =========================================================

    static class LazySingleton {

        private static LazySingleton instance;


        private LazySingleton() {
        }


        static LazySingleton getInstance() {

            if (instance == null) {

                instance =
                        new LazySingleton();
            }

            return instance;
        }
    }


    // =========================================================
    // EXAMPLE 3
    // Eager Singleton
    // =========================================================

    static class EagerSingleton {

        private static final EagerSingleton INSTANCE =
                new EagerSingleton();


        private EagerSingleton() {
        }


        static EagerSingleton getInstance() {

            return INSTANCE;
        }
    }


    // =========================================================
    // EXAMPLE 4
    // Synchronized Method
    // =========================================================

    static class SynchronizedSingleton {

        private static SynchronizedSingleton instance;


        private SynchronizedSingleton() {
        }


        static synchronized SynchronizedSingleton
        getInstance() {

            if (instance == null) {

                instance =
                        new SynchronizedSingleton();
            }

            return instance;
        }
    }


    // =========================================================
    // EXAMPLE 5
    // Double-Checked Locking
    // =========================================================

    static class DoubleCheckedSingleton {

        private static volatile
        DoubleCheckedSingleton instance;


        private DoubleCheckedSingleton() {
        }


        static DoubleCheckedSingleton
        getInstance() {

            if (instance == null) {

                synchronized (
                        DoubleCheckedSingleton.class
                ) {

                    if (instance == null) {

                        instance =
                                new DoubleCheckedSingleton();
                    }
                }
            }

            return instance;
        }
    }


    // =========================================================
    // EXAMPLE 6
    // Static Holder Idiom
    // =========================================================

    static class HolderSingleton {

        private HolderSingleton() {
        }


        private static class Holder {

            private static final
            HolderSingleton INSTANCE =
                    new HolderSingleton();
        }


        static HolderSingleton getInstance() {

            return Holder.INSTANCE;
        }
    }


    // =========================================================
    // EXAMPLE 7
    // Enum Singleton
    // =========================================================

    enum EnumSingleton {

        INSTANCE;


        void showMessage() {

            System.out.println(
                    "Enum Singleton"
            );
        }
    }


    // =========================================================
    // EXAMPLE 8
    // Singleton with state
    // =========================================================

    static class CounterSingleton {

        private static final
        CounterSingleton INSTANCE =
                new CounterSingleton();


        private int count;


        private CounterSingleton() {
        }


        static CounterSingleton getInstance() {

            return INSTANCE;
        }


        void increment() {

            count++;
        }


        int getCount() {

            return count;
        }
    }


    // =========================================================
    // EXAMPLE 9
    // Singleton + private constructor
    // =========================================================

    static class DatabaseManager {

        private static final
        DatabaseManager INSTANCE =
                new DatabaseManager();


        private DatabaseManager() {

            System.out.println(
                    "DatabaseManager created"
            );
        }


        static DatabaseManager getInstance() {

            return INSTANCE;
        }


        void connect() {

            System.out.println(
                    "Connecting to database..."
            );
        }
    }


    // =========================================================
    // EXAMPLE 10
    // MAIN
    // =========================================================

    public static void main(
            String[] args
    ) {


        // =====================================================
        // Normal class
        // =====================================================

        System.out.println(
                "\n--- Normal Class ---"
        );


        NormalClass n1 =
                new NormalClass();

        NormalClass n2 =
                new NormalClass();


        System.out.println(
                n1 == n2
        );


        // =====================================================
        // Lazy Singleton
        // =====================================================

        System.out.println(
                "\n--- Lazy Singleton ---"
        );


        LazySingleton l1 =
                LazySingleton.getInstance();

        LazySingleton l2 =
                LazySingleton.getInstance();


        System.out.println(
                l1 == l2
        );


        // =====================================================
        // Eager Singleton
        // =====================================================

        System.out.println(
                "\n--- Eager Singleton ---"
        );


        EagerSingleton e1 =
                EagerSingleton.getInstance();

        EagerSingleton e2 =
                EagerSingleton.getInstance();


        System.out.println(
                e1 == e2
        );


        // =====================================================
        // Synchronized Singleton
        // =====================================================

        System.out.println(
                "\n--- Synchronized Singleton ---"
        );


        SynchronizedSingleton s1 =
                SynchronizedSingleton.getInstance();

        SynchronizedSingleton s2 =
                SynchronizedSingleton.getInstance();


        System.out.println(
                s1 == s2
        );


        // =====================================================
        // Double Checked Singleton
        // =====================================================

        System.out.println(
                "\n--- Double Checked Singleton ---"
        );


        DoubleCheckedSingleton d1 =
                DoubleCheckedSingleton.getInstance();

        DoubleCheckedSingleton d2 =
                DoubleCheckedSingleton.getInstance();


        System.out.println(
                d1 == d2
        );


        // =====================================================
        // Holder Singleton
        // =====================================================

        System.out.println(
                "\n--- Holder Singleton ---"
        );


        HolderSingleton h1 =
                HolderSingleton.getInstance();

        HolderSingleton h2 =
                HolderSingleton.getInstance();


        System.out.println(
                h1 == h2
        );


        // =====================================================
        // Enum Singleton
        // =====================================================

        System.out.println(
                "\n--- Enum Singleton ---"
        );


        EnumSingleton enum1 =
                EnumSingleton.INSTANCE;

        EnumSingleton enum2 =
                EnumSingleton.INSTANCE;


        System.out.println(
                enum1 == enum2
        );


        enum1.showMessage();


        // =====================================================
        // State
        // =====================================================

        System.out.println(
                "\n--- Shared State ---"
        );


        CounterSingleton c1 =
                CounterSingleton.getInstance();

        CounterSingleton c2 =
                CounterSingleton.getInstance();


        c1.increment();
        c1.increment();

        c2.increment();


        System.out.println(
                c1.getCount()
        );

        System.out.println(
                c2.getCount()
        );


        // =====================================================
        // Database
        // =====================================================

        System.out.println(
                "\n--- Database ---"
        );


        DatabaseManager db1 =
                DatabaseManager.getInstance();

        DatabaseManager db2 =
                DatabaseManager.getInstance();


        db1.connect();


        System.out.println(
                db1 == db2
        );
    }
}
