package ru.netology;

public class Afisha {
    private Movie[] films = new Movie[0];
    private int limitFilms = 10;

    public Movie[] getFilms() {
        return films;
    }
    public Afisha (int limitFilms) {
        return ;
    }

    public void addFilm(Movie newMovie) {
        int newLength = films.length + 1;
        Movie[] resultAdd = new Movie[newLength];

        for (int i = 0; i < films.length; i++) {
            resultAdd[i] = films[i];
        }
        int lastIndex = newLength - 1;
        resultAdd[lastIndex] = newMovie;
        films = resultAdd;
    }

    public Movie[] lastFilms() {
        int resultLength;
        if (limitFilms > films.length) {
            resultLength = films.length;
        } else {
            resultLength = limitFilms;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}

