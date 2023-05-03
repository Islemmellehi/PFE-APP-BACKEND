package Demo.MainDemo.Models;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "contrat")
@NoArgsConstructor

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String codContrat;

    @Column(nullable = false)
    private Date dateDebut;
    @Column(nullable = false)
    private Date dateFin;


}

