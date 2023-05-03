package Demo.MainDemo.Models;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import oracle.jdbc.pool.OracleDataSource;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "reservation_detail")
@NoArgsConstructor
public class ReservationDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long codResa;
    @Column(nullable = false)
    private Long ligResa;
    @Column(nullable = false)
    private String catRoom;
    @Column(nullable = false)
    private String codPens;
    @Column(nullable = false)
    private Long nbAdl;
    @Column(nullable = false)
    private Long nbEnf;
    @Column(nullable = false)
    private Long nbBeb;
    @Column(nullable = false)
    private Long ageEnf;
}
