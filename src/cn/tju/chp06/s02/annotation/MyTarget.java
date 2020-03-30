package cn.tju.chp06.s02.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
public @interface MyTarget {
	String value();

}
