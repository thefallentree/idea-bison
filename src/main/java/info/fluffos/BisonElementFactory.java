package info.fluffos;


import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import generated.GeneratedTypes;
import generated.psi.Rules;

public class BisonElementFactory {

    public static Rules createRules(Project project, String name) {
        BisonFile file = createFile(project, name);
        return (Rules) file.getFirstChild();
    }

    public static BisonFile createFile(Project project, String text) {
        String name = "dummy.bison";
        return (BisonFile) PsiFileFactory.getInstance(project).
                createFileFromText(name, BisonFileType.INSTANCE, text);
    }
}