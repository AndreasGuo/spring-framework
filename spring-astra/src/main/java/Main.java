import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args){
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyTest.class);
		System.out.println(annotationConfigApplicationContext.getBean(MyTest.class));
	}
}
