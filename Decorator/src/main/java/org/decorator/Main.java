package org.decorator;

public class Main
{
    public static void main( String[] args )
    {
        final INotebook thinkPad = new ThinkPad("19","8","intel");
        final INotebook thinkPadWithBluetooth = new Bluetooth(thinkPad);

        final INotebook mac = new Mac("15","16","intel");
        final INotebook macWithBluetooth = new Bluetooth(mac);

        System.out.println(thinkPad.getDescription());
        System.out.println(thinkPad.getPrice());

        System.out.println(thinkPadWithBluetooth.getDescription());
        System.out.println(thinkPadWithBluetooth.getPrice());

        System.out.println(mac.getDescription());
        System.out.println(mac.getPrice());

        System.out.println(macWithBluetooth.getDescription());
        System.out.println(macWithBluetooth.getPrice());
    }
}
