package ru.learnup.homework24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.learnup.homework24.db.dao.AuthorDao;
import ru.learnup.homework24.db.entity.Author;

@SpringBootApplication
public class Homework24Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Homework24Application.class, args);
		AuthorDao authorDao = context.getBean(AuthorDao.class);
		Author author = new Author("Mark", "Tven");
		authorDao.save(author);
		Author author1 = authorDao.findById(1);
		System.out.println(author1);

	}
}
