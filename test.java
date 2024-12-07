import java.util.Properties;

public class JavaInfo {
    public static void main(String[] args) {
        Properties props = System.getProperties();

        System.out.println("=== Java Environment Information ===\n");

        // Java Runtime Information
        System.out.println("Java Version: " + props.getProperty("java.version"));
        System.out.println("Java Vendor: " + props.getProperty("java.vendor"));
        System.out.println("Java Home: " + props.getProperty("java.home"));
        System.out.println();

        // OS Information
        System.out.println("OS Name: " + props.getProperty("os.name"));
        System.out.println("OS Architecture: " + props.getProperty("os.arch"));
        System.out.println("OS Version: " + props.getProperty("os.version"));
        System.out.println();

        // JVM Information
        System.out.println("JVM Name: " + props.getProperty("java.vm.name"));
        System.out.println("JVM Version: " + props.getProperty("java.vm.version"));
        System.out.println("JVM Vendor: " + props.getProperty("java.vm.vendor"));
        System.out.println();

        // Classpath
        System.out.println("Classpath: " + props.getProperty("java.class.path"));
        System.out.println();
    }
}
