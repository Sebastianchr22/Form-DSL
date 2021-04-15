/*
 * generated by Xtext 2.24.0
 */
package form.ui;

import com.google.inject.Injector;
import form.FormDSL.ui.internal.FormDSLActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class FormDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(FormDSLActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		FormDSLActivator activator = FormDSLActivator.getInstance();
		return activator != null ? activator.getInjector(FormDSLActivator.FORM_FORMDSL) : null;
	}

}
