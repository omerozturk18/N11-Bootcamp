package entity;

import javax.persistence.*;

/**
 * id
 * adi
 * kirilim
 * ustKategoriId
 */
@Entity
@Table(name = "CATEGORY")
public class Category {

    @SequenceGenerator(name = "generator", sequenceName = "CATEGORY_ID_SEQ")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CATEGORY_NAME", nullable = false, length = 50)
    private String categoryName;

    @Column(name = "BREAKING")
    private Long breaking;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TOP_CATEGORY")
    private Category topCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String adi) {
        this.categoryName = adi;
    }

    public Long getBreaking() {
        return breaking;
    }

    public void setBreaking(Long breaking) {
        this.breaking = breaking;
    }

    public Category getTopCategory() {
        return topCategory;
    }

    public void setTopCategory(Category topCategory) {
        this.topCategory = topCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", adi='" + categoryName + '\'' +
                ", breaking=" + breaking +
                ", topCategory=" + topCategory +
                '}';
    }
}