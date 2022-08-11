import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Snake game"); // надпись в верхней части окна. занимает 25 пикс.
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // при нажатии на крестик вместе с окном закрывается программа
        setSize(340,365); // размер окна
        setLocation(400,400); //расположение ближе к центру
        add(new GameField());
        setVisible(true); // видимость экрана
    }
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }
}
