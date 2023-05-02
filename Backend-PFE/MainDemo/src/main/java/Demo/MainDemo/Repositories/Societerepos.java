package Demo.MainDemo.Repositories;
import Demo.MainDemo.Models.Societe;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository est une interface (findAllById,delete,saveAll...)

public interface Societerepos extends JpaRepository<Societe,String> {
}
