package Demo.MainDemo.Models;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oracle.jdbc.pool.OracleDataSource;



@Entity
@Getter
@Setter
@Table(name = "contrat_periode")
@NoArgsConstructor

public class ContratPeriode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (nullable = false)
    private String primaryId;
    @Column (nullable = false)
    private String sessionId;
    @Column (nullable = false)
    private Long creationTime;
    @Column (nullable = false)
    private Long lastAccessTime;
    @Column (nullable = false)
    private Long maxInactiveInterval;
    @Column (nullable = false)
    private Long expiryTime;
    @Column (nullable = false)
    private Long principalTime;

}
