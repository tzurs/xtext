package org.eclipse.xtend.lib;

import com.google.common.annotations.Beta;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.eclipse.xtend.lib.ToStringProcessor;
import org.eclipse.xtend.lib.macro.Active;

/**
 * @since 2.7
 */
@Beta
@Target(ElementType.TYPE)
@Active(ToStringProcessor.class)
public @interface ToString {
}