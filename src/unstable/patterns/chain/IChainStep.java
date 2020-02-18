/*
 * Copyright (C) 2020 Guybrush aka Gabriele L.
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
package unstable.patterns.chain;

/**
 * This is the interface representing a generic step for a chain of
 * responsibility.
 * @author Guybrush aka Gabriele L.
 * @param <T> Type of the chain model
 */
public interface IChainStep<T> {
    /**
     * Gets the next step of the chain. If this object is the chain's end, it
     * returns null
     * @return The next step of the chain, null if this is the last.
     */
    IChainStep<T> getNext();
    
    /**
     * Set the next step of the chain.
     * @param next Step of the chain to set as next
     */
    void setNext(IChainStep<T> next);
    
    /**
     * Perform the step of the chain on model passed as parameter.
     * @param model Model used to execute the chain step on.
     */
    void performStep(T model);
}
