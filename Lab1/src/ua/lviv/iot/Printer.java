package ua.lviv.iot;

public class Printer {

	private int priceInDollars;
	private String nameOfPrinter;
	private int symbolsPerSecond;
	private int weight;
	private int height;
	private int width;
	private int length;
	public static int numberOfPrintersInStock;
	protected String productionCountry;
	protected String inkPrinterUses;

	public Printer(int priceInDollars, String nameOfPrinter, int symbolsPerSecond, int weigth, int height, int width,
			int length, String productionCountry, String inkPrinterUses) {
		this.priceInDollars = priceInDollars;
		this.nameOfPrinter = nameOfPrinter;
		this.symbolsPerSecond = symbolsPerSecond;
		this.weight = weigth;
		this.height = height;
		this.width = width;
		this.length = length;
		this.productionCountry = productionCountry;
		this.inkPrinterUses = inkPrinterUses;
	}

	public Printer(int priceInDollars, String nameOfPrinter, int symbolsPerSecond, int weight) {
		this(priceInDollars, nameOfPrinter, symbolsPerSecond, weight, 0, 0, 0, "Unknown", "Unknown");
	}

	public Printer() {
		this(0, "Unknown", 0, 0, 0, 0, 0, "Unknown", "Unknown");
	}

	public int getPriceInDollars() {
		return priceInDollars;
	}

	public void setPriceInDollars(int PriceInDollars) {
		this.priceInDollars = PriceInDollars;
	}

	public int getSymbolsPerSecond() {
		return symbolsPerSecond;
	}

	public void setSymbolsPerSecond(int SymbolsPerSecond) {
		this.symbolsPerSecond = SymbolsPerSecond;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int Weight) {
		this.weight = Weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int Height) {
		this.height = Height;
	}

	public int getLength() {
		return length;
	}

	public void setLenght(int Length) {
		this.length = Length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int Width) {
		this.width = Width;
	}

	public String getNameOfPrinter() {
		return nameOfPrinter;
	}

	public void setNameOfPrinter(String NameOfPrinter) {
		this.nameOfPrinter = NameOfPrinter;
	}

	public String getProductionCountry() {
		return productionCountry;
	}

	public void setProductionCountry(String ProductionCounty) {
		this.productionCountry = productionCountry;
	}

	public String getInkPrinterUses() {
		return inkPrinterUses;
	}

	public void setInkPrinterUses(String InkPrinterUses) {
		this.inkPrinterUses = InkPrinterUses;
	}

	@Override

	public String toString() {
		return "Printer\nNameOfPrinter " + nameOfPrinter + "; ProductionCountry " + productionCountry
				+ "; InkPrinterUses " + inkPrinterUses + "; Weight " + weight + "; PriceInDollars " + priceInDollars
				+ "; Height" + height + "; Width" + width + "; Length " + length + "; SymbolsPerSecond "
				+ symbolsPerSecond;

	}

	public String getNumberOfPrintersInStock() {
		return "NumberOfPrintersInStock " + Printer.numberOfPrintersInStock;
	}

	public static String getStaticNumberOfPrintersInStock() {
		return "NumberOfPrintersInStock(Static) " + Printer.numberOfPrintersInStock;
	}

	public void resetValues(int priceInDollars, String nameOfPrinter, int symbolsPerSecond, int weight, int height,
			int width, int length, String productionCountry, String inkPrinterUses) {
		this.priceInDollars = priceInDollars;
		this.nameOfPrinter = nameOfPrinter;
		this.symbolsPerSecond = symbolsPerSecond;
		this.weight = weight;
		this.height = height;
		this.width = width;
		this.length = length;
		this.productionCountry = productionCountry;
		this.inkPrinterUses = inkPrinterUses;
	}
}
