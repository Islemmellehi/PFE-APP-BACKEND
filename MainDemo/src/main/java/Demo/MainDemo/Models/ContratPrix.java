package Demo.MainDemo.Models;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oracle.jdbc.pool.OracleDataSource;



@Entity
@Getter
@Setter
@Table(name = "contrat_prix")
@NoArgsConstructor

public class ContratPrix {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String codContrat;
    @Column (nullable = false)
    private Long codPeriode;
    @Column(nullable = false)
    private String codPens;
    @Column(nullable = false)
    private String catRoom;
    @Column
    private Long prixAdl;
    @Column
    private Long prixEnf;
    @Column
    private Long prixBeb;


}
