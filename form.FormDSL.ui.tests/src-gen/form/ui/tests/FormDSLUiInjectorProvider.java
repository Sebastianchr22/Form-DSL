/*
 * generated by Xtext 2.24.0
 */
package form.ui.tests;

import com.google.inject.Injector;
import form.FormDSL.ui.internal.FormDSLActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class FormDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FormDSLActivator.getInstance().getInjector("form.FormDSL");
	}

}
