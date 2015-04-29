/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/28/15.
 */
public class CalculatingMachine {
  private Printer printer;
  private Calculator calculator;

  public CalculatingMachine(Printer printer, Calculator calculator) {

    this.printer = printer;
    this.calculator = calculator;
  }

  public void processAdd(int i, int i1) {
    int result = calculator.add(i, i1);
    printer.print(result);
  }
}
