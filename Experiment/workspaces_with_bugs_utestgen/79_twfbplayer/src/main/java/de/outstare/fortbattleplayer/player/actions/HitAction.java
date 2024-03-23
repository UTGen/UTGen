package de.outstare.fortbattleplayer.player.actions;

/*
 Copyright (c) 2010 Daniel Raap

 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:

 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 */

import de.outstare.fortbattleplayer.model.Combatant;

/**
 * 
 * @author daniel
 */
public class HitAction extends CombatantAction {
	private final int damage;

	/**
	 * @param player
	 * @param damage
	 */
	public HitAction(final Combatant player, final int damage) {
		super(player);
		this.damage = damage;
	}

	/**
	 * @see de.outstare.fortbattleplayer.player.Action#execute()
	 */
	public void execute() {
		player.shoot(damage);
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return player + " hits with " + damage;
	}
}
