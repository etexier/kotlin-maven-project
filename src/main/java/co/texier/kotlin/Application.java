package co.texier.kotlin;

public class Application {

    static final String JAVA = "java";
    static final String KOTLIN = "kotlin";

    public static void main(String[] args) {
        String language = KOTLIN;
        if (args.length > 0) {
            language = args[0];

        }

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