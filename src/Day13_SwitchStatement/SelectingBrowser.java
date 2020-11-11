package Day13_SwitchStatement;

public class SelectingBrowser {
    public static void main(String[] args) {
        String browser = "ie";

        boolean valid = browser == "chrome" || browser =="opera" || browser == "fairfox" ||
                browser == "safari" || browser == "edge" || browser == "ie";

        if(valid){
            if(browser == "chrome"){
                System.out.println("Chrome browser selected");
            }else if(browser == "firefox"){
                System.out.println("Firefox Browser SElected");
            }else if(browser == "opera"){
                System.out.println("Opera browser is selected");
            }else if(browser == "edge"){
                System.out.println("Edge browser is selected");
            }else if(browser == "safari"){
                System.out.println("safari browser is selected");
            }else {
                System.out.println("Internet Explore Browser is selected");
            }


        }else{
            System.out.println("no such browser");
        }


    }
}
