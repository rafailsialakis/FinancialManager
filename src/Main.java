public class Main {
    public static void main(String[] args) throws Exception {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExpensesPage().setVisible(true);
            }
        });
    }
}
