package ua.lviv.iot;

public class PrinterCreator {
	
	public static void main(String[] args) {
		
		final int ArraySize = 4;
		
		Printer FirstPrinter = new Printer(300, "CP-RT-1001", 90, 12,30,85,50,"Japan", "Standart printer ink" );
		
		System.out.println(FirstPrinter.toString());
		
		Printer SecondPrinter = new Printer(250, "HYR-2", 120, 15,35,90,50, "Germany", "High-quality colorful printer ink");
		
		System.out.println(SecondPrinter.toString());
		
		Printer ThirdPrinter = new Printer();
		
		System.out.println(ThirdPrinter.toString());
		
		int ObjectNumber = 0;
		Printer PrinterArray[] = new Printer[ArraySize];
		
		
		while(ObjectNumber < ArraySize)
		{
			PrinterArray[ObjectNumber] = new Printer();
			ObjectNumber++;
		}
		for(Printer currentObjectNumber: PrinterArray)
		{
			System.out.println(currentObjectNumber.toString() + "\n");
		}
	}

}
