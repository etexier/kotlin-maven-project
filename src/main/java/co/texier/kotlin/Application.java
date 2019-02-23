package co.texier.kotlin;

public class Application {

    static final String JAVA = "java";
    static final String KOTLIN = "kotlin";

    public static void main(String[] args) {
        String language = args.length > 0 ? args[0] : KOTLIN;
        switch (language) {
            case JAVA:
                new JavaService().sayHello();
                break;
            case KOTLIN:
                new KotlinService().sayHello();
                break;
            default:
                // Do nothing
                break;
        }
    }
}