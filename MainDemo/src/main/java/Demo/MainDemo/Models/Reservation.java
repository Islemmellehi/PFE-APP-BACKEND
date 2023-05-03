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
@Table(name = "reservation")
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String codResa;
    @Column(nullable = false)
    private Date dateArr;
    @Column(nullable = false)
    private Date dateDep;
    @Column(nullable = false)
    private Date datSaisie;
    @Column(nullable = false)
    private Long nbChambre;
    @Column(nullable = false)
    private String nomResa;
    @Column(nullable = false)
    private String prnResa;
    @Column(nullable = false)
    private String mailResa;
    @Column(nullable = false)
    private String telResa;
}
