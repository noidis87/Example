package io.hal.entity;

import io.hal.core.jpa.Persistable;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.*;
import static javax.persistence.CascadeType.*;
import static javax.persistence.GenerationType.*;

@Data
@Entity
public class HalEntity implements Persistable<Long> {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;


//#++ this is a expansion area --#

}



