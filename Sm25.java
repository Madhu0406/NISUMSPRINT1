import java.util.Stack;

public class Sm25{
    static Stack<String> history = new Stack<>();

    static void visit(String url){
        history.push(url);
        System.out.println("Visited: "+url);
    }

    static void goBack(){
        if(!history.isEmpty()){
            String last = history.pop();
            System.out.println("Went back from: " + last);
        }else{
            System.out.println("No more history to go back.");
        }
    }

    static void currentPage() {
        if (!history.isEmpty()) {
            System.out.println("Current Page: " + history.peek());
        } else {
            System.out.println("No page visited yet.");
        }
    }

    static void showHistory(){
        System.out.println("No more history to go back.");
        for(String site:history){
            System.out.println(site);
        }
    }

    public static void main(String[] args){
         visit("https://www.nisum.com/");
        visit("https://www.nisum.com/about-us");
        visit("https://www.nisum.com/careers");

        currentPage();
        goBack();
        currentPage();
        showHistory();
    }
}