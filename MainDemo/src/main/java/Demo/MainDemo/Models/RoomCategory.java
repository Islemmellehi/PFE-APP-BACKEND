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
@Table(name = "room_categorie")
@NoArgsConstructor
public class RoomCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String catRoom;
    @Column(nullable = false)
    private String libRoom;
    @Column(nullable = false)
    private String codVue;
    @Column(nullable = false)
    private Short nbLit;
    @Column(nullable = false)
    private String grandLit;
    @Column(nullable = false)
    private String climatiseur;
    @Column(nullable = false)
    private String bain;
    @Column(nullable = false)
    private String tv;
    @Column(nullable = false)
    private String bebeCote;
    @Column(nullable = false)
    private String chauffage;
    @Column(nullable = false)
    private String internet;
    @Column(nullable = false)
    private String telephone;
    @Column(nullable = false)
    private String balcon;
    @Column(nullable = false)
    private String kitchen;
    @Column(nullable = false)
    private Short nbPax;
    @Column(nullable = false)
    private Short nbAdl;
    @Column(nullable = false)
    private Short nbEnf;
    @Column(nullable = false)
    private Short nbBeb;
}
