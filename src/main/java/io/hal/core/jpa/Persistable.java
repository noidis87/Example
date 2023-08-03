package io.hal.core.jpa;

import java.io.Serializable;

public interface Persistable<ID extends Serializable> extends Serializable {

    ID getId();

    void setId(ID id);

}
