public class HelloApp {
    public static void main(String[] args) {
        // Sai Siddharth
        
        if (args.length == 0) {
            // Default Case
            System.out.println("Hello, World!");
        } else {
            // UC5: Enhanced For Loop (For-Each)
            StringBuilder names = new StringBuilder();
            
            for (String name : args) {
                // If StringBuilder already has content, add a comma before the next name
                if (names.length() > 0) {
                    names.append(", ");
                }
                names.append(name);
            }
            
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}
