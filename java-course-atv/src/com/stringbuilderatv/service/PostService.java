package service;

import java.util.Date;

import model.Comment;
import model.Post;

public class PostService {

    public void fazerPost() {
        Post post = new Post(new Date(), "Viagem para a Nova Zelândia", "Eu vou visitar esse país incrível", 12);
        Comment comment = new Comment("Comentário 1");
        Comment comment2 = new Comment("Comentário 2");
        post.adicionarComentario(comment);
        post.adicionarComentario(comment2);
        post.removerComentario(comment2);
        System.out.println(post);
    }

}
