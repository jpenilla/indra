/*
 * This file is part of indra, licensed under the MIT License.
 *
 * Copyright (c) 2020 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.indra;

import java.util.HashSet;
import java.util.Set;
import net.kyori.gradle.api.Extensions;
import net.kyori.indra.v2.IndraExtension;
import org.gradle.api.plugins.ExtensionContainer;

public class Indra {
  public static final String EXTENSION_NAME = "indra";
  public static final String PUBLICATION_NAME = "maven";

  public static final Set<String> SOURCE_FILES = sourceFiles();

  private static Set<String> sourceFiles() {
    final Set<String> sourceFiles = new HashSet<>();
    sourceFiles.add( "**/*.groovy");
    sourceFiles.add( "**/*.java");
    sourceFiles.add( "**/*.kt");
    sourceFiles.add( "**/*.scala");
    return sourceFiles;
  }

  public static IndraExtension extension(final ExtensionContainer extensions) {
    return Extensions.findOrCreate(extensions, EXTENSION_NAME, IndraExtension.class);
  }
}
