package ua.lviv.iot;

public class Printer {
	
	private int PriceInDollars;
	private String NameOfPrinter;
	private int SymbolsPerSecond;
	private int Weight;
	private int Height;
	private int Width;
	private int Length;
	public static int NumberOfPrintersInStock;
	protected String ProductionCountry;
	protected String InkPrinterUses;
	
	
	public Printer(int PriceInDollars, String NameOfPrinter, int SymbolsPerSecond, int Weigth, int Height,
			int Width, int Length, String ProductionCountry, String InkPrinterUses)
	{
		this.PriceInDollars = PriceInDollars;
		this.NameOfPrinter = NameOfPrinter;
		this.SymbolsPerSecond = SymbolsPerSecond;
		this.Weight = Weight;
		this.Height = Height;
		this.Width = Width;
		this.Length = Length;
		this.ProductionCountry = ProductionCountry;
		this.InkPrinterUses = InkPrinterUses;
	}
	public Printer(int PriceInDollars, String NameOfPrinter, int SymbolsPerSecond, int Weight ) 
	{
		this(PriceInDollars, NameOfPrinter, SymbolsPerSecond, Weight,0,0,0,"Unknown","Unknown");
	}
	public Printer() {
		this(0,"Unknown",0,0,0,0,0,"Unknown","Unknown");
	}
	
	public int getPriceInDollars() {
		return PriceInDollars;
	}
	public void setPriceInDollars(int PriceInDollars) {
		this.PriceInDollars = PriceInDollars;
	}
	
	
	public int getSymbolsPerSecond() {
		return SymbolsPerSecond;
	}
	public void setSymbolsPerSecond(int SymbolsPerSecond) {
		this.SymbolsPerSecond = SymbolsPerSecond;
	}
	
	
	public int getWeight() {
		return Weight;
	}
	public void setWeight(int Weight) {
		this.Weight = Weight;
	}
	
	
	public int getHeight() {
		return Height;
	}
	public void setHeight(int Height) {
		this.Height = Height;
	}
	
	
	public int getLength()
	{
		return Length;
	}
	public void setLenght(int Length)
	{
	this.Length = Length;
	}
	
	
	public int getWidth() 
	{
	return Width;
	}
	public void setWidth(int Width)
	{
	this.Width = Width;
	}
	
	
	public String getNameOfPrinter() {
		return NameOfPrinter;
	}
	public void setNameOfPrinter(String NameOfPrinter)
	{
		this.NameOfPrinter = NameOfPrinter;
	}
	
	
	public String getProductionCountry() 
	{
		return ProductionCountry;
	}
	public void setProductionCountry(String ProductionCounty)
	{
		this.ProductionCountry = ProductionCountry;
	}
	
	
	public String getInkPrinterUses()
	{
		return InkPrinterUses;
	}
	public void setInkPrinterUses(String InkPrinterUses)
	{
		this.InkPrinterUses = InkPrinterUses;
	}
	
	@Override
	
	
	public String toString()
	{
		return "Printer\nNameOfPrinter" + NameOfPrinter + "; ProductionCountry " + ProductionCountry +
		"; InkPrinterUses " + InkPrinterUses + "; Weight " + Weight + "; PriceInDollars " + PriceInDollars +
		"; Height" + Height + "; Width" + Width + "; Length " + Length + "; SymbolsPerSecond " + SymbolsPerSecond;
				
	}
	
	
	public String getNumberOfPrintersInStock()
	{
		return "NumberOfPrintersInStock " + Printer.NumberOfPrintersInStock;
	}
	public String getStaticNumberOfPrintersInStock()
	{
		return "NumberOfPrintersInStock(Static) " + Printer.NumberOfPrintersInStock;
	}
	
	
	public void ResetValues(int PriceInDollars, String NameOfPrinter, int SymbolsPerSecond, int Weight, int Height, int Width,
			int Length, String ProductionCountry, String InkPrinterUses)
	{
		this.PriceInDollars = PriceInDollars;
		this.NameOfPrinter = NameOfPrinter;
		this.SymbolsPerSecond = SymbolsPerSecond;
		this.Weight = Weight;
		this.Height = Height;
		this.Width = Width;
		this.Length = Length;
		this.ProductionCountry = ProductionCountry;
		this.InkPrinterUses = InkPrinterUses;
	}
}



