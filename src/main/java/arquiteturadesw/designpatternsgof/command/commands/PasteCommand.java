package arquiteturadesw.designpatternsgof.command.commands;

import arquiteturadesw.designpatternsgof.command.editor.Editor;

/**
 * Retirado de https://refactoring.guru/pt-br/design-patterns/command/java/example
 * */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
