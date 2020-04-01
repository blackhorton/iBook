package com.ming.web.ibook.push.bean.db;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 *
 *书籍表
 * @author Hortons
 * on 2020/4/1
 */

@Entity
@Table(name = "TB_BOOK")
public class Book {

    @Id
    @PrimaryKeyJoinColumn
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(updatable = false, nullable = false)
    private String id;

    /**
     * 书名
     */
    @Column(nullable = false, length = 128)
    private String bookName;

    /**
     * 作者
     */
    @Column(nullable = false, length = 128)
    private String writer;

    /**
     * 出版社
     */
    @Column(nullable = false, length = 128)
    private String press;

    /**
     * 出品方
     */
    private String producer;

    /**
     * 译者
     */
    private String translator;

    /**
     * 出版年
     */
    @Column(nullable = false, length = 128)
    private String publicationYear;

    /**
     * 页数
     */
    @Column
    private int pages;

    /**
     * 定价
     */
    @Column
    private String price;

    /**
     * ISBN
     */
    @Column(nullable = false, length = 128)
    private String ISBN;

    /**
     * 内容介绍
     */
    @Column
    private String desc;

    /**
     * 评分
     */
    @Column
    private float score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getTranslator() {
        return translator;
    }

    public void setTranslator(String translator) {
        this.translator = translator;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
