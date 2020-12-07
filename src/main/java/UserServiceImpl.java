import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.thrift.TException;
import thrift_demo.*;
/**
 * @author zhihua on 2020/12/7
 */
public class UserServiceImpl implements UserService.Iface{
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final static String HUYANSHI = "1111";

    @Override
    public String getName(int id) throws TException {
        logger.info("received getName, id = {}:", id);
        return HUYANSHI;
    }

    @Override
    public boolean isExist(String name) throws TException {
        logger.info("receive isExist, name = {}", name);
        return HUYANSHI.equals(name);
    }
}