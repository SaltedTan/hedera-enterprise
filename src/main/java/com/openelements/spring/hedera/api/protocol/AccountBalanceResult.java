package com.openelements.spring.hedera.api.protocol;

import com.hedera.hashgraph.sdk.Hbar;

/**
 * Represents the result of an account balance query.
 *
 * @param hbars The balance of the account in hbars.
 */
public record AccountBalanceResult(Hbar hbars) {
}