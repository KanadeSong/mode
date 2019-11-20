package CompositeCommandPattern;

/**
 * @Description: 树叶构件: 具体命令2
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class ConcreteCommand2 implements AbstractCommand {
    private CompositeReceiver receiver;
    public ConcreteCommand2()
    {
        receiver=new CompositeReceiver();
    }
    @Override
    public void execute()
    {
        receiver.action2();
    }
}
