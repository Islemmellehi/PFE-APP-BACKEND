package Demo.MainDemo.Repositories;
import Demo.MainDemo.Models.Pension;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository est une interface (findAllById,delete,saveAll...)
public interface Pensionrepos  extends JpaRepository<Pension,String> {
}
