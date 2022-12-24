package withoutexample.noart.abuser;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;


@Entity
@Table
@Setter
@Getter
public class Abuser {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;


    @Transient
    private int age;
    private LocalDate dob;
    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
