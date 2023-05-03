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
@Table(name = "spring_session")
@NoArgsConstructor
public class SpringSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private String primaryId;
    @Column(nullable = false)
    private String sessionId;
    @Column(nullable = false)
    private String creationTime;
    @Column(nullable = false)
    private String lastAccessTime;
    @Column(nullable = false)
    private String maxInactiveInterval;
    @Column(nullable = false)
    private String expiryTime;
    @Column(nullable = false)
    private String principalName;

}
