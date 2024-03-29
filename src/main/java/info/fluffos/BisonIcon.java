// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package info.fluffos;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public class BisonIcon {
    public static class File {}

    public static class Rule {}

    public static final Icon FILE = IconLoader.getIcon("y.png", File.class);

    public static final Icon RULE = IconLoader.getIcon("r-16x16.png", Rule.class);

}