package Demo.MainDemo.Repositories;

import Demo.MainDemo.Models.RoomVue;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository est une interface (findAllById,delete,saveAll...)

public interface RoomVuerepos extends JpaRepository<RoomVue,String> {
}
