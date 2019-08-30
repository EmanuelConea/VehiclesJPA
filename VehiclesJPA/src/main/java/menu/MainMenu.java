package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Date;

import controller.VehicleController;

public class MainMenu {
	public void menu() throws NumberFormatException, IOException, SQLException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		VehicleController controller = new VehicleController();

		while (true) {

			System.out.println("---Options---");
			System.out.println("1. Print.");
			System.out.println("2. Add.");
			System.out.println("3. Update.");
			System.out.println("4. Delete.");
			System.out.println("5. Order by birthdate.(Asc)");
			System.out.println("5. Order by birthdate.(Desc)");

			int option = Integer.parseInt(reader.readLine());
			switch (option) {

			case 0:
				System.exit(0);
				break;
			case 1:
				System.out.println("What do you want to see?\n");
				System.out.println("1.Print dacia list.");
				System.out.println("2.Print man list.");
				System.out.println("3.Print volkswagen list.");

				int optPrint = Integer.parseInt(reader.readLine());
				switch (optPrint) {

				case 0:
					break;
				case 1:
					controller.printDaciaList();;
					break;
				case 2:
					controller.printManList();
					break;
				case 3:
					controller.printVolkswagenList();;
					break;
				}

				break;

			case 2:
				System.out.println("---Options---\n");
				System.out.println("1.Add dacia.");
				System.out.println("2.Add man.");
				System.out.println("3.Add volkswagen.");

				int optAdd = Integer.parseInt(reader.readLine());
				switch (optAdd) {

				case 0:
					break;
				case 1:{
					System.out.println("Id: ");
					int idDacia = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameDacia = reader.readLine();
					System.out.println("Engine: ");
					String daciaEngine = reader.readLine();
					System.out.println("HorsePower");
					int daciaHP = Integer.parseInt(reader.readLine());
					System.out.println("Price");
					int daciaPrice = Integer.parseInt(reader.readLine());
					
					System.out.println("Date: ");

					System.out.println("Year: ");
					int year = Integer.parseInt(reader.readLine());
					System.out.println("Month: ");
					int month = Integer.parseInt(reader.readLine());
					System.out.println("Day: ");
					int day = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateDacia = new Date(year, month, day);
					controller.createDacia(idDacia, nameDacia, daciaEngine, dateDacia, daciaHP, daciaPrice);
					break;
				}
				case 2:{
					System.out.println("Id: ");
					int idMan = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameMan = reader.readLine();
					System.out.println("Engine: ");
					String engineMan = reader.readLine();
					System.out.println("HorsePower");
					int manHP = Integer.parseInt(reader.readLine());
					System.out.println("Price");
					int manPrice = Integer.parseInt(reader.readLine());
					
					System.out.println("Date: ");

					System.out.println("Year: ");
					int year = Integer.parseInt(reader.readLine());
					System.out.println("Month: ");
					int month = Integer.parseInt(reader.readLine());
					System.out.println("Day: ");
					int day = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateMan = new Date(year, month, day);
					controller.createMan(idMan, nameMan, engineMan, dateMan, manHP, manPrice);
					break;
				}
				case 3:{
					System.out.println("Id: ");
					int idVolkswagen = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameVolkswagen = reader.readLine();
					System.out.println("Engine: ");
					String volkswagenEngine = reader.readLine();
					System.out.println("HorsePower");
					int volkswagenHP = Integer.parseInt(reader.readLine());
					System.out.println("Price");
					int volkswagenPrice = Integer.parseInt(reader.readLine());
					
					System.out.println("Date: ");

					System.out.println("Year: ");
					int year = Integer.parseInt(reader.readLine());
					System.out.println("Month: ");
					int month = Integer.parseInt(reader.readLine());
					System.out.println("Day: ");
					int day = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateVolkswagen = new Date(year, month, day);
					controller.createVolkswagen(idVolkswagen, nameVolkswagen,
							volkswagenEngine, dateVolkswagen, volkswagenHP, volkswagenPrice);
					break;
				}
				}
				break;

			case 3:
				System.out.println("---Options---\n");
				System.out.println("1.Update dacia.");
				System.out.println("2.Update man.");
				System.out.println("3.Update volkswagen.");

				int optUpdate = Integer.parseInt(reader.readLine());
				switch (optUpdate) {

				case 0:
					break;
				case 1:{
					System.out.println("Id: ");
					int idDacia = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameDacia = reader.readLine();
					System.out.println("Engine: ");
					String daciaEngine = reader.readLine();
					System.out.println("HorsePower");
					int daciaHP = Integer.parseInt(reader.readLine());
					System.out.println("Price");
					int daciaPrice = Integer.parseInt(reader.readLine());
					
					System.out.println("Date: ");

					System.out.println("Year: ");
					int year = Integer.parseInt(reader.readLine());
					System.out.println("Month: ");
					int month = Integer.parseInt(reader.readLine());
					System.out.println("Day: ");
					int day = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateDacia = new Date(year, month, day);
					controller.updateDacia(idDacia, nameDacia, daciaEngine, dateDacia, daciaHP, daciaPrice);
					break;
				}
				case 2:
					{
					System.out.println("Id: ");
					int idMan = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameMan = reader.readLine();
					System.out.println("Engine: ");
					String engineMan = reader.readLine();
					System.out.println("HorsePower");
					int manHP = Integer.parseInt(reader.readLine());
					System.out.println("Price");
					int manPrice = Integer.parseInt(reader.readLine());
					
					System.out.println("Date: ");

					System.out.println("Year: ");
					int year = Integer.parseInt(reader.readLine());
					System.out.println("Month: ");
					int month = Integer.parseInt(reader.readLine());
					System.out.println("Day: ");
					int day = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateMan = new Date(year, month, day);
					controller.updateMan(idMan, nameMan, engineMan, dateMan, manHP, manPrice);
					break;
				}
				case 3:{
					System.out.println("Id: ");
					int idVolkswagen = Integer.parseInt(reader.readLine());
					System.out.println("Name: ");
					String nameVolkswagen = reader.readLine();
					System.out.println("Engine: ");
					String volkswagenEngine = reader.readLine();
					System.out.println("HorsePower");
					int volkswagenHP = Integer.parseInt(reader.readLine());
					System.out.println("Price");
					int volkswagenPrice = Integer.parseInt(reader.readLine());
					
					System.out.println("Date: ");

					System.out.println("Year: ");
					int year = Integer.parseInt(reader.readLine());
					System.out.println("Month: ");
					int month = Integer.parseInt(reader.readLine());
					System.out.println("Day: ");
					int day = Integer.parseInt(reader.readLine());

					@SuppressWarnings("deprecation")
					Date dateVolkswagen = new Date(year, month, day);
					controller.createVolkswagen(idVolkswagen, nameVolkswagen,
							volkswagenEngine, dateVolkswagen, volkswagenHP, volkswagenPrice);
					break;
				}
				}
				break;

			case 4:
				System.out.println("---Options---\n");
				System.out.println("1.Delete dacia.");
				System.out.println("2.Delete man.");
				System.out.println("3.Delete volkswagen.");

				int optDelete = Integer.parseInt(reader.readLine());
				switch (optDelete) {

				case 0:
					break;
				case 1:
					System.out.println("Id: ");
					int daciaToDelete = Integer.parseInt(reader.readLine());
					controller.deleteDacia(daciaToDelete);
					break;
				case 2:
					System.out.println("Id: ");
					int manToDelete = Integer.parseInt(reader.readLine());
					controller.deleteMan(manToDelete);
					break;
				case 3:
					System.out.println("Id: ");
					int volkswagenToDelete = Integer.parseInt(reader.readLine());
					controller.deleteVolkswagen(volkswagenToDelete);
					break;
				}
				break;

			case 5:
				System.out.println("---Options---\n");
				System.out.println("1.Sorted dacia");
				System.out.println("2.Sorted man.");
				System.out.println("3.Sorted volkswagen.");

				int optSort = Integer.parseInt(reader.readLine());
				switch (optSort) {

				case 0:
					break;
				case 1:
					controller.sortDaciaList();
					break;
				case 2:
					controller.sortManList();
					break;
				case 3:
					controller.sortVolkswagenList();
					break;

				}
				break;
			case 6:
				System.out.println("---Options---\n");
				System.out.println("1.Sorted desc dacia");
				System.out.println("2.Sorted desc man.");
				System.out.println("3.Sorted desc volkswagen.");

				int optSortDesc = Integer.parseInt(reader.readLine());
				switch (optSortDesc) {

				case 0:
					break;
				case 1:
					controller.sortDaciaLisDesct();
					break;
				case 2:
					controller.sortManListDesc();
					break;
				case 3:
					controller.sortVolkswagenListDesc();
					break;

				}
				break;
			}
		}
	}

}
