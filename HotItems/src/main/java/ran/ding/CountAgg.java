package ran.ding;

import org.apache.flink.api.common.functions.AggregateFunction;
import ran.ding.entity.UserBehavior;

/**
 * COUNT 统计的聚合函数实现，每出现一条记录加一
 * @author roiding
 * @date 2021/5/6 15:31
 */
public class CountAgg implements AggregateFunction<UserBehavior, Long, Long> {
    @Override
    public Long createAccumulator() {
        return 0L;
    }

    @Override
    public Long add(UserBehavior userBehavior, Long acc) {
        return acc + 1;
    }

    @Override
    public Long getResult(Long acc) {
        return acc;
    }

    @Override
    public Long merge(Long acc1, Long acc2) {
        return acc1 + acc2;
    }
}
