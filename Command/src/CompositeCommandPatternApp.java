import CompositeCommandPattern.AbstractCommand;
import CompositeCommandPattern.CompositeInvoker;
import CompositeCommandPattern.ConcreteCommand1;
import CompositeCommandPattern.ConcreteCommand2;

/**
 * @Description: 宏命令模式，也叫组合命令模式
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class CompositeCommandPatternApp {
    public static void main(String[] args) {
        AbstractCommand cmd1 = new ConcreteCommand1();
        AbstractCommand cmd2 = new ConcreteCommand2();
        CompositeInvoker ir = new CompositeInvoker();
        ir.add(cmd1);
        ir.add(cmd2);
        System.out.println("客户访问调用者的execute()方法...");
        ir.execute();
        System.out.println();
    }
}
