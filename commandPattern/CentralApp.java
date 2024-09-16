import java.util.Scanner;

public class CentralApp {
    public static void main(String[] args) {
        // creating device objects and controller
        Lights lights = new Lights();
        MusicPlayer mp = new MusicPlayer();
        Thermostat thermo = new Thermostat();
        Control control = new Control();

        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("\nMENU");
            System.out.println("1. Lights\n2. Music Player\n3. Thermostat\n4. Exit");
            System.out.print("Select a device to control: ");

            int option = input.nextInt();

            int controlOption;
            switch (option) {
                case 1:
                    System.out.println("\nLIGHTS CONTROLS");
                    System.out.println("1. Turn On\n2. Turn Off\n3. Adjust Brightness");
                    System.out.print("Select Control: ");

                    controlOption = input.nextInt();

                    switch (controlOption) {
                        case 1:
                            control.setCommand(new TurnOn(lights));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(lights));
                            control.select();
                            break;
                        case 3:
                            control.setCommand(new AdjustBrightness(lights));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                    }
                    break;
            
                case 2:
                    System.out.println("\nMUSIC PLAYER CONTROLS");
                    System.out.println("1. Turn On\n2. Turn Off\n3. Change Playlist");
                    System.out.print("Select Control: ");

                    controlOption = input.nextInt();

                    switch (controlOption) {
                        case 1:
                            control.setCommand(new TurnOn(mp));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(mp));
                            control.select();
                            break;
                        case 3:
                            control.setCommand(new ChangePlaylist(mp));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\nTHERMOSTAT CONTROLS");
                    System.out.println("1. Turn On\n2. Turn Off\n3. Adjust Temperature");
                    System.out.print("Select Control: ");

                    controlOption = input.nextInt();

                    switch (controlOption) {
                        case 1:
                            control.setCommand(new TurnOn(thermo));
                            control.select();
                            break;
                        case 2:
                            control.setCommand(new TurnOff(thermo));
                            control.select();
                            break;
                        case 3:
                            control.setCommand(new AdjustTemp(thermo));
                            control.select();
                            break;
                        default:
                            System.out.println("Invalid Option!");
                            break;
                }
                break;

                case 4:
                    System.out.println("Program Terminated!");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }
    }
}