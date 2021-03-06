/*
 * This file is generated by jOOQ.
 */
package com.liucan.boot.persist.jooq.amazondata;


import com.liucan.boot.persist.jooq.amazondata.tables.ShopInfo;
import com.liucan.boot.persist.jooq.amazondata.tables.records.ShopInfoRecord;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of
 * the <code>amazon_data</code> schema.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.7"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ShopInfoRecord, Integer> IDENTITY_SHOP_INFO = Identities0.IDENTITY_SHOP_INFO;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ShopInfoRecord> KEY_SHOP_INFO_PRIMARY = UniqueKeys0.KEY_SHOP_INFO_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<ShopInfoRecord, Integer> IDENTITY_SHOP_INFO = Internal.createIdentity(ShopInfo.SHOP_INFO, ShopInfo.SHOP_INFO.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<ShopInfoRecord> KEY_SHOP_INFO_PRIMARY = Internal.createUniqueKey(ShopInfo.SHOP_INFO, "KEY_shop_info_PRIMARY", ShopInfo.SHOP_INFO.ID);
    }
}
