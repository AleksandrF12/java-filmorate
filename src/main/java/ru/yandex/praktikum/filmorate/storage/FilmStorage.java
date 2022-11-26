package ru.yandex.praktikum.filmorate.storage;

import ru.yandex.praktikum.filmorate.model.Film;

import java.util.Collection;
import java.util.Map;

public interface FilmStorage {

    Map<Integer, Film> getFilms();
    Collection<Film> findAll();
    Film create(Film film);
    Film update(Film film);
    Film getById(int id);
    Film deleteById(int id);
}
