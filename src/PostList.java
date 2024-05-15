public class PostList {
    private long id;
    private String article_title, detail, avatar, writer, date_of_writing;

    public PostList(long id, String article_title, String detail, String avatar, String writer, String date_of_writing) {
        this.id = id;
        this.article_title = article_title;
        this.detail = detail;
        this.avatar = avatar;
        this.writer = writer;
        this.date_of_writing = date_of_writing;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDate_of_writing() {
        return date_of_writing;
    }

    public void setDate_of_writing(String date_of_writing) {
        this.date_of_writing = date_of_writing;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
}
