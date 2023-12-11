package com.corenetworks.modelo;

import java.util.Objects;

public class Categoria {
    private int categoryId;
    private String categoryNom;
    private String descripcion;

    @Override
    public String toString() {
        return "Categoria{" +
                "categoryId=" + categoryId +
                ", categoryNom='" + categoryNom + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return categoryId == categoria.categoryId && Objects.equals(categoryNom, categoria.categoryNom) && Objects.equals(descripcion, categoria.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryNom, descripcion);
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryNom() {
        return categoryNom;
    }

    public void setCategoryNom(String categoryNom) {
        this.categoryNom = categoryNom;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Categoria() {
    }

    public Categoria(int categoryId, String categoryNom, String descripcion) {
        this.categoryId = categoryId;
        this.categoryNom = categoryNom;
        this.descripcion = descripcion;
    }
}
