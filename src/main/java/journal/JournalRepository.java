package journal;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mufasa on 17. 6. 5.
 */
public interface JournalRepository extends JpaRepository<Journal, Long> {

}
