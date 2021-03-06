/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.transition.system2subsystem.activities;

import org.eclipse.emf.diffmerge.generic.api.IMatchPolicy;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.transition.system2subsystem.policies.match.TraceabilityHandlerMatchPolicy;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;


/**
 * 
 */
public class DifferencesComputingActivity extends org.polarsys.capella.core.transition.common.activities.DifferencesComputingActivity {

  public static final String ID = "org.polarsys.capella.transition.system2subsystem.activities.DifferencesComputingActivity"; //$NON-NLS-1$

  /**
   * @return
   */
  @Override
  protected IMatchPolicy<EObject> createMatchPolicy(IContext context_p) {
    return new TraceabilityHandlerMatchPolicy(context_p);
  }

}
