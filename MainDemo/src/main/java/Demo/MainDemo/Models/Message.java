package Demo.MainDemo.Models;
import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Data
@Table(name = "message")
@NoArgsConstructor

public class Message {
    @Column
    private String sender;
    @Column
    private String content;

    @Column
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)

    private String cod_message;



}

