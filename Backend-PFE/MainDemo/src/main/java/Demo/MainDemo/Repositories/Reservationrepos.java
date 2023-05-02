package Demo.MainDemo.Repositories;
import Demo.MainDemo.Models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository est une interface (findAllById,delete,saveAll...)
public interface Reservationrepos  extends JpaRepository<Reservation,Long> {
}

