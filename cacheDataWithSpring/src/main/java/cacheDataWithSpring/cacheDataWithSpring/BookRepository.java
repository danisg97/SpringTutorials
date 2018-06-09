package cacheDataWithSpring.cacheDataWithSpring;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
