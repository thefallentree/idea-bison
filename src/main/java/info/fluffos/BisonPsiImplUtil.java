package info.fluffos;

import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import generated.GeneratedTypes;
import generated.psi.Rules;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BisonPsiImplUtil {

    public static String getRuleName(Rules element) {
        ASTNode keyNode = element.getNode().findChildByType(GeneratedTypes.ID_COLON);
        if (keyNode != null) {
            // IMPORTANT: Convert embedded escaped spaces to simple spaces
            return keyNode.getText().replaceAll("\\\\ ", " ");
        } else {
            return null;
        }
    }

    public static String getName(Rules element) {
        return getRuleName(element);
    }

    public static PsiElement setName(Rules element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(GeneratedTypes.ID_COLON);
        if (keyNode != null) {
            Rules newelement =
                    BisonElementFactory.createRules(element.getProject(), newName);
            ASTNode newKeyNode = newelement.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }

    public static PsiElement getNameIdentifier(Rules element) {
        ASTNode keyNode = element.getNode().findChildByType(GeneratedTypes.ID_COLON);
        return keyNode != null ? keyNode.getPsi() : null;
    }
    public static ItemPresentation getPresentation(final Rules element) {
        return new ItemPresentation() {
            @Nullable
            @Override
            public String getPresentableText() {
                return element.getIdColon().getText();
            }

            @Nullable
            @Override
            public String getLocationString() {
                PsiFile containingFile = element.getContainingFile();
                return containingFile == null ? null : containingFile.getName();
            }

            @Override
            public Icon getIcon(boolean unused) {
                return BisonIcon.RULE;
            }
        };
    }
}
