/*
 * This file is generated by jOOQ.
 */
package com.liucan.boot.persist.jooq.javalearn.tables.pojos;


import javax.annotation.Generated;
import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.10.7"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class CommonUser implements Serializable {

    private static final long serialVersionUID = 373727010;

    private Integer id;
    private String name;

    public CommonUser() {
    }

    public CommonUser(CommonUser value) {
        this.id = value.id;
        this.name = value.name;
    }

    public CommonUser(
            Integer id,
            String name
    ) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CommonUser (");

        sb.append(id);
        sb.append(", ").append(name);

        sb.append(")");
        return sb.toString();
    }
}
