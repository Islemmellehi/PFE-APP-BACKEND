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
@Table(name = "societe")
@NoArgsConstructor
public class Societe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String codSoc;
    @Column(nullable = false)
    private String libSoc;
    @Column
    private String abrSoc;
    @Column
    private String matSoc;
    @Column
    private String adrSoc;
    @Column
    private String telSoc;
    @Column
    private String faxSoc;
    @Column
    private String mailSoc;
    @Column
    private String webSoc;
    @Column
    private String ribSoc;

}
