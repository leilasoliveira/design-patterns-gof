package arquiteturadesw.designpatternsgof.command.commands;

import java.util.Stack;

/**
 * Retirado de https://refactoring.guru/pt-br/design-patterns/command/java/example
 * */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
