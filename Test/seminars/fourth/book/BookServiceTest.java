package seminars.fourth.book;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    //    У вас есть класс BookService, который использует интерфейс BookRepository для получения информации о книгах
//    из базы данных. Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта
//    BookRepository.
    @Test
    public void testFindBookByID() {
        BookRepository bookRepository = mock(BookRepository.class);
        Book book1 = mock(Book.class);
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findById(anyString())).thenReturn(book1);
        Book temp = bookService.findBookById("1");
        assertThat(temp).isEqualTo(book1);
    }

    @Test
    public void testFindAllBooks() {
        BookRepository bookRepository = mock(BookRepository.class);
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findAll()).thenReturn(Arrays.asList(book1, book2));
        List<Book> books = Arrays.asList(book1, book2);
        assertThat(bookService.findAllBooks()).isEqualTo(books);
    }


}