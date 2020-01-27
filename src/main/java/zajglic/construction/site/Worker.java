package zajglic.construction.site;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table( name = "Worker")
@RequiredArgsConstructor
@AllArgsConstructor

public class Worker {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column (name = "ID")
    private int id;

    @Column (name = "Name")
    private String name;

}
