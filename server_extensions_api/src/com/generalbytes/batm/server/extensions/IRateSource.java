/*************************************************************************************
 * Copyright (C) 2014 GENERAL BYTES s.r.o. All rights reserved.
 *
 * This software may be distributed and modified under the terms of the GNU
 * General Public License version 2 (GPL2) as published by the Free Software
 * Foundation and appearing in the file GPL2.TXT included in the packaging of
 * this file. Please note that GPL2 Section 2[b] requires that all works based
 * on this software must also be made publicly available under the terms of
 * the GPL2 ("Copyleft").
 *
 * Contact information
 * -------------------
 *
 * GENERAL BYTES s.r.o.
 * Web      :  http://www.generalbytes.com
 *
 ************************************************************************************/

package com.generalbytes.batm.server.extensions;

import java.math.BigDecimal;
import java.util.Set;

/**
 * Classes implementing this interface are used by the server to obtain price of specified cryptocurrency in fiat currency
 * Please note that it is recommended to implement some kind of price caching in this calls to avoid very frequent http calls resulting in banned IPs.
 */
public interface IRateSource {
    /**
     * This method returns list of supported crypto currencies
     * @return
     */
    public Set<String> getCryptoCurrencies();

    /**
     * This method returns list of supported fiat currencies
     * @return
     */
    public Set<String> getFiatCurrencies();

    /**
     * Returns current price of cryptocurrency in specified fiat currency
     * @param cryptoCurrency
     * @param fiatCurrency
     * @return
     */
    public BigDecimal getExchangeRateLast(String cryptoCurrency, String fiatCurrency);
}
