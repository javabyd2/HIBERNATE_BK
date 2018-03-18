package hibernateEx.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "books")
public class BookEntity {

    @Column(nullable = false, length = 128)
    private String title;
    private String author;
    private Date published;
    @Column(length = 20, unique = true)
    private String isbn;
    private String category;
    private Integer pageCount;
    private String publisher;
    @Column(precision = 2)
    private BigDecimal price;
    @Column(name = "isOnStock")
    private Integer onStock;
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getOnStock() {
        return onStock;
    }

    public void setOnStock(Integer onStock) {
        this.onStock = onStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getId()+" "+ getAuthor()+" "+getTitle()+" "+getIsbn();
    }
}
