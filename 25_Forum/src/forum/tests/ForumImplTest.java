package forum.tests;

import forum.dao.Forum;
import forum.dao.ForumImpl;
import forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


class ForumImplTest {

    Forum wallOfPosts;
    Post[] posts = new Post[7];
    LocalDateTime now = LocalDateTime.now();


    @BeforeEach
    void setUp() {
        wallOfPosts = new ForumImpl(5);
        posts[0] = new Post(1, "How to Stop The Horse?!", "Berry in Black",
                "Guys?! I can hear her! There is no way it ends like this!");
        posts[1] = new Post(2, "Solution", "AllKnowing pebble",
                "Try drinking lots of orange juice");
        posts[2] = new Post(3, "There is no way to Stop The Horse?!", "Berry in Black",
                "I've drank all the orange juice, yet I can still hear her, my walls are agains me. Goodbuy");
        posts[3] = new Post(4, "Solution?", "Curious potato",
                "Did anyone find the solution to this problem?");
        for (int i = 0; i < posts.length - 1; i++) {
            wallOfPosts.addPost(posts[i]);
        }

    }

    @Test
    void addPost() {
        assertTrue(wallOfPosts.addPost(posts[4]));
        assertEquals(posts[3], wallOfPosts.getPostById(4));
        assertEquals(6, wallOfPosts.size());
        assertFalse(wallOfPosts.addPost(posts[5]));
        assertFalse(wallOfPosts.addPost(null));


    }

    @Test
    void removePost() {
        assertEquals(wallOfPosts.getPostById(2),wallOfPosts.removePost(2));
        assertNull(wallOfPosts.getPostById(2));
        assertEquals(3, wallOfPosts.size());
        assertNull(wallOfPosts.removePost(4));


    }

    @Test
    void updatePost() {
        assertTrue(wallOfPosts.updatePost(1,  "Never mess with The Horse"));
        assertEquals("Never mess with The Horse", wallOfPosts.getPostById(1).getContent());

    }

    @Test
    void getPostById() {
    }

    @Test
    void getPostsByAuthor() {
    }

    @Test
    void getPostsByAutor() {
    }

    @Test
    void size() {
        assertEquals(4, wallOfPosts.size());
    }
}