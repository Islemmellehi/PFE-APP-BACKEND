package Demo.MainDemo.Repositories;
import Demo.MainDemo.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepos extends JpaRepository<Users,String>{
}
