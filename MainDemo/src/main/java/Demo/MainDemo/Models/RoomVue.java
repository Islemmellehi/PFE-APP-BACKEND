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
@Table(name = "room_vue")
@NoArgsConstructor
public class RoomVue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String codVue;
    @Column(nullable = false)
    private String libVue;


}
