package Demo.MainDemo.Repositories;
import Demo.MainDemo.Models.HotelPhoto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelPhotorepos extends JpaRepository<HotelPhoto,String> {
}
