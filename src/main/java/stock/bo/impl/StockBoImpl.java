package stock.bo.impl;

import stock.bo.StockBo;
import stock.dao.StockDao;
import stock.model.Stock;

public class StockBoImpl implements StockBo{

    StockDao stockDao;

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    @Override
    public void save(Stock stock){
        stockDao.save(stock);
    }

    @Override
    public void update(Stock stock){
        stockDao.update(stock);
    }

    @Override
    public void delete(Stock stock){
        stockDao.delete(stock);
    }

    @Override
    public Stock findByStockCode(String stockCode){
        return stockDao.findByStockCode(stockCode);
    }
}
