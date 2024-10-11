package exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import aaa.Article;

public class Main {
	static int num = 0;
	static List<Article> articles = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Article> articles = new ArrayList<>();
		System.out.println("프로그램 시작");
		
		makeTestData();
		while(true) {
			System.out.print("명령어를 입력해주세요 : ");
			String cmd = sc.nextLine();
			
			if(cmd.equals("exit")) {
				break;
			}
			
			else if(cmd.equals("article write")) {
				System.out.print("제목 : ");
				String title = sc.nextLine();
				System.out.print("내용 : ");
				String body = sc.nextLine();
				num++;
				
				Article article = new Article(num, title, body);
				Article.add(article);
				System.out.printf("%번 게시물이 작성되었습니다. ", num);
			}
			else if(cmd.startsWith("article detail ")) {
				int id = 0;
				
				String CmdNum = null;
				
				
				
				
			}
			else if(cmd.startsWith("article modify ")) {
				
			}
			
			else if(cmd.startsWith("article delete ")) {
				int id = 0;
				
				article.remove();
				
			}
			
			else if(cmd.startsWith("article list")) {
				List<Article> article;
				
				if (article.size() == 0) {
					System.out.println("게시글이 없습니다.");
				}
				
				String foundArticle = cmd.substring(13).trim();
				Article printArticle;
				
				for(Article article : articles) {
					if(article.contain(foundArticle)) {
						
					}
				}
				System.out.println("번호	| 	제목");
				for (int i = 0 ; i>= num ; i--) {
					System.out.printf("%d,		| %s	", num);					
				}
			}
			else {
				System.out.println("잘못된 명령어입니다.");
			}
		}
		sc.close();
		 
		System.out.println("프로그램 종료");
	}
	
	
	private static Article getArticleById(int id) {
		for (Article article : articles) {
			if (article.getId() == id) {
				return article;
			}
		}
		return null;
	}

	private static int getCmdNum(String cmd) {
		String[] cmdBits = cmd.split(" ");

		int id = 0;

		try {
			id = Integer.parseInt(cmdBits[2]);
		} catch (Exception e) {
			return 0;
		}
		return id;

	}

	private static void makeTestData() {
		for (int i = 1; i <= 3; i++) {
			articles.add(new Article(++num, "Title" + i, "Body" + i));
		}
	}
}
