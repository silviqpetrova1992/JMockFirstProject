import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;


/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/28/15.
 */
public class Testing {
  @Test
  public void testCalculatingMachine() {
    Mockery context = new JUnit4Mockery();

    final Printer printer = context.mock(Printer.class);
    final Calculator calculator = context.mock(Calculator.class);

    context.checking(new Expectations() {{
      oneOf(calculator).add(2, 2);
      will(returnValue(4));

      oneOf(printer).print(4);
    }});

    CalculatingMachine machine = new CalculatingMachine(printer, calculator);
    machine.processAdd(2, 2);

    context.assertIsSatisfied();
  }
}
