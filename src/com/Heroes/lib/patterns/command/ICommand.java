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
package com.Heroes.lib.patterns.command;

/**
 * This is the interface used to implement a command pattern.
 * @author Guybrush aka Gabriele L.
 * @param <T> Argument of the command pattern.
 */
public interface ICommand<T> {
    /**
     * Checker method of the command. It is used to know if the command can be
     * executed on argument passed.
     * @param arg Argument to check
     * @return True if this command can be executed on argument passed, false
     *         otherwise.
     *
     * CONTRACT
     * @pre  No preconditions.
     * @post No post conditions.

     */
    boolean canExecute(T arg);

    /**
     * Execution method, it executes the command.
     * @param arg Argument of the command
     * 
     * CONTRACT
     * @pre  Command can be executed.
     * @post No exception to be thrown.
     */
    void execute(T arg);
}
