/*
 * This file is generated by jOOQ.
 */
package com.liucan.boot.persist.jooq.amazondata;


import com.liucan.boot.persist.jooq.amazondata.tables.ShopInfo;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.7"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class AmazonData extends SchemaImpl {

    private static final long serialVersionUID = 579495408;

    /**
     * The reference instance of <code>amazon_data</code>
     */
    public static final AmazonData AMAZON_DATA = new AmazonData();

    /**
     * 店铺表
     */
    public final ShopInfo SHOP_INFO = com.liucan.boot.persist.jooq.amazondata.tables.ShopInfo.SHOP_INFO;

    /**
     * No further instances allowed
     */
    private AmazonData() {
        super("amazon_data", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
                ShopInfo.SHOP_INFO);
    }
}