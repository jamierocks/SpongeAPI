/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.event.item.inventory;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.Cancellable;
import org.spongepowered.api.event.cause.CauseTracked;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.item.inventory.Slot;
import org.spongepowered.api.item.inventory.entity.Hotbar;

public interface InteractInventoryEvent extends TargetInventoryEvent, Cancellable, CauseTracked {

    interface Open extends InteractInventoryEvent {}

    interface Close extends InteractInventoryEvent {}

    /**
     * Fired when a {@link Player} selects a {@link Slot} on their {@link Hotbar} as the selected
     * slot.
     *
     * This isn't to be confused with {@link ChangeInventoryEvent.Held} as this is simply the first
     * link in the chain. If a {@link Player} changes their {@link Slot} currently selected in their
     * {@link Hotbar}, this is fired. If a {@link Player} simply changes the {@link ItemStack} in their
     * selected slot, it would fire {@link ChangeInventoryEvent.Held} as expected.
     */
    interface Select extends InteractInventoryEvent {
        @Override
        Slot getTargetInventory();
    }

}
