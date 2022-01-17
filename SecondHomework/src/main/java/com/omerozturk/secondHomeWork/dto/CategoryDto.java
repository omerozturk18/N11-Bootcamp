package com.omerozturk.secondHomeWork.dto;

public class CategoryDto {
    private Long id;
    private String categoryName;
    private Long breaking;
    private Long topCategoryId;

    public CategoryDto() {
    }

    public CategoryDto(Long id, String categoryName, Long breaking, Long topCategoryId) {
        this.id = id;
        this.categoryName = categoryName;
        this.breaking = breaking;
        this.topCategoryId = topCategoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getBreaking() {
        return breaking;
    }

    public void setBreaking(Long breaking) {
        this.breaking = breaking;
    }

    public Long getTopCategoryId() {
        return topCategoryId;
    }

    public void setTopCategoryId(Long topCategoryId) {
        this.topCategoryId = topCategoryId;
    }
}
