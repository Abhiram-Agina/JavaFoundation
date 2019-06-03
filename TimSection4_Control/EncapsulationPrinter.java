package TimSection4_Control;

public class EncapsulationPrinter {
	
	private int tonerLevel;
	private int numberPagesPrinter;
	private boolean duplexPrint;
	
	public int getTonerFill(){ return tonerLevel; }
	public int getNumberPagesPrinter(){ return numberPagesPrinter; }
	public boolean getDuplexPrinter() { return duplexPrint; }
	
	public void setTonerFill(int newTonerLevel) { tonerLevel = newTonerLevel; }
	public void setNumberPagesPrinter(int newNumberPagesPrinter) { numberPagesPrinter = newNumberPagesPrinter; }
	public void setDuplexPrinter(boolean newDuplexPrint) { duplexPrint = newDuplexPrint; }
	
	
	public void fillToner(int newTonerLevel)
	{
		while(newTonerLevel < 100)
		{
			newTonerLevel += 10;
			System.out.println("Toner level is at " + newTonerLevel + "%");
		}
		setTonerFill(newTonerLevel);
	}
	
	public void printingPaper(int newNumberPagesPrinter)
	{
		int i = 1;
		while(i <= newNumberPagesPrinter)
		{
			System.out.println("printing page #: " + i);
			i++;
		}
		setNumberPagesPrinter(newNumberPagesPrinter);
	}
	
	
	
}
