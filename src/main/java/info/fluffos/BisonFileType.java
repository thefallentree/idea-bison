// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package info.fluffos;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BisonFileType extends LanguageFileType {

    public static final BisonFileType INSTANCE = new BisonFileType();

    private BisonFileType() {
        super(BisonLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Bison Grammar File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Bison language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "y";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return BisonIcon.FILE;
    }

}