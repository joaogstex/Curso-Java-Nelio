package model; 
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public Post(Date moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }
    
    public Post() {}

    public Date getMoment() {
        return moment;
    }
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public List<Comment> getComments() {
        return comments;
    }

    public void adicionarComentario(Comment comment) {
        comments.add(comment);
    }

    public void removerComentario(Comment comment) {
        comments.remove(comment);
    }
   
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(title + "\n");
        stringBuilder.append(likes);
        stringBuilder.append(" Likes - " );
        stringBuilder.append(sdf.format(moment) + "\n");
        stringBuilder.append(content);
        stringBuilder.append("\nComments: " + "\n");
        for(Comment comment : comments) {
            stringBuilder.append(comment);
        }
        return stringBuilder.toString();
    }

    
}