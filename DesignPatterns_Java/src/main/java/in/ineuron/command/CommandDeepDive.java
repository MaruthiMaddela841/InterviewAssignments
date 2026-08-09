package in.ineuron.command;

public class CommandDeepDive {


    // =========================================================
    // EXAMPLE 1
    // Basic Command Pattern
    // =========================================================

    interface Command {

        void execute();
    }


    // Receiver
    static class Light {

        void turnOn() {

            System.out.println(
                    "Light ON"
            );
        }


        void turnOff() {

            System.out.println(
                    "Light OFF"
            );
        }
    }


    // Concrete Command
    static class TurnOnCommand
            implements Command {

        private final Light light;


        TurnOnCommand(
                Light light
        ) {

            this.light = light;
        }


        @Override
        public void execute() {

            light.turnOn();
        }
    }


    static class TurnOffCommand
            implements Command {

        private final Light light;


        TurnOffCommand(
                Light light
        ) {

            this.light = light;
        }


        @Override
        public void execute() {

            light.turnOff();
        }
    }


    // Invoker
    static class RemoteControl {

        private Command command;


        void setCommand(
                Command command
        ) {

            this.command = command;
        }


        void pressButton() {

            command.execute();
        }
    }


    // =========================================================
    // EXAMPLE 2
    // Undo Command
    // =========================================================

    interface UndoableCommand
            extends Command {

        void undo();
    }


    static class TurnOnUndoableCommand
            implements UndoableCommand {

        private final Light light;


        TurnOnUndoableCommand(
                Light light
        ) {

            this.light = light;
        }


        @Override
        public void execute() {

            light.turnOn();
        }


        @Override
        public void undo() {

            light.turnOff();
        }
    }


    // =========================================================
    // EXAMPLE 3
    // Text Editor
    // =========================================================

    static class TextEditor {

        private String text = "";


        void write(
                String newText
        ) {

            text += newText;


            System.out.println(
                    "Text: " + text
            );
        }


        void deleteLast(
                int count
        ) {

            if (count >= text.length()) {

                text = "";

            } else {

                text =
                        text.substring(
                                0,
                                text.length() - count
                        );
            }


            System.out.println(
                    "Text: " + text
            );
        }


        String getText() {

            return text;
        }
    }


    static class WriteCommand
            implements UndoableCommand {

        private final TextEditor editor;

        private final String text;


        WriteCommand(
                TextEditor editor,
                String text
        ) {

            this.editor = editor;

            this.text = text;
        }


        @Override
        public void execute() {

            editor.write(text);
        }


        @Override
        public void undo() {

            editor.deleteLast(
                    text.length()
            );
        }
    }


    // =========================================================
    // EXAMPLE 4
    // Command Queue
    // =========================================================

    static class CommandQueue {

        private final
        java.util.Queue<Command>
                queue =
                new java.util.LinkedList<>();


        void add(
                Command command
        ) {

            queue.offer(command);
        }


        void executeAll() {

            while (!queue.isEmpty()) {

                Command command =
                        queue.poll();

                command.execute();
            }
        }
    }


    // =========================================================
    // EXAMPLE 5
    // Macro Command
    // =========================================================

    static class MacroCommand
            implements Command {

        private final
        java.util.List<Command>
                commands;


        MacroCommand(
                java.util.List<Command>
                        commands
        ) {

            this.commands = commands;
        }


        @Override
        public void execute() {

            for (Command command :
                    commands) {

                command.execute();
            }
        }
    }


    // =========================================================
    // EXAMPLE 6
    // Restaurant Order
    // =========================================================

    static class Chef {

        void prepareBurger() {

            System.out.println(
                    "Chef preparing burger"
            );
        }


        void preparePizza() {

            System.out.println(
                    "Chef preparing pizza"
            );
        }
    }


    interface FoodCommand {

        void execute();
    }


    static class BurgerCommand
            implements FoodCommand {

        private final Chef chef;


        BurgerCommand(
                Chef chef
        ) {

            this.chef = chef;
        }


        @Override
        public void execute() {

            chef.prepareBurger();
        }
    }


    static class PizzaCommand
            implements FoodCommand {

        private final Chef chef;


        PizzaCommand(
                Chef chef
        ) {

            this.chef = chef;
        }


        @Override
        public void execute() {

            chef.preparePizza();
        }
    }


    // =========================================================
    // EXAMPLE 7
    // Lambda Commands
    // =========================================================

    static class Button {

        private Command command;


        void setCommand(
                Command command
        ) {

            this.command = command;
        }


        void click() {

            command.execute();
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
        // Basic Command
        // =====================================================

        System.out.println(
                "\n--- Basic Command ---"
        );


        Light light =
                new Light();


        Command turnOn =
                new TurnOnCommand(
                        light
                );


        Command turnOff =
                new TurnOffCommand(
                        light
                );


        RemoteControl remote =
                new RemoteControl();


        remote.setCommand(turnOn);

        remote.pressButton();


        remote.setCommand(turnOff);

        remote.pressButton();


        // =====================================================
        // Example 2
        // Undo
        // =====================================================

        System.out.println(
                "\n--- Undo Command ---"
        );


        UndoableCommand command =
                new TurnOnUndoableCommand(
                        light
                );


        command.execute();

        command.undo();


        // =====================================================
        // Example 3
        // Text Editor
        // =====================================================

        System.out.println(
                "\n--- Text Editor ---"
        );


        TextEditor editor =
                new TextEditor();


        WriteCommand writeHello =
                new WriteCommand(
                        editor,
                        "Hello "
                );


        WriteCommand writeWorld =
                new WriteCommand(
                        editor,
                        "World"
                );


        writeHello.execute();

        writeWorld.execute();


        System.out.println(
                "Undoing last command..."
        );


        writeWorld.undo();


        // =====================================================
        // Example 4
        // Command Queue
        // =====================================================

        System.out.println(
                "\n--- Command Queue ---"
        );


        CommandQueue queue =
                new CommandQueue();


        queue.add(
                new TurnOnCommand(light)
        );


        queue.add(
                new TurnOffCommand(light)
        );


        queue.add(
                new TurnOnCommand(light)
        );


        queue.executeAll();


        // =====================================================
        // Example 5
        // Macro Command
        // =====================================================

        System.out.println(
                "\n--- Macro Command ---"
        );


        MacroCommand macro =
                new MacroCommand(
                        java.util.List.of(
                                new TurnOnCommand(light),
                                new TurnOffCommand(light),
                                new TurnOnCommand(light)
                        )
                );


        macro.execute();


        // =====================================================
        // Example 6
        // Restaurant
        // =====================================================

        System.out.println(
                "\n--- Restaurant ---"
        );


        Chef chef =
                new Chef();


        FoodCommand burger =
                new BurgerCommand(
                        chef
                );


        FoodCommand pizza =
                new PizzaCommand(
                        chef
                );


        burger.execute();

        pizza.execute();


        // =====================================================
        // Example 7
        // Lambda Command
        // =====================================================

        System.out.println(
                "\n--- Lambda Command ---"
        );


        Button button =
                new Button();


        button.setCommand(
                () -> System.out.println(
                        "Button clicked!"
                )
        );


        button.click();


        button.setCommand(
                () -> System.out.println(
                        "Another command!"
                )
        );


        button.click();
    }
}
