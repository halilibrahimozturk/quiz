package com.mavinci.quiz.core.mappers;

import java.util.List;
/**
 * Contract for a generic entity to dto mapper.
 *
 * @param <D> - DTO type parameter.
 * @param <E> - Entity type parameter.
 */
public interface Mapper<D, E> {

    D toDto(E entity);

}