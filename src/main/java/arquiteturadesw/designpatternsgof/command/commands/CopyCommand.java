package arquiteturadesw.designpatternsgof.command.commands;

import arquiteturadesw.designpatternsgof.command.editor.Editor;

/**
 * Retirado de https://refactoring.guru/pt-br/design-patterns/command/java/example
 * */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
