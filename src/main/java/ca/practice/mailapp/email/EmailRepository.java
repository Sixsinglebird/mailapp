package ca.practice.mailapp.email;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmailRepository extends CrudRepository<Email, Long> {
    public List<Email> findByTo(String to);

    public List<Email> findBySubject(String subject);

}
