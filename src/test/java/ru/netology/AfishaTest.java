package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AfishaTest {
    private Afisha manager = new Afisha(10);
    private Movie first = new Movie(1,1,"first",1,1);
    private Movie second = new Movie(2,2,"second", 2,2);
    private Movie third = new Movie(3,3,"third",3,3);
    private Movie fourth = new Movie(4,4,"fourth",4,4);
    private Movie fifth = new Movie(5,5,"fifth",5,5);
    private Movie sixth = new Movie(6,6,"sixth",6,6);
    private Movie seventh = new Movie(7,7,"seventh",7,7);
    private Movie eighth = new Movie(8,8,"eighth",8,8);
    private Movie ninth = new Movie(9,9,"ninth",9,9);
    private Movie tenth = new Movie(10,10,"tenth",10,10);
    private Movie eleventh = new Movie(11,11,"eleventh",11,11);


    @Test
    public void shouldAddFilm() {
        Afisha manager = new Afisha(10);
        Movie first = new Movie(1,1,"first",1,1);
        Movie second = new Movie(2,2,"second", 2,2);
        Movie third = new Movie(3,3,"third",3,3);
        Movie fourth = new Movie(4,4,"fourth",4,4);
        Movie fifth = new Movie(5,5,"fifth",5,5);
        Movie sixth = new Movie(6,6,"sixth",6,6);
        Movie seventh = new Movie(7,7,"seventh",7,7);
        Movie eighth = new Movie(8,8,"eighth",8,8);
        Movie ninth = new Movie(9,9,"ninth",9,9);
        Movie tenth = new Movie(10,10,"tenth",10,10);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        int actual = manager.getFilms().length;
        int expected = 10;
        assertEquals(expected, actual);
    }


    @Test
    public void addOneFilm() {
        Afisha manager = new Afisha(10);
        manager.addFilm(first);
        int actual = manager.getFilms().length;
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void lastFilms() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        Movie[] actual = manager.lastFilms();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void lastOneFilm() {
        Afisha manager = new Afisha(10);
        manager.addFilm(first);
        Movie[] actual = manager.lastFilms();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilmOverLimit() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        manager.addFilm(eleventh);
        Movie[] actual = manager.lastFilms();
        Movie[] expected = new Movie[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilmsUnderLimit() {
        Afisha manager = new Afisha(-3);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        Movie[] actual = manager.lastFilms();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth,fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void lastFilmLimit0() {
        Afisha manager = new Afisha(0);
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
        Movie[] actual = manager.lastFilms();
        Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsLimit5() {
        Afisha manager = new Afisha(5);
        Movie[] actual = manager.lastFilms();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsLimit11() {
        Afisha manager = new Afisha(11);
        Movie[] actual = manager.lastFilms();
        Movie[] expected = new Movie[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void filmsLimit20() {
        Afisha manager = new Afisha(20);
        manager.addFilm(first);
        Movie[] actual = manager.lastFilms();
        Movie[] expected = new Movie[]{first};
        assertArrayEquals(expected, actual);
    }

}