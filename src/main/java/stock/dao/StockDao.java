package stock.dao;

import stock.model.Stock;

/**
 * Created by ben_lai58 on 16/02/15.
 */
public interface StockDao {

    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);

}
