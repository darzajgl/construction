package zajglic.construction.site.worker;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
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

    @NonNull
    @Column (name = "Name")
    private String name;

}
