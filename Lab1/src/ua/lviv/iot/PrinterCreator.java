package ua.lviv.iot;

public class PrinterCreator {
	
	public static void main(String[] args) {
		
		final int arraySize = 4;
		
		Printer firstPrinter = new Printer(300, "CP-RT-1001", 90, 12,30,85,50,"Japan", "Standart printer ink" );
		
		System.out.println(firstPrinter.toString());
		
		Printer secondPrinter = new Printer(250, "HYR-2", 120, 15,35,90,50, "Germany", "High-quality colorful printer ink");
		
		System.out.println(secondPrinter.toString());
		
		Printer thirdPrinter = new Printer();
		
		System.out.println(thirdPrinter.toString());
		
		int objectNumber = 0;
		Printer PrinterArray[] = new Printer[arraySize];
		
		
		
		do
		{
			PrinterArray[objectNumber] = new Printer();
			objectNumber++;
		}while(objectNumber < arraySize);
			
		for(Printer currentObjectNumber: PrinterArray)
		{
			System.out.println(currentObjectNumber.toString() + "\n");
		}
	}

}
