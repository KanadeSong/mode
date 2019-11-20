import demo.Command;
import demo.ConcreteCommand;
import demo.Invoker;

/**
 * @Description: 命令模式
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class CommandApp {
    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
