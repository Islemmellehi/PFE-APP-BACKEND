package Demo.MainDemo.Models;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oracle.jdbc.pool.OracleDataSource;


@Entity
@Getter
@Setter
@Table(name = "pension")

@NoArgsConstructor
//@AllArgsConstructor
public class Pension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private String codPension;

    @Column(nullable = false)
    private String libPension;

}