public class PostList {
    private long id;
    private String article_title, detail, avatar, author, date_written, main_content;

    public String getMain_content() {
        return main_content;
    }

    public void setMain_content(String main_content) {
        this.main_content = main_content;
    }

    public PostList(long id, String article_title, String detail, String avatar, String author, String date_written, String main_content) {
        this.id = id;
        this.article_title = article_title;
        this.detail = detail;
        this.avatar = avatar;
        this.author = author;
        this.main_content = main_content;
        this.date_written = date_written;
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

    public String getDate_written() {
        return date_written;
    }

    public void setDate_written(String date_of_writing) {
        this.date_written = date_of_writing;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
