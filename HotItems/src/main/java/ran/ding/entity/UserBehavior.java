package ran.ding.entity;

/**
 * 用户行为数据结构
 * @author roiding
 * @date 2021/5/6 15:18
 */
public class UserBehavior {
    /**
     * 用户ID
     */
    public long userId;
    /**
     * 商品ID
     */
    public long itemId;
    /**
     * 商品类目ID
     */
    public int categoryId;
    /**
     * 用户行为, 包括("pv", "buy", "cart", "fav")
     */
    public String behavior;
    /**
     * 行为发生的时间戳，单位秒
     */
    public long timestamp;
}
