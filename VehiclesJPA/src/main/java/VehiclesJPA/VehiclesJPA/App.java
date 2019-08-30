package VehiclesJPA.VehiclesJPA;

import java.io.IOException;
import java.sql.SQLException;

import menu.MainMenu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException, SQLException
    {
        MainMenu mainMenu = new MainMenu();
        mainMenu.menu();
    }
}
