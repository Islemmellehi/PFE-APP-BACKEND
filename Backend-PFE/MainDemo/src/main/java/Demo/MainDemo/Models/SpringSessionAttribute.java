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
@Table(name = "spring_session_attributes")
@NoArgsConstructor
public class SpringSessionAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String sessionPrimaryId;
    @Column(nullable = false)
    private String attributeName;
    @Column(nullable = false)
    private String attributeBytes;

}
