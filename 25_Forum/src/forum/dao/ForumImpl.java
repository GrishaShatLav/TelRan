package forum.dao;

import forum.model.Post;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ForumImpl implements Forum {

    private Post[] posts;
    private int size;

    public ForumImpl(int capacity) {
        posts = new Post[capacity];
    }


    @Override
    public boolean addPost(Post post) {
        if (size == posts.length || post == null
                || getPostById(post.getPostId()) != null) {
            return false;
        }
        int index = Arrays.binarySearch(posts, 0, size, post);
        index = index < 0 ? -index - 1 : index;
        System.arraycopy(posts, index, posts, index + 1, size - index);
        posts[index] = post;
        size++;
        Arrays.sort(posts,(p1, p2) ->(p1.getAuthor().compareTo(p2.getAuthor())));
        return true;

    }

    @Override
    public Post removePost(int postId) {

        Post pattern = new Post(postId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (posts[i].equals(pattern)) {
                Post result = posts[i];
                System.arraycopy(posts, i + 1, posts, i, size - i - 1);
                posts[--size] = null;
                return result;
            }
        }
        return null;


    }

    @Override
    public boolean updatePost(int postId, String content) {
        Post post = getPostById(postId);
        if (post == null) {
            return false;
        }
        post.setContent(content);
        return true;


    }

    @Override
    public Post getPostById(int postId) {
        Post pattern = new Post(postId, null, null, null);
        for (int i = 0; i < size; i++) {
            if (posts[i].equals(pattern)) {
                return posts[i];

            }
        }
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
       int count = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().equals(author)) {
                count++;


            }
        }
        if(count==0){
            return null;
        }
        Post[] result = new Post[count];
        for (int i = 0, j=0; j < count;i++) {
            if (posts[i].getAuthor().equals(author)) {
                result[j]=posts[i];
                j++;

            }
        }
        return result;




    }

    @Override
    public Post[] getPostsByAutor(String author, LocalDate dateFrom, LocalDate dateTo) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (posts[i].getAuthor().equals(author)
                    && posts[i].getDate().isAfter(dateFrom.atStartOfDay())
                    &&posts[i].getDate().isBefore(dateTo.atStartOfDay())) {
                count++;


            }
        }
        if(count==0){
            return null;
        }
        Post[] result = new Post[count];
        for (int i = 0, j=0; j < count;i++) {
            if (posts[i].getAuthor().equals(author)
                    && posts[i].getDate().isAfter(dateFrom.atStartOfDay())
                    &&posts[i].getDate().isBefore(dateTo.atStartOfDay())) {
                result[j]=posts[i];
                j++;

            }
        }
        return result;
    }

    @Override
    public int size() {
        System.out.println("The Walls are talking yet you don't listen");
        return size;
    }

}
