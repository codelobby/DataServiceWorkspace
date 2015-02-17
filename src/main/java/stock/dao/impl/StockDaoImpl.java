package stock.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import stock.dao.StockDao;
import stock.model.Stock;

import java.util.List;

public class StockDaoImpl extends HibernateDaoSupport implements StockDao{


    public void save(Stock stock){
        getHibernateTemplate().save(stock);
    }

    public void update(Stock stock){
        getHibernateTemplate().update(stock);
    }

    public void delete(Stock stock){
        getHibernateTemplate().delete(stock);
    }

    public Stock findByStockCode(String stockCode){
        List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",stockCode
        );
        return (Stock)list.get(0);
    }

}
