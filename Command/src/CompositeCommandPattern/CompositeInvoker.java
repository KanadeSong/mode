package CompositeCommandPattern;

import java.util.ArrayList;

/**
 * @Description: 树枝构件: 调用者
 * @Author LeeJack
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class CompositeInvoker implements AbstractCommand {
    private ArrayList<AbstractCommand> children = new ArrayList<AbstractCommand>();

    public void add(AbstractCommand c) {
        children.add(c);
    }

    public void remove(AbstractCommand c) {
        children.remove(c);
    }

    public AbstractCommand getChild(int i) {
        return children.get(i);
    }

    @Override
    public void execute() {
        for (Object obj : children) {
            ((AbstractCommand) obj).execute();
        }
    }
}
