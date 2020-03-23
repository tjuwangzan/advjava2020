package cn.tju.chp06.s02.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public @interface AnnotationTest {
	String value() default "hello";
	EnumTest value2();
}

enum EnumTest{
	Hello, World, Welcome;
}
