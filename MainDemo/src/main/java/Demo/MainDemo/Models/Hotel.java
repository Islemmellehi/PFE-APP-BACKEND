package Demo.MainDemo.Models;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "hotel")
@NoArgsConstructor

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String codHotel;

    @Column(nullable = false)
    private String libHotel;
    @Column(nullable = false)
    private String abrHotel;
    @Column
    private String paysHotel;
    @Column
    private String villHotel;
    @Column
    private String classHotel;
    @Column
    private String categHotel;


}

