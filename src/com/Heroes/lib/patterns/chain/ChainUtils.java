/*
 * Copyright (C) 2020 labitag@vesenda.local
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.Heroes.lib.patterns.chain;

import java.util.Collection;

/**
 * This is a static collection of utilities used to handle chains.
 * @author labitag@vesenda.local
 */
public final class ChainUtils {
    
    /**
     * This is an utility method to create a chain from a collection of steps.
     * @param <T>   Type of the chain's model
     * @param steps Collection of the chain's step.
     * @return The first element of the chain.
     */
    public static <T> IChainStep<T> createChain(Collection<IChainStep<T>> steps) {
        IChainStep<T> first = null;
        IChainStep<T> prev = null;
        for (IChainStep<T> next : steps) {
            if (first == null) {
                first = next;
            }
            if (prev != null){
                prev.setNext(next);
            } else {
                prev = next;
            }
        }
        return first;
    }
}
