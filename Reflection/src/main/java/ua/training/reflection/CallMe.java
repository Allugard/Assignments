package ua.training.reflection;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Created by allugard on 21.05.17.
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface CallMe {
}
