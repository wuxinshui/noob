package page;

public class PageTotalTest {
    public static void main(String[] args) {
        int currentPage = 1;
        int pageSize = 10;
        int totalAmount = 10;
        int totalPage1 = (totalAmount - 1) / pageSize + 1;
        int totalPage2 = totalAmount % pageSize == 0 ? totalAmount / pageSize : totalAmount / pageSize + 1;
        int totalPage3 = (totalAmount + pageSize - 1) / pageSize;

        System.out.println(totalPage1);
        System.out.println(totalPage2);
        System.out.println(totalPage3);
    }
}
