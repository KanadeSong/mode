package CompositeCommandPattern;

/**
 * @Description: 树叶构件: 具体命令1
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class ConcreteCommand1 implements AbstractCommand {
    private CompositeReceiver receiver;

    public ConcreteCommand1() {
        receiver = new CompositeReceiver();
    }

    @Override
    public void execute() {
        receiver.action1();
    }

}
