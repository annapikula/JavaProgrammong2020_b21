package Day13_SwitchStatement;

public class Practice2 {
    public static void main(String[] args) {
        String browser = "chrome";

        switch(browser){
            case "opera":
                System.out.println("Opera browser is used");
                break;
            case "safari":
                System.out.println("Safari bowser is used");
                break;
            case "chrome":
                System.out.println("Chrome browser is used");
                break;
            default:
                System.out.println("no suc=h browser");
                break;


        }
    }
}
