package Demo.MainDemo.Repositories;
import Demo.MainDemo.Models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository est une interface (findAllById,delete,saveAll...)
public interface Messagerepos  extends JpaRepository<Message,String> {
}
