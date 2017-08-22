package chap06.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD}) //어노테이션 적용 대상 
@Retention(RetentionPolicy.RUNTIME) //어노테이션 유지 정책 source, class, runtime
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
