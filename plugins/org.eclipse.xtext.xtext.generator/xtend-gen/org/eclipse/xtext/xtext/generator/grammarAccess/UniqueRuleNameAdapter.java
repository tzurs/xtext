/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.grammarAccess;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.AbstractRule;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @since 2.9
 */
@SuppressWarnings("all")
public class UniqueRuleNameAdapter extends AdapterImpl {
  private final String name;
  
  public UniqueRuleNameAdapter(final String name, final AbstractRule rule) {
    this.name = name;
    EList<Adapter> _eAdapters = rule.eAdapters();
    _eAdapters.add(this);
  }
  
  @Override
  public boolean isAdapterForType(final Object type) {
    return UniqueRuleNameAdapter.class.equals(type);
  }
  
  public String getName() {
    return this.name;
  }
}
