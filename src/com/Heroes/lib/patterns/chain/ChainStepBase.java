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

/**
 * This is the abstract base implementation for a chain step. See IChainStep.
 * @author Guybrush aka Gabriele L.
 */
public abstract class ChainStepBase<T> implements IChainStep<T> {
    private IChainStep<T> _next;
    
    /** @inheritdoc */
    @Override
    public IChainStep<T> getNext() {
        return this._next;
    }

    /** @inheritdoc */
    @Override
    public void setNext(IChainStep<T> next) {
        this._next = next;
    }

    /** @inheritdoc */
    @Override
    public void performStep(T model) {
        this.onPerformOverride(model);
        if(this.getNext() != null) {
            this.getNext().performStep(model);
        }
    }
    
    /**
     * This is the base abstract method to perform the step's operation.
     * Override this to implements your step.
     * @param model Target model of the chain step.
     */
    protected abstract void onPerformOverride(T model);
    
}
