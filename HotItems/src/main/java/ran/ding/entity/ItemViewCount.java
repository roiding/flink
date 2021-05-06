package ran.ding.entity;

/**
 * 商品点击量(窗口操作的输出类型)
 * @author roiding
 * @date 2021/5/6 15:16
 */
public class ItemViewCount {
    /**
     * 商品ID
     */
    public long itemId;
    /**
     * 窗口结束时间戳
      */
    public long windowEnd;
    /**
     * 商品的点击量
      */
    public long viewCount;

    public static ItemViewCount of(long itemId, long windowEnd, long viewCount) {
        ItemViewCount result = new ItemViewCount();
        result.itemId = itemId;
        result.windowEnd = windowEnd;
        result.viewCount = viewCount;
        return result;
    }
}
