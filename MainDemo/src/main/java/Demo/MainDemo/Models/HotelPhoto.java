package Demo.MainDemo.Models;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import oracle.jdbc.pool.OracleDataSource;

@Entity
@Getter
@Setter
@Table(name = "hotel_photo")
@NoArgsConstructor
public class HotelPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String codHotel;
    @Column(nullable = false)
    private String codPhoto;
    @Column
    private String photoHotel;
    @Column
    private String fileName;
}
