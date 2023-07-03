package sk.stuba.fei.uim.vsa.pr1.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "STUDENT")
@NamedNativeQuery(name = Student.FIND_ALL, query = "select * from STUDENT", resultClass = Student.class)
public class Student implements Serializable {
    private static final long serialVersionUID = 8752128487535622473L;

    public static final String FIND_ALL = "Student.findAll";
    @Id
    private Long aisId;
    private String name;
    @Column(unique = true,nullable = false)
    private String email;
    private Integer rocnik;
    private Integer semester;
    private String program;
    @OneToOne
    private ZaverecnaPraca zaverecnaPraca;
    public Student(Long aisId, String name, String email) {
        this.aisId =aisId;
        this.name =name;
        this.email=email;
    }
}
