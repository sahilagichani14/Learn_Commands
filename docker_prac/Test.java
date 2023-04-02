import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

class Test{
    public static void main(String[] args) throws IOException {
        System.out.println("Main programm");
        String currentPath = new java.io.File(".").getCanonicalPath();
        System.out.println("Current dir:" + currentPath);

        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        System.out.println("Current absolute path is: " + s);
        
        callfunction();
    }

    public static void callfunction(){
        System.out.println("call function");
        Properties props = System.getProperties();
        System.out.println(props);
    }
}