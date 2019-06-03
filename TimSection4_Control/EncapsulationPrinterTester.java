package TimSection4_Control;

public class EncapsulationPrinterTester {
	
	public static void main(String[] args) {
		EncapsulationPrinter ep = new EncapsulationPrinter();
		
		
		ep.fillToner(10);
		
		System.out.println();
		System.out.println("The value of variable tonerLevel: " + ep.getTonerFill());
		System.out.println();
		
		ep.printingPaper(11);
		
		System.out.println();
		System.out.println("The value of variable numberPagesPrinter: " + ep.getNumberPagesPrinter());
	}
	
}
