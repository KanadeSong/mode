package demo;

/**
 * @Description: 调用者
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
