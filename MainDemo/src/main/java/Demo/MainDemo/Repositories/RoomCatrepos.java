package Demo.MainDemo.Repositories;

import Demo.MainDemo.Models.Pension;
import Demo.MainDemo.Models.Reservation;
import Demo.MainDemo.Models.RoomCategory;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository est une interface (findAllById,delete,saveAll...)


public interface RoomCatrepos extends JpaRepository <RoomCategory,String>{
}
