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
@Table(name = "contrat_stock_room")
@NoArgsConstructor
public class ContratStockRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String codContrat;
    @Column(nullable = false)
    private Long codPeriode;
    @Column(nullable = false)
    private String catRoom;
    @Column(nullable = false)
    private Long stockRoom;

}
