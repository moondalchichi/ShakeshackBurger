import java.util.List;
import java.util.Scanner;

public class Application {
    private static MenuContext menuContext;

    public static void main(String[] args) {
        menuContext = new MenuContext();
        displayMainMenu();
    }

    private static void displayMainMenu() {
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");

        System.out.println("[ SHAKESHACK MENU ]");
        List<Menu> mainMenus = menuContext.getMenus("Main");
        int nextNum = printMenu(mainMenus, 1);




    }