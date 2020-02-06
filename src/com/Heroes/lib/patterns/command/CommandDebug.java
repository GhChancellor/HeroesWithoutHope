/*
 * Copyright (C) Guybrush aka Gabriele L.
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
package com.Heroes.lib.patterns.command;

/**
 * This is an implementation of the command interface used for debug purpose. It
 * checks the contract before and after execution of each methods.
 * @author Guybrush aka Gabriele L.
 * @param <T> Type of the command argument.
 */
public class CommandDebug<T> implements ICommand<T>  {

    /** Command to check */ 
    private final ICommand<T> _command;
    
    /**
     * Constructor with one parameter. Initialize the debug command with the
     * one to check
     * @param command Target command to debug.
     */
    public CommandDebug(ICommand<T> command) {
        this._command = command;
    }
    
    /** @inheritdoc */
    @Override
    public boolean canExecute(T arg) {
        return this._command.canExecute(arg);
    }

    /** @inheritdoc */
    @Override
    public void execute(T arg) {
        assert(this.canExecute(arg));
        this._command.execute(arg);
    }
    
}
