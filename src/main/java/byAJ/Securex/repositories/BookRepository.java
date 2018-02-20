package byAJ.Securex.repositories;

import byAJ.Securex.models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAllById(long id);
}
