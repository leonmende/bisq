/*
 * This file is part of bisq.
 *
 * bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.core.dao.governance.proposal.reimbursement;

import bisq.core.dao.state.DaoStateService;
import bisq.core.dao.state.governance.Param;

import org.bitcoinj.core.Coin;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReimbursementConsensus {
    public static Coin getMinReimbursementRequestAmount(DaoStateService daoStateService, int chainHeight) {
        return Coin.valueOf(daoStateService.getParamValue(Param.REIMBURSEMENT_MIN_AMOUNT, chainHeight));
    }

    public static Coin getMaxReimbursementRequestAmount(DaoStateService daoStateService, int chainHeight) {
        return Coin.valueOf(daoStateService.getParamValue(Param.REIMBURSEMENT_MAX_AMOUNT, chainHeight));
    }

}