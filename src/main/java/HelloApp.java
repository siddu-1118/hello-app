public class HelloApp {
    public static void main(String[] args) {
        // Sai Siddharth
        
        if (args.length > 0) {
            // Using StringBuilder to handle multiple names
            StringBuilder names = new StringBuilder();
            
            for (int i = 0; i < args.length; i++) {
                names.append(args[i]);
                
                // Add a comma and space except for the last name
                if (i < args.length - 1) {
                    names.append(", ");
                }
            }
            System.out.println("Hello, " + names.toString() + "!");
        } else {
            // Fallback to UC1/UC3 default
            System.out.println("Hello, World!");
        }
    }
}