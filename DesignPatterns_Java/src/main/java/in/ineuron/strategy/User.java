package in.ineuron.strategy;

public class User {
    private String name;
    private AccessStrategy accessStrategy;

    public User(String name, AccessStrategy accessStrategy) {
        this.name = name;
        this.accessStrategy = accessStrategy;
    }

    public void showScreens() {
        System.out.println("User: " + name);
        accessStrategy.showAccessibleScreens();
        System.out.println();
    }

    public void setAccessStrategy(AccessStrategy accessStrategy) {
        this.accessStrategy = accessStrategy;
    }
}

