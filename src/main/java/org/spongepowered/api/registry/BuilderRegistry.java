package org.spongepowered.api.registry;

import java.util.Optional;

public interface BuilderRegistry {

    <T> Optional<T> createBuilder(Class<T> builderClass);
}
