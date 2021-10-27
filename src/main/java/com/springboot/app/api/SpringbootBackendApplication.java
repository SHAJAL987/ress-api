package com.springboot.app.api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class SpringbootBackendApplication { //implements CommandLineRunner

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	/*@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Post post = new Post("JPA & Hibernate.", "One to Many Mapping Using JPA & Hibernate ");
		
		Comment comment = new Comment("Good Post");
		Comment comment2 = new Comment("Helpfull Post");
		Comment comment3 = new Comment("Awsome Post");
		
		post.getComments().add(comment);
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		
		this.postRepository.save(post);
	}*/

}
