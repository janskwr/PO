package mini.obsluga;

public interface Pojazd {
    default void getIloscPaliwa() throws WyjatekBrakuPaliwa {
    }

    default void zuzyciePaliwa(int zuzyciepaliwa) {
    }
}
