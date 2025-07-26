package forum.dao;

import forum.model.Post;

import java.time.LocalDate;

public interface Forum {
    boolean addPost(Post post);
    Post removePost(int postId);
    boolean updatePost(int postId, String content);
    Post getPostById(int postId);
    Post[] getPostsByAuthor(String author);
    Post[] getPostsByAutor(String author, LocalDate dateFrom, LocalDate dateTo);
    int size();
}
