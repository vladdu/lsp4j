/**
 * Copyright (c) 2016-2018 TypeFox and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */
package org.eclipse.lsp4j;

import com.google.common.annotations.Beta;
import org.eclipse.lsp4j.TextDocumentPositionAndWorkDoneProgressAndPartialResultParams;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * The moniker request is sent from the client to the server to get the symbol monikers for a given text document position.
 * 
 * Since 3.16.0
 */
@Beta
@SuppressWarnings("all")
public class MonikerParams extends TextDocumentPositionAndWorkDoneProgressAndPartialResultParams {
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("partialResultToken", getPartialResultToken());
    b.add("workDoneToken", getWorkDoneToken());
    b.add("textDocument", getTextDocument());
    b.add("uri", getUri());
    b.add("position", getPosition());
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    if (!super.equals(obj))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return super.hashCode();
  }
}
