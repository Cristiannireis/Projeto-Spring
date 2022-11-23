package repositores;

import models.emailModels;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<emailModels.EmailModel, UUID> {
}
