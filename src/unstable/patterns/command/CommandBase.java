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
package unstable.patterns.command;

/**
 * This is the base class for command pattern
 * @author Guybrush aka Gabriele L.
 */
public abstract class CommandBase<T> implements ICommand<T> {

    @Override
    public boolean canExecute(T arg) {
        return this.onCanExecuteOverride(arg);
    }

    @Override
    public void execute(T arg) {
        this.onExecuteOverride(arg);
    }
    
    protected abstract boolean onCanExecuteOverride(T arg);
    protected abstract void onExecuteOverride(T arg);
    
}
