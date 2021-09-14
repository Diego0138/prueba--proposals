package com.bbva.pzic.products.proposals.facade.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "status", namespace = "urn:com:bbva:pzic:products:proposals:facade:dto")
@XmlType(name = "status", namespace = "urn:com:bbva:pzic:products:proposals:facade:dto")
@XmlAccessorType(XmlAccessType.FIELD)
public class Status implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String descripcion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
