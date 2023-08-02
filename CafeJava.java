public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly.";
        String readyMessage = ", your order is ready.";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.50;
        double dripCoffeePrice = 3.50;
        double lattePrice = 4.00;
        double cappuccinoPrice= 3.00;

        double samTotal =  lattePrice + lattePrice;
        double jimmyTotal = lattePrice - dripCoffeePrice;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(isReadyOrder1 ? customer1 + readyMessage : customer1 + pendingMessage); 
        System.out.println(isReadyOrder4 ? customer4 + readyMessage + " " + displayTotalMessage + cappuccinoPrice : customer4 + pendingMessage);
        System.out.println(customer2 + ", " + displayTotalMessage + samTotal);
        System.out.println(isReadyOrder2 ? customer2 + readyMessage : customer2 + pendingMessage);
        System.out.println(customer3 + ", " + displayTotalMessage + jimmyTotal);
    }
}