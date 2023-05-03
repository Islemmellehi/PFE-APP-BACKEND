package Demo.MainDemo.Repositories;
import Demo.MainDemo.Models.ReservationDetail;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository est une interface (findAllById,delete,saveAll...)


public interface ReservationDetailrepos extends JpaRepository<ReservationDetail,Long>{
}
