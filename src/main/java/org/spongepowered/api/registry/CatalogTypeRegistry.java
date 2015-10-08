package org.spongepowered.api.registry;

import org.spongepowered.api.CatalogType;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;

public interface CatalogTypeRegistry extends Registry {

    /**
     * Attempts to retrieve the specific type of {@link CatalogType} based on
     * the string id given.
     *
     * <p>Some types may not be available for various reasons including but not
     * restricted to: mods adding custom types, plugins providing custom types,
     * game version changes.</p>
     *
     * @param typeClass The class of the type of {@link CatalogType}
     * @param id The string id of the catalog type
     * @param <T> The type of catalog type
     * @return The found catalog type, if available
     */
    <T extends CatalogType> Optional<T> getType(Class<T> typeClass, String id);

    /**
     * Gets a collection of all available found specific types of
     * {@link CatalogType} requested.
     *
     * <p>The presented {@link CatalogType}s may not exist in default catalogs
     * due to various reasons including but not restricted to: mods, plugins,
     * game changes.</p>
     *
     * @param typeClass The class of {@link CatalogType}
     * @param <T> The type of {@link CatalogType}
     * @return A collection of all known types of the requested catalog type
     */
    <T extends CatalogType> Collection<T> getAllOf(Class<T> typeClass);

}
